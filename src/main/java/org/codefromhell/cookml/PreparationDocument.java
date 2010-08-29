/*
 * An XML document type.
 * Localname: preparation
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PreparationDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one preparation(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface PreparationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PreparationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("preparation2d7cdoctype");
    
    /**
     * Gets the "preparation" element
     */
    org.codefromhell.cookml.PreparationDocument.Preparation getPreparation();
    
    /**
     * Sets the "preparation" element
     */
    void setPreparation(org.codefromhell.cookml.PreparationDocument.Preparation preparation);
    
    /**
     * Appends and returns a new empty "preparation" element
     */
    org.codefromhell.cookml.PreparationDocument.Preparation addNewPreparation();
    
    /**
     * An XML preparation(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Preparation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Preparation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("preparatione759elemtype");
        
        /**
         * Gets array of all "text" elements
         */
        java.lang.String[] getTextArray();
        
        /**
         * Gets ith "text" element
         */
        java.lang.String getTextArray(int i);
        
        /**
         * Gets (as xml) array of all "text" elements
         */
        org.apache.xmlbeans.XmlString[] xgetTextArray();
        
        /**
         * Gets (as xml) ith "text" element
         */
        org.apache.xmlbeans.XmlString xgetTextArray(int i);
        
        /**
         * Returns number of "text" element
         */
        int sizeOfTextArray();
        
        /**
         * Sets array of all "text" element
         */
        void setTextArray(java.lang.String[] textArray);
        
        /**
         * Sets ith "text" element
         */
        void setTextArray(int i, java.lang.String text);
        
        /**
         * Sets (as xml) array of all "text" element
         */
        void xsetTextArray(org.apache.xmlbeans.XmlString[] textArray);
        
        /**
         * Sets (as xml) ith "text" element
         */
        void xsetTextArray(int i, org.apache.xmlbeans.XmlString text);
        
        /**
         * Inserts the value as the ith "text" element
         */
        void insertText(int i, java.lang.String text);
        
        /**
         * Appends the value as the last "text" element
         */
        void addText(java.lang.String text);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "text" element
         */
        org.apache.xmlbeans.XmlString insertNewText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "text" element
         */
        org.apache.xmlbeans.XmlString addNewText();
        
        /**
         * Removes the ith "text" element
         */
        void removeText(int i);
        
        /**
         * Gets array of all "step" elements
         */
        java.lang.String[] getStepArray();
        
        /**
         * Gets ith "step" element
         */
        java.lang.String getStepArray(int i);
        
        /**
         * Gets (as xml) array of all "step" elements
         */
        org.apache.xmlbeans.XmlString[] xgetStepArray();
        
        /**
         * Gets (as xml) ith "step" element
         */
        org.apache.xmlbeans.XmlString xgetStepArray(int i);
        
        /**
         * Returns number of "step" element
         */
        int sizeOfStepArray();
        
        /**
         * Sets array of all "step" element
         */
        void setStepArray(java.lang.String[] stepArray);
        
        /**
         * Sets ith "step" element
         */
        void setStepArray(int i, java.lang.String step);
        
        /**
         * Sets (as xml) array of all "step" element
         */
        void xsetStepArray(org.apache.xmlbeans.XmlString[] stepArray);
        
        /**
         * Sets (as xml) ith "step" element
         */
        void xsetStepArray(int i, org.apache.xmlbeans.XmlString step);
        
        /**
         * Inserts the value as the ith "step" element
         */
        void insertStep(int i, java.lang.String step);
        
        /**
         * Appends the value as the last "step" element
         */
        void addStep(java.lang.String step);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "step" element
         */
        org.apache.xmlbeans.XmlString insertNewStep(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "step" element
         */
        org.apache.xmlbeans.XmlString addNewStep();
        
        /**
         * Removes the ith "step" element
         */
        void removeStep(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.PreparationDocument.Preparation newInstance() {
              return (org.codefromhell.cookml.PreparationDocument.Preparation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.PreparationDocument.Preparation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.PreparationDocument.Preparation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.PreparationDocument newInstance() {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.PreparationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.PreparationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PreparationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.PreparationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.PreparationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
