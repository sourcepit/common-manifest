/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class FragmentHostTest
{

   @Test
   public void testSetBundleVersion()
   {
      FragmentHost fragmentHost = BundleManifestFactory.eINSTANCE.createFragmentHost();
      assertThat(fragmentHost.getBundleVersion(), IsNull.nullValue());
      assertThat(fragmentHost.getParameter("bundle-version"), IsNull.nullValue());

      fragmentHost.setBundleVersion(VersionRange.parse("1.2"));

      assertThat(fragmentHost.getBundleVersion(), IsEqual.equalTo(VersionRange.parse("1.2")));
      assertThat(fragmentHost.getParameter("bundle-version"), IsNull.notNullValue());

      fragmentHost.setBundleVersion(null);
      assertThat(fragmentHost.getBundleVersion(), IsNull.nullValue());
      assertThat(fragmentHost.getParameter("bundle-version"), IsNull.nullValue());
   }

}
