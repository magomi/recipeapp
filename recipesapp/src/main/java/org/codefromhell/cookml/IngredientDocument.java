/*
 * An XML document type.
 * Localname: ingredient
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.IngredientDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one ingredient(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface IngredientDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IngredientDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("ingredientad70doctype");
    
    /**
     * Gets the "ingredient" element
     */
    org.codefromhell.cookml.IngredientDocument.Ingredient getIngredient();
    
    /**
     * Sets the "ingredient" element
     */
    void setIngredient(org.codefromhell.cookml.IngredientDocument.Ingredient ingredient);
    
    /**
     * Appends and returns a new empty "ingredient" element
     */
    org.codefromhell.cookml.IngredientDocument.Ingredient addNewIngredient();
    
    /**
     * An XML ingredient(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Ingredient extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ingredient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("ingredient1a5delemtype");
        
        /**
         * Gets array of all "inote" elements
         */
        java.lang.String[] getInoteArray();
        
        /**
         * Gets ith "inote" element
         */
        java.lang.String getInoteArray(int i);
        
        /**
         * Gets (as xml) array of all "inote" elements
         */
        org.apache.xmlbeans.XmlString[] xgetInoteArray();
        
        /**
         * Gets (as xml) ith "inote" element
         */
        org.apache.xmlbeans.XmlString xgetInoteArray(int i);
        
        /**
         * Returns number of "inote" element
         */
        int sizeOfInoteArray();
        
        /**
         * Sets array of all "inote" element
         */
        void setInoteArray(java.lang.String[] inoteArray);
        
        /**
         * Sets ith "inote" element
         */
        void setInoteArray(int i, java.lang.String inote);
        
        /**
         * Sets (as xml) array of all "inote" element
         */
        void xsetInoteArray(org.apache.xmlbeans.XmlString[] inoteArray);
        
        /**
         * Sets (as xml) ith "inote" element
         */
        void xsetInoteArray(int i, org.apache.xmlbeans.XmlString inote);
        
        /**
         * Inserts the value as the ith "inote" element
         */
        void insertInote(int i, java.lang.String inote);
        
        /**
         * Appends the value as the last "inote" element
         */
        void addInote(java.lang.String inote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "inote" element
         */
        org.apache.xmlbeans.XmlString insertNewInote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "inote" element
         */
        org.apache.xmlbeans.XmlString addNewInote();
        
        /**
         * Removes the ith "inote" element
         */
        void removeInote(int i);
        
        /**
         * Gets the "qty" attribute
         */
        float getQty();
        
        /**
         * Gets (as xml) the "qty" attribute
         */
        org.apache.xmlbeans.XmlFloat xgetQty();
        
        /**
         * True if has "qty" attribute
         */
        boolean isSetQty();
        
        /**
         * Sets the "qty" attribute
         */
        void setQty(float qty);
        
        /**
         * Sets (as xml) the "qty" attribute
         */
        void xsetQty(org.apache.xmlbeans.XmlFloat qty);
        
        /**
         * Unsets the "qty" attribute
         */
        void unsetQty();
        
        /**
         * Gets the "unit" attribute
         */
        java.lang.String getUnit();
        
        /**
         * Gets (as xml) the "unit" attribute
         */
        org.apache.xmlbeans.XmlString xgetUnit();
        
        /**
         * True if has "unit" attribute
         */
        boolean isSetUnit();
        
        /**
         * Sets the "unit" attribute
         */
        void setUnit(java.lang.String unit);
        
        /**
         * Sets (as xml) the "unit" attribute
         */
        void xsetUnit(org.apache.xmlbeans.XmlString unit);
        
        /**
         * Unsets the "unit" attribute
         */
        void unsetUnit();
        
        /**
         * Gets the "item" attribute
         */
        java.lang.String getItem();
        
        /**
         * Gets (as xml) the "item" attribute
         */
        org.apache.xmlbeans.XmlString xgetItem();
        
        /**
         * Sets the "item" attribute
         */
        void setItem(java.lang.String item);
        
        /**
         * Sets (as xml) the "item" attribute
         */
        void xsetItem(org.apache.xmlbeans.XmlString item);
        
        /**
         * Gets the "bls" attribute
         */
        java.lang.String getBls();
        
        /**
         * Gets (as xml) the "bls" attribute
         */
        org.apache.xmlbeans.XmlString xgetBls();
        
        /**
         * True if has "bls" attribute
         */
        boolean isSetBls();
        
        /**
         * Sets the "bls" attribute
         */
        void setBls(java.lang.String bls);
        
        /**
         * Sets (as xml) the "bls" attribute
         */
        void xsetBls(org.apache.xmlbeans.XmlString bls);
        
        /**
         * Unsets the "bls" attribute
         */
        void unsetBls();
        
        /**
         * Gets the "gram" attribute
         */
        java.math.BigInteger getGram();
        
        /**
         * Gets (as xml) the "gram" attribute
         */
        org.apache.xmlbeans.XmlUnsignedLong xgetGram();
        
        /**
         * True if has "gram" attribute
         */
        boolean isSetGram();
        
        /**
         * Sets the "gram" attribute
         */
        void setGram(java.math.BigInteger gram);
        
        /**
         * Sets (as xml) the "gram" attribute
         */
        void xsetGram(org.apache.xmlbeans.XmlUnsignedLong gram);
        
        /**
         * Unsets the "gram" attribute
         */
        void unsetGram();
        
        /**
         * Gets the "shop" attribute
         */
        boolean getShop();
        
        /**
         * Gets (as xml) the "shop" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetShop();
        
        /**
         * True if has "shop" attribute
         */
        boolean isSetShop();
        
        /**
         * Sets the "shop" attribute
         */
        void setShop(boolean shop);
        
        /**
         * Sets (as xml) the "shop" attribute
         */
        void xsetShop(org.apache.xmlbeans.XmlBoolean shop);
        
        /**
         * Unsets the "shop" attribute
         */
        void unsetShop();
        
        /**
         * Gets the "calc" attribute
         */
        boolean getCalc();
        
        /**
         * Gets (as xml) the "calc" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetCalc();
        
        /**
         * True if has "calc" attribute
         */
        boolean isSetCalc();
        
        /**
         * Sets the "calc" attribute
         */
        void setCalc(boolean calc);
        
        /**
         * Sets (as xml) the "calc" attribute
         */
        void xsetCalc(org.apache.xmlbeans.XmlBoolean calc);
        
        /**
         * Unsets the "calc" attribute
         */
        void unsetCalc();
        
        /**
         * Gets the "ridlink" attribute
         */
        java.lang.String getRidlink();
        
        /**
         * Gets (as xml) the "ridlink" attribute
         */
        org.apache.xmlbeans.XmlString xgetRidlink();
        
        /**
         * True if has "ridlink" attribute
         */
        boolean isSetRidlink();
        
        /**
         * Sets the "ridlink" attribute
         */
        void setRidlink(java.lang.String ridlink);
        
        /**
         * Sets (as xml) the "ridlink" attribute
         */
        void xsetRidlink(org.apache.xmlbeans.XmlString ridlink);
        
        /**
         * Unsets the "ridlink" attribute
         */
        void unsetRidlink();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.IngredientDocument.Ingredient newInstance() {
              return (org.codefromhell.cookml.IngredientDocument.Ingredient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.IngredientDocument.Ingredient newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.IngredientDocument.Ingredient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.IngredientDocument newInstance() {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.IngredientDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.IngredientDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.IngredientDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.IngredientDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.IngredientDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
