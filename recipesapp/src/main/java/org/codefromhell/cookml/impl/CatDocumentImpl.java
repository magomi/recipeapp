/*
 * An XML document type.
 * Localname: cat
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.CatDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one cat(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class CatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.CatDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAT$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "cat");
    
    
    /**
     * Gets the "cat" element
     */
    public java.lang.String getCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cat" element
     */
    public org.apache.xmlbeans.XmlString xgetCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cat" element
     */
    public void setCat(java.lang.String cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAT$0);
            }
            target.setStringValue(cat);
        }
    }
    
    /**
     * Sets (as xml) the "cat" element
     */
    public void xsetCat(org.apache.xmlbeans.XmlString cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAT$0);
            }
            target.set(cat);
        }
    }
}
