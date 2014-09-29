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

package org.sourcepit.common.manifest.osgi.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.sourcepit.common.manifest.merge.BytesByLine;
import org.sourcepit.common.manifest.osgi.parser.GenericManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.resource.ManifestResourceImpl;

/**
 * @author Bernd
 */
public class GenericManifestResourceImpl extends ManifestResourceImpl
{
   public GenericManifestResourceImpl()
   {
      super();
   }

   public GenericManifestResourceImpl(BytesByLine bytesByLine)
   {
      super(bytesByLine);
   }

   public GenericManifestResourceImpl(URI uri)
   {
      super(uri);
   }

   public GenericManifestResourceImpl(URI uri, BytesByLine bytesByLine)
   {
      super(uri, bytesByLine);
   }

   @Override
   protected ManifestBuilder createManifestBuilder(Map<?, ?> options)
   {
      return new GenericManifestBuilder(options);
   }
}
