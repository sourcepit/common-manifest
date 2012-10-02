/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.sourcepit.common.manifest.HeaderName.MAIN_CLASS;
import static org.sourcepit.common.manifest.HeaderName.MANIFEST_VERSION;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd
 */
public class ManifestTest
{

   @Test
   public void testNew()
   {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      assertThat(manifest.getHeaderValue(MANIFEST_VERSION), IsEqual.equalTo("1.0"));
   }

   @Test
   public void testHeaderOperations()
   {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.setHeader(MAIN_CLASS, "foo");

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.setHeader(MAIN_CLASS, null);

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.getHeaders().put(MAIN_CLASS.getLiteral(), "foo");

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());
   }

   @Test
   public void testNames() throws Exception
   {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      
      manifest.getHeaders().put("good", "name");
      
      try
      {
         manifest.getHeaders().put("bäd", "name");
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }
   }


}
