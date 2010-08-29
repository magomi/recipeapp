/*
 * An XML document type.
 * Localname: menu
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.MenuDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one menu(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface MenuDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MenuDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("menua162doctype");
    
    /**
     * Gets the "menu" element
     */
    org.codefromhell.cookml.MenuDocument.Menu getMenu();
    
    /**
     * Sets the "menu" element
     */
    void setMenu(org.codefromhell.cookml.MenuDocument.Menu menu);
    
    /**
     * Appends and returns a new empty "menu" element
     */
    org.codefromhell.cookml.MenuDocument.Menu addNewMenu();
    
    /**
     * An XML menu(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Menu extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Menu.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("menu5f1delemtype");
        
        /**
         * Gets array of all "mcustom" elements
         */
        org.codefromhell.cookml.McustomDocument.Mcustom[] getMcustomArray();
        
        /**
         * Gets ith "mcustom" element
         */
        org.codefromhell.cookml.McustomDocument.Mcustom getMcustomArray(int i);
        
        /**
         * Returns number of "mcustom" element
         */
        int sizeOfMcustomArray();
        
        /**
         * Sets array of all "mcustom" element
         */
        void setMcustomArray(org.codefromhell.cookml.McustomDocument.Mcustom[] mcustomArray);
        
        /**
         * Sets ith "mcustom" element
         */
        void setMcustomArray(int i, org.codefromhell.cookml.McustomDocument.Mcustom mcustom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mcustom" element
         */
        org.codefromhell.cookml.McustomDocument.Mcustom insertNewMcustom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mcustom" element
         */
        org.codefromhell.cookml.McustomDocument.Mcustom addNewMcustom();
        
        /**
         * Removes the ith "mcustom" element
         */
        void removeMcustom(int i);
        
        /**
         * Gets array of all "mrecipe" elements
         */
        org.codefromhell.cookml.MrecipeDocument.Mrecipe[] getMrecipeArray();
        
        /**
         * Gets ith "mrecipe" element
         */
        org.codefromhell.cookml.MrecipeDocument.Mrecipe getMrecipeArray(int i);
        
        /**
         * Returns number of "mrecipe" element
         */
        int sizeOfMrecipeArray();
        
        /**
         * Sets array of all "mrecipe" element
         */
        void setMrecipeArray(org.codefromhell.cookml.MrecipeDocument.Mrecipe[] mrecipeArray);
        
        /**
         * Sets ith "mrecipe" element
         */
        void setMrecipeArray(int i, org.codefromhell.cookml.MrecipeDocument.Mrecipe mrecipe);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mrecipe" element
         */
        org.codefromhell.cookml.MrecipeDocument.Mrecipe insertNewMrecipe(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mrecipe" element
         */
        org.codefromhell.cookml.MrecipeDocument.Mrecipe addNewMrecipe();
        
        /**
         * Removes the ith "mrecipe" element
         */
        void removeMrecipe(int i);
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.MenuDocument.Menu newInstance() {
              return (org.codefromhell.cookml.MenuDocument.Menu) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.MenuDocument.Menu newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.MenuDocument.Menu) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.MenuDocument newInstance() {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.MenuDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.MenuDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.MenuDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.MenuDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.MenuDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
