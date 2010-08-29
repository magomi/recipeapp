/*
 * An XML document type.
 * Localname: picture
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PictureDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one picture(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface PictureDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PictureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("picture6eb5doctype");
    
    /**
     * Gets the "picture" element
     */
    org.codefromhell.cookml.PictureDocument.Picture getPicture();
    
    /**
     * Sets the "picture" element
     */
    void setPicture(org.codefromhell.cookml.PictureDocument.Picture picture);
    
    /**
     * Appends and returns a new empty "picture" element
     */
    org.codefromhell.cookml.PictureDocument.Picture addNewPicture();
    
    /**
     * An XML picture(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Picture extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Picture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("picture948belemtype");
        
        /**
         * Gets the "file" attribute
         */
        java.lang.String getFile();
        
        /**
         * Gets (as xml) the "file" attribute
         */
        org.apache.xmlbeans.XmlString xgetFile();
        
        /**
         * Sets the "file" attribute
         */
        void setFile(java.lang.String file);
        
        /**
         * Sets (as xml) the "file" attribute
         */
        void xsetFile(org.apache.xmlbeans.XmlString file);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.PictureDocument.Picture newInstance() {
              return (org.codefromhell.cookml.PictureDocument.Picture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.PictureDocument.Picture newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.PictureDocument.Picture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.PictureDocument newInstance() {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.PictureDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.PictureDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.PictureDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PictureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PictureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
