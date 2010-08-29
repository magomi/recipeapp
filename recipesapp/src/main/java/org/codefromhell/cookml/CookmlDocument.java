/*
 * An XML document type.
 * Localname: cookml
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.CookmlDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one cookml(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface CookmlDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CookmlDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("cookml5d1adoctype");
    
    /**
     * Gets the "cookml" element
     */
    org.codefromhell.cookml.CookmlDocument.Cookml getCookml();
    
    /**
     * Sets the "cookml" element
     */
    void setCookml(org.codefromhell.cookml.CookmlDocument.Cookml cookml);
    
    /**
     * Appends and returns a new empty "cookml" element
     */
    org.codefromhell.cookml.CookmlDocument.Cookml addNewCookml();
    
    /**
     * An XML cookml(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Cookml extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cookml.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("cookml9f9delemtype");
        
        /**
         * Gets array of all "recipe" elements
         */
        org.codefromhell.cookml.RecipeDocument.Recipe[] getRecipeArray();
        
        /**
         * Gets ith "recipe" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe getRecipeArray(int i);
        
        /**
         * Returns number of "recipe" element
         */
        int sizeOfRecipeArray();
        
        /**
         * Sets array of all "recipe" element
         */
        void setRecipeArray(org.codefromhell.cookml.RecipeDocument.Recipe[] recipeArray);
        
        /**
         * Sets ith "recipe" element
         */
        void setRecipeArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe recipe);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recipe" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe insertNewRecipe(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recipe" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe addNewRecipe();
        
        /**
         * Removes the ith "recipe" element
         */
        void removeRecipe(int i);
        
        /**
         * Gets array of all "menu" elements
         */
        org.codefromhell.cookml.MenuDocument.Menu[] getMenuArray();
        
        /**
         * Gets ith "menu" element
         */
        org.codefromhell.cookml.MenuDocument.Menu getMenuArray(int i);
        
        /**
         * Returns number of "menu" element
         */
        int sizeOfMenuArray();
        
        /**
         * Sets array of all "menu" element
         */
        void setMenuArray(org.codefromhell.cookml.MenuDocument.Menu[] menuArray);
        
        /**
         * Sets ith "menu" element
         */
        void setMenuArray(int i, org.codefromhell.cookml.MenuDocument.Menu menu);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menu" element
         */
        org.codefromhell.cookml.MenuDocument.Menu insertNewMenu(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menu" element
         */
        org.codefromhell.cookml.MenuDocument.Menu addNewMenu();
        
        /**
         * Removes the ith "menu" element
         */
        void removeMenu(int i);
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "prog" attribute
         */
        java.lang.String getProg();
        
        /**
         * Gets (as xml) the "prog" attribute
         */
        org.apache.xmlbeans.XmlString xgetProg();
        
        /**
         * Sets the "prog" attribute
         */
        void setProg(java.lang.String prog);
        
        /**
         * Sets (as xml) the "prog" attribute
         */
        void xsetProg(org.apache.xmlbeans.XmlString prog);
        
        /**
         * Gets the "progver" attribute
         */
        java.lang.String getProgver();
        
        /**
         * Gets (as xml) the "progver" attribute
         */
        org.apache.xmlbeans.XmlString xgetProgver();
        
        /**
         * Sets the "progver" attribute
         */
        void setProgver(java.lang.String progver);
        
        /**
         * Sets (as xml) the "progver" attribute
         */
        void xsetProgver(org.apache.xmlbeans.XmlString progver);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.CookmlDocument.Cookml newInstance() {
              return (org.codefromhell.cookml.CookmlDocument.Cookml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.CookmlDocument.Cookml newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.CookmlDocument.Cookml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.CookmlDocument newInstance() {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.CookmlDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.CookmlDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.CookmlDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.CookmlDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.CookmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
