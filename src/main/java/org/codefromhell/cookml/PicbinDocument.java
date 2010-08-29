/*
 * An XML document type.
 * Localname: picbin
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PicbinDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one picbin(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface PicbinDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PicbinDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("picbin7604doctype");
    
    /**
     * Gets the "picbin" element
     */
    org.codefromhell.cookml.PicbinDocument.Picbin getPicbin();
    
    /**
     * Sets the "picbin" element
     */
    void setPicbin(org.codefromhell.cookml.PicbinDocument.Picbin picbin);
    
    /**
     * Appends and returns a new empty "picbin" element
     */
    org.codefromhell.cookml.PicbinDocument.Picbin addNewPicbin();
    
    /**
     * An XML picbin(@http://codefromhell.org/cookml).
     *
     * This is an atomic type that is a restriction of org.codefromhell.cookml.PicbinDocument$Picbin.
     */
    public interface Picbin extends org.apache.xmlbeans.XmlBase64Binary
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Picbin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("picbin06ddelemtype");
        
        /**
         * Gets the "format" attribute
         */
        java.lang.String getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        org.apache.xmlbeans.XmlString xgetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(java.lang.String format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(org.apache.xmlbeans.XmlString format);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.PicbinDocument.Picbin newInstance() {
              return (org.codefromhell.cookml.PicbinDocument.Picbin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.PicbinDocument.Picbin newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.PicbinDocument.Picbin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.PicbinDocument newInstance() {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.PicbinDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.PicbinDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PicbinDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PicbinDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PicbinDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
