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

package org.sourcepit.common.manifest.osgi.parser;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;

public class CommenTokenStream2 extends CommonTokenStream
{
   private boolean skip = true;

   public CommenTokenStream2(TokenSource tokenSource, int channel)
   {
      super(tokenSource, channel);
   }

   public CommenTokenStream2(TokenSource tokenSource)
   {
      super(tokenSource);
   }

   public void setSkip(boolean skip)
   {
      this.skip = skip;
   }

   public boolean isSkip()
   {
      return skip;
   }

   @Override
   public void consume()
   {
      if (p == -1)
      {
         setup();
      }
      p++;
      sync(p);

      if (skip)
      {
         while (tokens.get(p).getChannel() != channel)
         {
            p++;
            sync(p);
         }
      }
   }

   @Override
   protected int skipOffTokenChannels(int i)
   {
      if (skip)
      {
         return super.skipOffTokenChannels(i);
      }
      sync(i);
      return i;
   }

   @Override
   protected int skipOffTokenChannelsReverse(int i)
   {
      if (skip)
      {
         return super.skipOffTokenChannelsReverse(i);
      }
      return i;
   }
}
