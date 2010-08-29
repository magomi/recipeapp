/*
 * An XML document type.
 * Localname: sourceline
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.SourcelineDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one sourceline(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class SourcelineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.SourcelineDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourcelineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCELINE$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "sourceline");
    
    
    /**
     * Gets the "sourceline" element
     */
    public java.lang.String getSourceline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceline" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCELINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceline" element
     */
    public void setSourceline(java.lang.String sourceline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCELINE$0);
            }
            target.setStringValue(sourceline);
        }
    }
    
    /**
     * Sets (as xml) the "sourceline" element
     */
    public void xsetSourceline(org.apache.xmlbeans.XmlString sourceline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCELINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCELINE$0);
            }
            target.set(sourceline);
        }
    }
}
