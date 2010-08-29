/*
 * An XML document type.
 * Localname: head
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.HeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml;


/**
 * A document containing one head(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public interface HeadDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeadDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("head18c1doctype");
    
    /**
     * Gets the "head" element
     */
    org.codefromhell.cookml.HeadDocument.Head getHead();
    
    /**
     * Sets the "head" element
     */
    void setHead(org.codefromhell.cookml.HeadDocument.Head head);
    
    /**
     * Appends and returns a new empty "head" element
     */
    org.codefromhell.cookml.HeadDocument.Head addNewHead();
    
    /**
     * An XML head(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public interface Head extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Head.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("head263delemtype");
        
        /**
         * Gets array of all "cat" elements
         */
        java.lang.String[] getCatArray();
        
        /**
         * Gets ith "cat" element
         */
        java.lang.String getCatArray(int i);
        
        /**
         * Gets (as xml) array of all "cat" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCatArray();
        
        /**
         * Gets (as xml) ith "cat" element
         */
        org.apache.xmlbeans.XmlString xgetCatArray(int i);
        
        /**
         * Returns number of "cat" element
         */
        int sizeOfCatArray();
        
        /**
         * Sets array of all "cat" element
         */
        void setCatArray(java.lang.String[] catArray);
        
        /**
         * Sets ith "cat" element
         */
        void setCatArray(int i, java.lang.String cat);
        
        /**
         * Sets (as xml) array of all "cat" element
         */
        void xsetCatArray(org.apache.xmlbeans.XmlString[] catArray);
        
        /**
         * Sets (as xml) ith "cat" element
         */
        void xsetCatArray(int i, org.apache.xmlbeans.XmlString cat);
        
        /**
         * Inserts the value as the ith "cat" element
         */
        void insertCat(int i, java.lang.String cat);
        
        /**
         * Appends the value as the last "cat" element
         */
        void addCat(java.lang.String cat);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "cat" element
         */
        org.apache.xmlbeans.XmlString insertNewCat(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "cat" element
         */
        org.apache.xmlbeans.XmlString addNewCat();
        
        /**
         * Removes the ith "cat" element
         */
        void removeCat(int i);
        
        /**
         * Gets array of all "hint" elements
         */
        java.lang.String[] getHintArray();
        
        /**
         * Gets ith "hint" element
         */
        java.lang.String getHintArray(int i);
        
        /**
         * Gets (as xml) array of all "hint" elements
         */
        org.apache.xmlbeans.XmlString[] xgetHintArray();
        
        /**
         * Gets (as xml) ith "hint" element
         */
        org.apache.xmlbeans.XmlString xgetHintArray(int i);
        
        /**
         * Returns number of "hint" element
         */
        int sizeOfHintArray();
        
        /**
         * Sets array of all "hint" element
         */
        void setHintArray(java.lang.String[] hintArray);
        
        /**
         * Sets ith "hint" element
         */
        void setHintArray(int i, java.lang.String hint);
        
        /**
         * Sets (as xml) array of all "hint" element
         */
        void xsetHintArray(org.apache.xmlbeans.XmlString[] hintArray);
        
        /**
         * Sets (as xml) ith "hint" element
         */
        void xsetHintArray(int i, org.apache.xmlbeans.XmlString hint);
        
        /**
         * Inserts the value as the ith "hint" element
         */
        void insertHint(int i, java.lang.String hint);
        
        /**
         * Appends the value as the last "hint" element
         */
        void addHint(java.lang.String hint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hint" element
         */
        org.apache.xmlbeans.XmlString insertNewHint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hint" element
         */
        org.apache.xmlbeans.XmlString addNewHint();
        
        /**
         * Removes the ith "hint" element
         */
        void removeHint(int i);
        
        /**
         * Gets array of all "sourceline" elements
         */
        java.lang.String[] getSourcelineArray();
        
        /**
         * Gets ith "sourceline" element
         */
        java.lang.String getSourcelineArray(int i);
        
        /**
         * Gets (as xml) array of all "sourceline" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSourcelineArray();
        
        /**
         * Gets (as xml) ith "sourceline" element
         */
        org.apache.xmlbeans.XmlString xgetSourcelineArray(int i);
        
        /**
         * Returns number of "sourceline" element
         */
        int sizeOfSourcelineArray();
        
        /**
         * Sets array of all "sourceline" element
         */
        void setSourcelineArray(java.lang.String[] sourcelineArray);
        
        /**
         * Sets ith "sourceline" element
         */
        void setSourcelineArray(int i, java.lang.String sourceline);
        
        /**
         * Sets (as xml) array of all "sourceline" element
         */
        void xsetSourcelineArray(org.apache.xmlbeans.XmlString[] sourcelineArray);
        
        /**
         * Sets (as xml) ith "sourceline" element
         */
        void xsetSourcelineArray(int i, org.apache.xmlbeans.XmlString sourceline);
        
        /**
         * Inserts the value as the ith "sourceline" element
         */
        void insertSourceline(int i, java.lang.String sourceline);
        
        /**
         * Appends the value as the last "sourceline" element
         */
        void addSourceline(java.lang.String sourceline);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceline" element
         */
        org.apache.xmlbeans.XmlString insertNewSourceline(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceline" element
         */
        org.apache.xmlbeans.XmlString addNewSourceline();
        
        /**
         * Removes the ith "sourceline" element
         */
        void removeSourceline(int i);
        
        /**
         * Gets array of all "content" elements
         */
        org.codefromhell.cookml.HeadDocument.Head.Content[] getContentArray();
        
        /**
         * Gets ith "content" element
         */
        org.codefromhell.cookml.HeadDocument.Head.Content getContentArray(int i);
        
        /**
         * Returns number of "content" element
         */
        int sizeOfContentArray();
        
        /**
         * Sets array of all "content" element
         */
        void setContentArray(org.codefromhell.cookml.HeadDocument.Head.Content[] contentArray);
        
        /**
         * Sets ith "content" element
         */
        void setContentArray(int i, org.codefromhell.cookml.HeadDocument.Head.Content content);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "content" element
         */
        org.codefromhell.cookml.HeadDocument.Head.Content insertNewContent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "content" element
         */
        org.codefromhell.cookml.HeadDocument.Head.Content addNewContent();
        
        /**
         * Removes the ith "content" element
         */
        void removeContent(int i);
        
        /**
         * Gets array of all "picture" elements
         */
        org.codefromhell.cookml.PictureDocument.Picture[] getPictureArray();
        
        /**
         * Gets ith "picture" element
         */
        org.codefromhell.cookml.PictureDocument.Picture getPictureArray(int i);
        
        /**
         * Returns number of "picture" element
         */
        int sizeOfPictureArray();
        
        /**
         * Sets array of all "picture" element
         */
        void setPictureArray(org.codefromhell.cookml.PictureDocument.Picture[] pictureArray);
        
        /**
         * Sets ith "picture" element
         */
        void setPictureArray(int i, org.codefromhell.cookml.PictureDocument.Picture picture);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "picture" element
         */
        org.codefromhell.cookml.PictureDocument.Picture insertNewPicture(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "picture" element
         */
        org.codefromhell.cookml.PictureDocument.Picture addNewPicture();
        
        /**
         * Removes the ith "picture" element
         */
        void removePicture(int i);
        
        /**
         * Gets array of all "picbin" elements
         */
        org.codefromhell.cookml.PicbinDocument.Picbin[] getPicbinArray();
        
        /**
         * Gets ith "picbin" element
         */
        org.codefromhell.cookml.PicbinDocument.Picbin getPicbinArray(int i);
        
        /**
         * Returns number of "picbin" element
         */
        int sizeOfPicbinArray();
        
        /**
         * Sets array of all "picbin" element
         */
        void setPicbinArray(org.codefromhell.cookml.PicbinDocument.Picbin[] picbinArray);
        
        /**
         * Sets ith "picbin" element
         */
        void setPicbinArray(int i, org.codefromhell.cookml.PicbinDocument.Picbin picbin);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "picbin" element
         */
        org.codefromhell.cookml.PicbinDocument.Picbin insertNewPicbin(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "picbin" element
         */
        org.codefromhell.cookml.PicbinDocument.Picbin addNewPicbin();
        
        /**
         * Removes the ith "picbin" element
         */
        void removePicbin(int i);
        
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
         * Gets the "card" attribute
         */
        java.lang.String getCard();
        
        /**
         * Gets (as xml) the "card" attribute
         */
        org.apache.xmlbeans.XmlString xgetCard();
        
        /**
         * True if has "card" attribute
         */
        boolean isSetCard();
        
        /**
         * Sets the "card" attribute
         */
        void setCard(java.lang.String card);
        
        /**
         * Sets (as xml) the "card" attribute
         */
        void xsetCard(org.apache.xmlbeans.XmlString card);
        
        /**
         * Unsets the "card" attribute
         */
        void unsetCard();
        
        /**
         * Gets the "servingqty" attribute
         */
        float getServingqty();
        
        /**
         * Gets (as xml) the "servingqty" attribute
         */
        org.apache.xmlbeans.XmlFloat xgetServingqty();
        
        /**
         * Sets the "servingqty" attribute
         */
        void setServingqty(float servingqty);
        
        /**
         * Sets (as xml) the "servingqty" attribute
         */
        void xsetServingqty(org.apache.xmlbeans.XmlFloat servingqty);
        
        /**
         * Gets the "servingtype" attribute
         */
        java.lang.String getServingtype();
        
        /**
         * Gets (as xml) the "servingtype" attribute
         */
        org.apache.xmlbeans.XmlString xgetServingtype();
        
        /**
         * Sets the "servingtype" attribute
         */
        void setServingtype(java.lang.String servingtype);
        
        /**
         * Sets (as xml) the "servingtype" attribute
         */
        void xsetServingtype(org.apache.xmlbeans.XmlString servingtype);
        
        /**
         * Gets the "createdate" attribute
         */
        java.util.Calendar getCreatedate();
        
        /**
         * Gets (as xml) the "createdate" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetCreatedate();
        
        /**
         * True if has "createdate" attribute
         */
        boolean isSetCreatedate();
        
        /**
         * Sets the "createdate" attribute
         */
        void setCreatedate(java.util.Calendar createdate);
        
        /**
         * Sets (as xml) the "createdate" attribute
         */
        void xsetCreatedate(org.apache.xmlbeans.XmlDateTime createdate);
        
        /**
         * Unsets the "createdate" attribute
         */
        void unsetCreatedate();
        
        /**
         * Gets the "createuser" attribute
         */
        java.lang.String getCreateuser();
        
        /**
         * Gets (as xml) the "createuser" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreateuser();
        
        /**
         * True if has "createuser" attribute
         */
        boolean isSetCreateuser();
        
        /**
         * Sets the "createuser" attribute
         */
        void setCreateuser(java.lang.String createuser);
        
        /**
         * Sets (as xml) the "createuser" attribute
         */
        void xsetCreateuser(org.apache.xmlbeans.XmlString createuser);
        
        /**
         * Unsets the "createuser" attribute
         */
        void unsetCreateuser();
        
        /**
         * Gets the "createemail" attribute
         */
        java.lang.String getCreateemail();
        
        /**
         * Gets (as xml) the "createemail" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreateemail();
        
        /**
         * True if has "createemail" attribute
         */
        boolean isSetCreateemail();
        
        /**
         * Sets the "createemail" attribute
         */
        void setCreateemail(java.lang.String createemail);
        
        /**
         * Sets (as xml) the "createemail" attribute
         */
        void xsetCreateemail(org.apache.xmlbeans.XmlString createemail);
        
        /**
         * Unsets the "createemail" attribute
         */
        void unsetCreateemail();
        
        /**
         * Gets the "changedate" attribute
         */
        java.util.Calendar getChangedate();
        
        /**
         * Gets (as xml) the "changedate" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetChangedate();
        
        /**
         * True if has "changedate" attribute
         */
        boolean isSetChangedate();
        
        /**
         * Sets the "changedate" attribute
         */
        void setChangedate(java.util.Calendar changedate);
        
        /**
         * Sets (as xml) the "changedate" attribute
         */
        void xsetChangedate(org.apache.xmlbeans.XmlDateTime changedate);
        
        /**
         * Unsets the "changedate" attribute
         */
        void unsetChangedate();
        
        /**
         * Gets the "changeuser" attribute
         */
        java.lang.String getChangeuser();
        
        /**
         * Gets (as xml) the "changeuser" attribute
         */
        org.apache.xmlbeans.XmlString xgetChangeuser();
        
        /**
         * True if has "changeuser" attribute
         */
        boolean isSetChangeuser();
        
        /**
         * Sets the "changeuser" attribute
         */
        void setChangeuser(java.lang.String changeuser);
        
        /**
         * Sets (as xml) the "changeuser" attribute
         */
        void xsetChangeuser(org.apache.xmlbeans.XmlString changeuser);
        
        /**
         * Unsets the "changeuser" attribute
         */
        void unsetChangeuser();
        
        /**
         * Gets the "changeemail" attribute
         */
        java.lang.String getChangeemail();
        
        /**
         * Gets (as xml) the "changeemail" attribute
         */
        org.apache.xmlbeans.XmlString xgetChangeemail();
        
        /**
         * True if has "changeemail" attribute
         */
        boolean isSetChangeemail();
        
        /**
         * Sets the "changeemail" attribute
         */
        void setChangeemail(java.lang.String changeemail);
        
        /**
         * Sets (as xml) the "changeemail" attribute
         */
        void xsetChangeemail(org.apache.xmlbeans.XmlString changeemail);
        
        /**
         * Unsets the "changeemail" attribute
         */
        void unsetChangeemail();
        
        /**
         * Gets the "timeallqty" attribute
         */
        java.math.BigInteger getTimeallqty();
        
        /**
         * Gets (as xml) the "timeallqty" attribute
         */
        org.apache.xmlbeans.XmlUnsignedLong xgetTimeallqty();
        
        /**
         * True if has "timeallqty" attribute
         */
        boolean isSetTimeallqty();
        
        /**
         * Sets the "timeallqty" attribute
         */
        void setTimeallqty(java.math.BigInteger timeallqty);
        
        /**
         * Sets (as xml) the "timeallqty" attribute
         */
        void xsetTimeallqty(org.apache.xmlbeans.XmlUnsignedLong timeallqty);
        
        /**
         * Unsets the "timeallqty" attribute
         */
        void unsetTimeallqty();
        
        /**
         * Gets the "timeprepqty" attribute
         */
        java.math.BigInteger getTimeprepqty();
        
        /**
         * Gets (as xml) the "timeprepqty" attribute
         */
        org.apache.xmlbeans.XmlUnsignedLong xgetTimeprepqty();
        
        /**
         * True if has "timeprepqty" attribute
         */
        boolean isSetTimeprepqty();
        
        /**
         * Sets the "timeprepqty" attribute
         */
        void setTimeprepqty(java.math.BigInteger timeprepqty);
        
        /**
         * Sets (as xml) the "timeprepqty" attribute
         */
        void xsetTimeprepqty(org.apache.xmlbeans.XmlUnsignedLong timeprepqty);
        
        /**
         * Unsets the "timeprepqty" attribute
         */
        void unsetTimeprepqty();
        
        /**
         * Gets the "timecookqty" attribute
         */
        java.math.BigInteger getTimecookqty();
        
        /**
         * Gets (as xml) the "timecookqty" attribute
         */
        org.apache.xmlbeans.XmlUnsignedLong xgetTimecookqty();
        
        /**
         * True if has "timecookqty" attribute
         */
        boolean isSetTimecookqty();
        
        /**
         * Sets the "timecookqty" attribute
         */
        void setTimecookqty(java.math.BigInteger timecookqty);
        
        /**
         * Sets (as xml) the "timecookqty" attribute
         */
        void xsetTimecookqty(org.apache.xmlbeans.XmlUnsignedLong timecookqty);
        
        /**
         * Unsets the "timecookqty" attribute
         */
        void unsetTimecookqty();
        
        /**
         * Gets the "costs" attribute
         */
        java.lang.String getCosts();
        
        /**
         * Gets (as xml) the "costs" attribute
         */
        org.apache.xmlbeans.XmlString xgetCosts();
        
        /**
         * True if has "costs" attribute
         */
        boolean isSetCosts();
        
        /**
         * Sets the "costs" attribute
         */
        void setCosts(java.lang.String costs);
        
        /**
         * Sets (as xml) the "costs" attribute
         */
        void xsetCosts(org.apache.xmlbeans.XmlString costs);
        
        /**
         * Unsets the "costs" attribute
         */
        void unsetCosts();
        
        /**
         * Gets the "wwpoints" attribute
         */
        float getWwpoints();
        
        /**
         * Gets (as xml) the "wwpoints" attribute
         */
        org.apache.xmlbeans.XmlFloat xgetWwpoints();
        
        /**
         * True if has "wwpoints" attribute
         */
        boolean isSetWwpoints();
        
        /**
         * Sets the "wwpoints" attribute
         */
        void setWwpoints(float wwpoints);
        
        /**
         * Sets (as xml) the "wwpoints" attribute
         */
        void xsetWwpoints(org.apache.xmlbeans.XmlFloat wwpoints);
        
        /**
         * Unsets the "wwpoints" attribute
         */
        void unsetWwpoints();
        
        /**
         * An XML content(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public interface Content extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Content.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s01FF1499F47AC073F6707B4D7E44A8AA").resolveHandle("content0578elemtype");
            
            /**
             * Gets the "type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "type" attribute
             */
            org.apache.xmlbeans.XmlString xgetType();
            
            /**
             * Sets the "type" attribute
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "type" attribute
             */
            void xsetType(org.apache.xmlbeans.XmlString type);
            
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
                public static org.codefromhell.cookml.HeadDocument.Head.Content newInstance() {
                  return (org.codefromhell.cookml.HeadDocument.Head.Content) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.codefromhell.cookml.HeadDocument.Head.Content newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.codefromhell.cookml.HeadDocument.Head.Content) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.codefromhell.cookml.HeadDocument.Head newInstance() {
              return (org.codefromhell.cookml.HeadDocument.Head) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.codefromhell.cookml.HeadDocument.Head newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.codefromhell.cookml.HeadDocument.Head) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.codefromhell.cookml.HeadDocument newInstance() {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.codefromhell.cookml.HeadDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.codefromhell.cookml.HeadDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.codefromhell.cookml.HeadDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.HeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.codefromhell.cookml.HeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.codefromhell.cookml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
