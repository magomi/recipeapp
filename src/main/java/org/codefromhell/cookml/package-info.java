/**
 * The cookml package contains generated helper classes to read and write
 * xsd compliant xml files using the xmlbeans toolset ({@link http://xmlbeans.apache.org/}).
 *
 * The maven project definition (pom.xml) contains the dependency and the plugin definition
 * for using the xmlbeans toolset. To (re-)generate the helper classes use the goal xmlbeans:xmlbeans.
 *
 * See ../../../xsd/cookml.xsd for the xml schema definition of the cookml microformate.
 *
 * To get further information about cookml please visit {@link http://www.kalorio.de/index.php?Mod=Ac&Cap=CE&SCa=../cml/CookML_EN}.
 *
 * <b>Currently the original xsd for the cookml schema made some problems with xmlbeans. Therefore a dedicated namespace
 * has been created (in the xsd) for all tags belonging directly to cookml.</b>
 *
 * @author Marco Grunert (magomi@gmail.com)
 */
package org.codefromhell.cookml;