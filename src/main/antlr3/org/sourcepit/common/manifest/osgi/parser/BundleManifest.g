grammar BundleManifest;

options {
  //  backtrack = true;
  language = Java;
}

@header {
package org.sourcepit.common.manifest.osgi.parser;
import org.sourcepit.common.manifest.osgi.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.apache.commons.lang.StringEscapeUtils;
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
}

@rulecatch {
catch (RecognitionException ex) {
    throw ex;
}
}

activationPolicy returns [BundleActivationPolicy p]
  :
  
   {
    p = BundleManifestFactory.eINSTANCE.createBundleActivationPolicy();
   }
  (
    'lazy' 
           {
            p.setPolicy(ActivationPolicy.LAZY);
           }
    | 'eager' 
              {
               p.setPolicy(ActivationPolicy.EAGER);
              }
  )
  (';' d=directive 
                   {
                    p.getParameters().add(d);
                   })* EOF
  ;

symbolicName returns [BundleSymbolicName n]
  :
  
   {
    n = BundleManifestFactory.eINSTANCE.createBundleSymbolicName();
   }
  id=IDENTIFIER 
                {
                 n.setSymbolicName($id.text);
                }
  (';' p=parameter 
                   {
                    n.getParameters().add(p);
                   })* EOF
  ;

fragmentHost returns [FragmentHost n]
  :
  
   {
    n = BundleManifestFactory.eINSTANCE.createFragmentHost();
   }
  id=IDENTIFIER 
                {
                 n.setSymbolicName($id.text);
                }
  (';' p=parameter 
                   {
                    n.getParameters().add(p);
                   })* EOF
  ;

exportPackage returns [EList < PackageExport > list]
  :
  
   {
    list = new BasicEList<PackageExport>();
    
    PackageExport p = BundleManifestFactory.eINSTANCE.createPackageExport();
   }
  packagesDeclaration[p] 
                         {
                          $list.add(p);
                         }
  (',' 
       {
        p = BundleManifestFactory.eINSTANCE.createPackageExport();
       }
    packagesDeclaration[p] 
                           {
                            $list.add(p);
                           })* EOF
  ;

importPackage returns [EList < PackageImport > list]
  :
  
   {
    list = new BasicEList<PackageImport>();
    
    PackageImport p = BundleManifestFactory.eINSTANCE.createPackageImport();
   }
  packagesDeclaration[p] 
                         {
                          $list.add(p);
                         }
  (',' 
       {
        p = BundleManifestFactory.eINSTANCE.createPackageImport();
       }
    packagesDeclaration[p] 
                           {
                            $list.add(p);
                           })* EOF
  ;
  
dynamicImportPackage returns [EList < DynamicPackageImport > list]
  :
  
   {
    list = new BasicEList<DynamicPackageImport>();
    
    DynamicPackageImport p = BundleManifestFactory.eINSTANCE.createDynamicPackageImport();
   }
  packagesDeclaration[p] 
                         {
                          $list.add(p);
                         }
  (',' 
       {
        p = BundleManifestFactory.eINSTANCE.createDynamicPackageImport();
       }
    packagesDeclaration[p] 
                           {
                            $list.add(p);
                           })* EOF
  ;

packagesDeclaration[PackagesDeclaration p]
  :
  pn=packageName 
                 {
                  $p.getPackageNames().add(pn);
                 }
  (';' pn2=packageName 
                       {
                        $p.getPackageNames().add(pn2);
                       })* (';' pa=parameter 
                                             {
                                              $p.getParameters().add(pa);
                                             })*
  ;

packageName returns [String p]
@init {
final StringBuilder sb = new StringBuilder();
}
  :
  id1=IDENTIFIER 
                 {
                  sb.append($id1.text);
                 }
  //  (i='.' id2=IDENTIFIER
  //                        {
  //                         sb.append($i.text);
  //                         sb.append($id2.text);
  //                        })*
  
   {
    $p = sb.toString();
   }
  ;

requireBundle returns [EList < BundleRequirement > list]
  :
  
   {
    list = new BasicEList<BundleRequirement>();
    
    BundleRequirement r = BundleManifestFactory.eINSTANCE.createBundleRequirement();
   }
  bundleRequirement[r] 
                       {
                        $list.add(r);
                       }
  (',' 
       {
        r = BundleManifestFactory.eINSTANCE.createBundleRequirement();
       }
    bundleRequirement[r] 
                         {
                          $list.add(r);
                         })* EOF
  ;

bundleRequirement[BundleRequirement r]
  :
  pn=packageName 
                 {
                  $r.getSymbolicNames().add(pn);
                 }
  (';' pn2=packageName 
                       {
                        $r.getSymbolicNames().add(pn2);
                       })* (';' pa=parameter 
                                             {
                                              $r.getParameters().add(pa);
                                             })*
  ;

classPath returns [EList < ClassPathEntry > list]
  :
  
   {
    list = new BasicEList<ClassPathEntry>();
   }
  e=classPathEntry 
                   {
                    list.add(e);
                   }
  (',' e2=classPathEntry 
                         {
                          list.add(e2);
                         })* EOF
  ;

classPathEntry returns [ClassPathEntry e]
  :
  
   {
    e = BundleManifestFactory.eINSTANCE.createClassPathEntry();
   }
  id=IDENTIFIER 
                {
                 e.getPaths().add($id.text);
                }
  (';' id2=IDENTIFIER 
                      {
                       e.getPaths().add($id2.text);
                      })* (';' p=parameter 
                                           {
                                            e.getParameters().add(p);
                                           })*
  ;

parameter returns [Parameter p]
  :
  (
    d=directive 
                {
                 p = d;
                }
    | a=attribute 
                  {
                   p = a;
                  }
  )
  ;

directive returns [Parameter p]
  :
  
   {
    $p = BundleManifestFactory.eINSTANCE.createParameter();
    $p.setType(ParameterType.DIRECTIVE);
   }
  n=name 
         {
          $p.setName(n);
         }
  ':=' value[p]
  ;

attribute returns [Parameter p]
  :
  
   {
    $p = BundleManifestFactory.eINSTANCE.createParameter();
    $p.setType(ParameterType.ATTRIBUTE);
   }
  n=name 
         {
          $p.setName(n);
         }
  '=' value[p]
  ;

name returns [String name]
  :
  IDENTIFIER 
             {
              name = $IDENTIFIER.text;
             }
  ;

value[Parameter p]
  :
  IDENTIFIER 
             {
              $p.setValue($IDENTIFIER.text);
             }
  | QUOTED_STRING 
                  {
                   $p.setQuoted(true);
                   String text = $QUOTED_STRING.text;
                   text = text.substring(1, text.length() - 1);
                   $p.setValue(StringEscapeUtils.unescapeJava(text));
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
  | 'A' 'Z'
  ;

fragment
ALPHANUM
  :
  ALPHA
  | DIGIT
  ;

QUOTED_STRING
  :
  '"'
  (
    EscapeSequence
    |
    ~(
      '\u0000'..'\u001f'
      | '\\'
      | '\"'
     )
  )*
  '"'
  ;

WS
  :
  (
    ' '
    | '\n'
    | '\r'
    | '\t'
  )+
  
   {
    $channel = HIDDEN;
   }
  ;

fragment
EscapeSequence
  :
  '\\'
  (
    UnicodeEscape
    | 'b'
    | 't'
    | 'n'
    | 'f'
    | 'r'
    | '\"'
    | '\''
    | '\\'
  )
  ;

fragment
UnicodeEscape
  :
  'u' HexDigit HexDigit HexDigit HexDigit
  ;

fragment
HexDigit
  :
  '0'..'9'
  | 'A'..'F'
  | 'a'..'f'
  ;

IDENTIFIER
  :
  (
    ~(
      ' '
      | '\n'
      | '\r'
      | '\t'
      | '"'
      | ';'
      | ','
      | '='
      | ':'
     )
  )+
  ;
