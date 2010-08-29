/*
 * An XML document type.
 * Localname: hint
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.HintDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one hint(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class HintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.HintDocument
{
    private static final long serialVersionUID = 1L;
    
    public HintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HINT$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "hint");
    
    
    /**
     * Gets the "hint" element
     */
    public java.lang.String getHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hint" element
     */
    public org.apache.xmlbeans.XmlString xgetHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hint" element
     */
    public void setHint(java.lang.String hint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HINT$0);
            }
            target.setStringValue(hint);
        }
    }
    
    /**
     * Sets (as xml) the "hint" element
     */
    public void xsetHint(org.apache.xmlbeans.XmlString hint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HINT$0);
            }
            target.set(hint);
        }
    }
}
