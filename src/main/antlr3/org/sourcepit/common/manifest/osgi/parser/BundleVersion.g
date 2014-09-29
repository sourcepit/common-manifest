/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
grammar BundleVersion;

options {
  language = Java;
}

@header {
package org.sourcepit.common.manifest.osgi.parser;
import org.sourcepit.common.manifest.osgi.*;
import java.lang.String;
}

@lexer::header {
package org.sourcepit.common.manifest.osgi.parser;
}

@members {
@Override
protected Object recoverFromMismatchedToken(IntStream input, int ttype,
		BitSet follow) throws RecognitionException {
	throw new MismatchedTokenException(ttype, input);
}

@Override
public Object recoverFromMismatchedSet(IntStream input, RecognitionException e,
		BitSet follow) throws RecognitionException {
	throw e;
}

private int valueOf(String value) {
	return value == null ? 0 : Integer.valueOf(value);
}
}

@rulecatch {
catch (RecognitionException e) {
    throw e;
}
}

@lexer::members {
@Override
public void reportError(RecognitionException e) {
	String hdr = getErrorHeader(e);
	String msg = getErrorMessage(e, getTokenNames());
	throw new IllegalArgumentException(hdr + " " + msg, e);
}
}

versionRange returns [VersionRange r]
  :
  r1=interval 
              {
               r = r1;
              }
  | v=version 
              {
               r = new VersionRange(v, true, null, false);
              }
  ;

interval returns [VersionRange r]
@init {
boolean lowInclusive = false;
boolean highInclusive = false;
}
  :
  (
    '[' 
        {
         lowInclusive = true;
        }
    | '('
  )
  lv=version0? ',' hv=version0?
  (
    ']' 
        {
         highInclusive = true;
        }
    | ')'
  )
  EOF 
      {
       r = new VersionRange(lv == null ? Version.EMPTY_VERSION : lv, lowInclusive,
       		hv == null ? Version.EMPTY_VERSION : hv, highInclusive);
      }
  ;

version returns [Version v]
  :
  v_=version0 EOF 
              {
               v = v_;
              }
  ;

version0 returns [Version v]
@init {
int major = -1;
int minor = -1;
int micro = -1;
String qualifier = null;
}
  :
  maj=DIGITS 
             {
              major = valueOf($maj.text);
             }
  ('.' min=DIGITS 
                  {
                   minor = valueOf($min.text);
                  }
    ('.' mic=DIGITS 
                    {
                     micro = valueOf($mic.text);
                    }
      ('.' qual=qualifier 
                          {
                           qualifier = qual;
                          })?)?)? 
                                  {
                                   v = new Version(major, minor, micro, qualifier);
                                  }
  ;

qualifier returns [String q]
  :
  d=DIGITS 
           {
            q = String.valueOf($d.text);
           }
  | q1=QUALIFIER 
                 {
                  q = $q1.text;
                 }
  ;

fragment
DIGIT
  :
  '0'..'9'
  ;

fragment
ALPHA
  :
  'a'..'z'
  | 'A'..'Z'
  ;

fragment
ALPHANUM
  :
  ALPHA
  | DIGIT
  ;

DIGITS
  :
  (DIGIT)+
  ;

QUALIFIER
  :
  (
    ALPHANUM
    | '_'
    | '-'
  )+
  ;
