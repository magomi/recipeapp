/*
 * An XML document type.
 * Localname: picbin
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PicbinDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one picbin(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class PicbinDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.PicbinDocument
{
    private static final long serialVersionUID = 1L;
    
    public PicbinDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICBIN$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "picbin");
    
    
    /**
     * Gets the "picbin" element
     */
    public org.codefromhell.cookml.PicbinDocument.Picbin getPicbin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PicbinDocument.Picbin target = null;
            target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().find_element_user(PICBIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "picbin" element
     */
    public void setPicbin(org.codefromhell.cookml.PicbinDocument.Picbin picbin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PicbinDocument.Picbin target = null;
            target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().find_element_user(PICBIN$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().add_element_user(PICBIN$0);
            }
            target.set(picbin);
        }
    }
    
    /**
     * Appends and returns a new empty "picbin" element
     */
    public org.codefromhell.cookml.PicbinDocument.Picbin addNewPicbin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PicbinDocument.Picbin target = null;
            target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().add_element_user(PICBIN$0);
            return target;
        }
    }
    /**
     * An XML picbin(@http://codefromhell.org/cookml).
     *
     * This is an atomic type that is a restriction of org.codefromhell.cookml.PicbinDocument$Picbin.
     */
    public static class PicbinImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.codefromhell.cookml.PicbinDocument.Picbin
    {
        private static final long serialVersionUID = 1L;
        
        public PicbinImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PicbinImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName FORMAT$0 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "format" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
                return target;
            }
        }
        
        /**
         * Sets the "format" attribute
         */
        public void setFormat(java.lang.String format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$0);
                }
                target.setStringValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "format" attribute
         */
        public void xsetFormat(org.apache.xmlbeans.XmlString format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$0);
                }
                target.set(format);
            }
        }
    }
}
