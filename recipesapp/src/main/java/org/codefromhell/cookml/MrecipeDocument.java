/*
 * An XML document type.
 * Localname: mrecipe
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.MrecipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one mrecipe(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface MrecipeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MrecipeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("mrecipe13d8doctype");
    
    /**
     * Gets the "mrecipe" element
     */
    org.codefromhell.cookml.MrecipeDocument.Mrecipe getMrecipe();
    
    /**
     * Sets the "mrecipe" element
     */
    void setMrecipe(org.codefromhell.cookml.MrecipeDocument.Mrecipe mrecipe);
    
    /**
     * Appends and returns a new empty "mrecipe" element
     */
    org.codefromhell.cookml.MrecipeDocument.Mrecipe addNewMrecipe();
    
    /**
     * An XML mrecipe(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Mrecipe extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mrecipe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("mrecipe0f11elemtype");
        
        /**
         * Gets the "desc" element
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" element
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * True if has "desc" element
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" element
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" element
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Unsets the "desc" element
         */
        void unsetDesc();
        
        /**
         * Gets the "rid" attribute
         */
        java.lang.String getRid();
        
        /**
         * Gets (as xml) the "rid" attribute
         */
        org.apache.xmlbeans.XmlString xgetRid();
        
        /**
         * Sets the "rid" attribute
         */
        void setRid(java.lang.String rid);
        
        /**
         * Sets (as xml) the "rid" attribute
         */
        void xsetRid(org.apache.xmlbeans.XmlString rid);
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "amount" attribute
         */
        float getAmount();
        
        /**
         * Gets (as xml) the "amount" attribute
         */
        org.apache.xmlbeans.XmlFloat xgetAmount();
        
        /**
         * True if has "amount" attribute
         */
        boolean isSetAmount();
        
        /**
         * Sets the "amount" attribute
         */
        void setAmount(float amount);
        
        /**
         * Sets (as xml) the "amount" attribute
         */
        void xsetAmount(org.apache.xmlbeans.XmlFloat amount);
        
        /**
         * Unsets the "amount" attribute
         */
        void unsetAmount();
        
        /**
         * Gets the "persons" attribute
         */
        long getPersons();
        
        /**
         * Gets (as xml) the "persons" attribute
         */
        org.apache.xmlbeans.XmlLong xgetPersons();
        
        /**
         * True if has "persons" attribute
         */
        boolean isSetPersons();
        
        /**
         * Sets the "persons" attribute
         */
        void setPersons(long persons);
        
        /**
         * Sets (as xml) the "persons" attribute
         */
        void xsetPersons(org.apache.xmlbeans.XmlLong persons);
        
        /**
         * Unsets the "persons" attribute
         */
        void unsetPersons();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.MrecipeDocument.Mrecipe newInstance() {
              return (org.codefromhell.cookml.MrecipeDocument.Mrecipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.MrecipeDocument.Mrecipe newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.MrecipeDocument.Mrecipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.MrecipeDocument newInstance() {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.MrecipeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.MrecipeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.MrecipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.MrecipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.MrecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
