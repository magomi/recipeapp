/*
 * An XML document type.
 * Localname: desc
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.DescDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one desc(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class DescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.DescDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESC$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "desc");
    
    
    /**
     * Gets the "desc" element
     */
    public java.lang.String getDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "desc" element
     */
    public org.apache.xmlbeans.XmlString xgetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "desc" element
     */
    public void setDesc(java.lang.String desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESC$0);
            }
            target.setStringValue(desc);
        }
    }
    
    /**
     * Sets (as xml) the "desc" element
     */
    public void xsetDesc(org.apache.xmlbeans.XmlString desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESC$0);
            }
            target.set(desc);
        }
    }
}
