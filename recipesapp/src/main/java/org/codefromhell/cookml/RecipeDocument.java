/*
 * An XML document type.
 * Localname: recipe
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.RecipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one recipe(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface RecipeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecipeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("recipe7d93doctype");
    
    /**
     * Gets the "recipe" element
     */
    org.codefromhell.cookml.RecipeDocument.Recipe getRecipe();
    
    /**
     * Sets the "recipe" element
     */
    void setRecipe(org.codefromhell.cookml.RecipeDocument.Recipe recipe);
    
    /**
     * Appends and returns a new empty "recipe" element
     */
    org.codefromhell.cookml.RecipeDocument.Recipe addNewRecipe();
    
    /**
     * An XML recipe(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Recipe extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Recipe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("recipe17bdelemtype");
        
        /**
         * Gets array of all "head" elements
         */
        org.codefromhell.cookml.HeadDocument.Head[] getHeadArray();
        
        /**
         * Gets ith "head" element
         */
        org.codefromhell.cookml.HeadDocument.Head getHeadArray(int i);
        
        /**
         * Returns number of "head" element
         */
        int sizeOfHeadArray();
        
        /**
         * Sets array of all "head" element
         */
        void setHeadArray(org.codefromhell.cookml.HeadDocument.Head[] headArray);
        
        /**
         * Sets ith "head" element
         */
        void setHeadArray(int i, org.codefromhell.cookml.HeadDocument.Head head);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "head" element
         */
        org.codefromhell.cookml.HeadDocument.Head insertNewHead(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "head" element
         */
        org.codefromhell.cookml.HeadDocument.Head addNewHead();
        
        /**
         * Removes the ith "head" element
         */
        void removeHead(int i);
        
        /**
         * Gets array of all "custom" elements
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Custom[] getCustomArray();
        
        /**
         * Gets ith "custom" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Custom getCustomArray(int i);
        
        /**
         * Returns number of "custom" element
         */
        int sizeOfCustomArray();
        
        /**
         * Sets array of all "custom" element
         */
        void setCustomArray(org.codefromhell.cookml.RecipeDocument.Recipe.Custom[] customArray);
        
        /**
         * Sets ith "custom" element
         */
        void setCustomArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe.Custom custom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "custom" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Custom insertNewCustom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "custom" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Custom addNewCustom();
        
        /**
         * Removes the ith "custom" element
         */
        void removeCustom(int i);
        
        /**
         * Gets array of all "part" elements
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Part[] getPartArray();
        
        /**
         * Gets ith "part" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Part getPartArray(int i);
        
        /**
         * Returns number of "part" element
         */
        int sizeOfPartArray();
        
        /**
         * Sets array of all "part" element
         */
        void setPartArray(org.codefromhell.cookml.RecipeDocument.Recipe.Part[] partArray);
        
        /**
         * Sets ith "part" element
         */
        void setPartArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe.Part part);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "part" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Part insertNewPart(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "part" element
         */
        org.codefromhell.cookml.RecipeDocument.Recipe.Part addNewPart();
        
        /**
         * Removes the ith "part" element
         */
        void removePart(int i);
        
        /**
         * Gets array of all "preparation" elements
         */
        org.codefromhell.cookml.PreparationDocument.Preparation[] getPreparationArray();
        
        /**
         * Gets ith "preparation" element
         */
        org.codefromhell.cookml.PreparationDocument.Preparation getPreparationArray(int i);
        
        /**
         * Returns number of "preparation" element
         */
        int sizeOfPreparationArray();
        
        /**
         * Sets array of all "preparation" element
         */
        void setPreparationArray(org.codefromhell.cookml.PreparationDocument.Preparation[] preparationArray);
        
        /**
         * Sets ith "preparation" element
         */
        void setPreparationArray(int i, org.codefromhell.cookml.PreparationDocument.Preparation preparation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "preparation" element
         */
        org.codefromhell.cookml.PreparationDocument.Preparation insertNewPreparation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "preparation" element
         */
        org.codefromhell.cookml.PreparationDocument.Preparation addNewPreparation();
        
        /**
         * Removes the ith "preparation" element
         */
        void removePreparation(int i);
        
        /**
         * Gets array of all "remark" elements
         */
        org.codefromhell.cookml.RemarkDocument.Remark[] getRemarkArray();
        
        /**
         * Gets ith "remark" element
         */
        org.codefromhell.cookml.RemarkDocument.Remark getRemarkArray(int i);
        
        /**
         * Returns number of "remark" element
         */
        int sizeOfRemarkArray();
        
        /**
         * Sets array of all "remark" element
         */
        void setRemarkArray(org.codefromhell.cookml.RemarkDocument.Remark[] remarkArray);
        
        /**
         * Sets ith "remark" element
         */
        void setRemarkArray(int i, org.codefromhell.cookml.RemarkDocument.Remark remark);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "remark" element
         */
        org.codefromhell.cookml.RemarkDocument.Remark insertNewRemark(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "remark" element
         */
        org.codefromhell.cookml.RemarkDocument.Remark addNewRemark();
        
        /**
         * Removes the ith "remark" element
         */
        void removeRemark(int i);
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
        
        /**
         * An XML custom(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public interface Custom extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Custom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("custom0550elemtype");
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "datatype" attribute
             */
            java.lang.String getDatatype();
            
            /**
             * Gets (as xml) the "datatype" attribute
             */
            org.apache.xmlbeans.XmlString xgetDatatype();
            
            /**
             * Sets the "datatype" attribute
             */
            void setDatatype(java.lang.String datatype);
            
            /**
             * Sets (as xml) the "datatype" attribute
             */
            void xsetDatatype(org.apache.xmlbeans.XmlString datatype);
            
            /**
             * Gets the "value" attribute
             */
            java.lang.String getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            org.apache.xmlbeans.XmlString xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(java.lang.String value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(org.apache.xmlbeans.XmlString value);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.codefromhell.cookml.RecipeDocument.Recipe.Custom newInstance() {
                  return (org.codefromhell.cookml.RecipeDocument.Recipe.Custom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.codefromhell.cookml.RecipeDocument.Recipe.Custom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.codefromhell.cookml.RecipeDocument.Recipe.Custom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML part(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public interface Part extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Part.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("part830eelemtype");
            
            /**
             * Gets array of all "ingredient" elements
             */
            org.codefromhell.cookml.IngredientDocument.Ingredient[] getIngredientArray();
            
            /**
             * Gets ith "ingredient" element
             */
            org.codefromhell.cookml.IngredientDocument.Ingredient getIngredientArray(int i);
            
            /**
             * Returns number of "ingredient" element
             */
            int sizeOfIngredientArray();
            
            /**
             * Sets array of all "ingredient" element
             */
            void setIngredientArray(org.codefromhell.cookml.IngredientDocument.Ingredient[] ingredientArray);
            
            /**
             * Sets ith "ingredient" element
             */
            void setIngredientArray(int i, org.codefromhell.cookml.IngredientDocument.Ingredient ingredient);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ingredient" element
             */
            org.codefromhell.cookml.IngredientDocument.Ingredient insertNewIngredient(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ingredient" element
             */
            org.codefromhell.cookml.IngredientDocument.Ingredient addNewIngredient();
            
            /**
             * Removes the ith "ingredient" element
             */
            void removeIngredient(int i);
            
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
                public static org.codefromhell.cookml.RecipeDocument.Recipe.Part newInstance() {
                  return (org.codefromhell.cookml.RecipeDocument.Recipe.Part) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.codefromhell.cookml.RecipeDocument.Recipe.Part newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.codefromhell.cookml.RecipeDocument.Recipe.Part) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.RecipeDocument.Recipe newInstance() {
              return (org.codefromhell.cookml.RecipeDocument.Recipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.RecipeDocument.Recipe newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.RecipeDocument.Recipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.RecipeDocument newInstance() {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.RecipeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.RecipeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.RecipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.RecipeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.RecipeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
