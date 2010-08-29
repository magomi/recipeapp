/*
 * An XML document type.
 * Localname: picture
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PictureDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one picture(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class PictureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.PictureDocument
{
    private static final long serialVersionUID = 1L;
    
    public PictureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICTURE$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "picture");
    
    
    /**
     * Gets the "picture" element
     */
    public org.codefromhell.cookml.PictureDocument.Picture getPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PictureDocument.Picture target = null;
            target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().find_element_user(PICTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "picture" element
     */
    public void setPicture(org.codefromhell.cookml.PictureDocument.Picture picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PictureDocument.Picture target = null;
            target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().find_element_user(PICTURE$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().add_element_user(PICTURE$0);
            }
            target.set(picture);
        }
    }
    
    /**
     * Appends and returns a new empty "picture" element
     */
    public org.codefromhell.cookml.PictureDocument.Picture addNewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PictureDocument.Picture target = null;
            target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().add_element_user(PICTURE$0);
            return target;
        }
    }
    /**
     * An XML picture(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class PictureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.PictureDocument.Picture
    {
        private static final long serialVersionUID = 1L;
        
        public PictureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILE$0 = 
            new javax.xml.namespace.QName("", "file");
        
        
        /**
         * Gets the "file" attribute
         */
        public java.lang.String getFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "file" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$0);
                return target;
            }
        }
        
        /**
         * Sets the "file" attribute
         */
        public void setFile(java.lang.String file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILE$0);
                }
                target.setStringValue(file);
            }
        }
        
        /**
         * Sets (as xml) the "file" attribute
         */
        public void xsetFile(org.apache.xmlbeans.XmlString file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILE$0);
                }
                target.set(file);
            }
        }
    }
}
