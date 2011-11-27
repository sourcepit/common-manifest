/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends PackagesDeclaration
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   VersionRange getVersionRange();

} // PackageImport
