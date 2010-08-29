/*
 * An XML document type.
 * Localname: text
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.TextDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one text(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "text");
    
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
}
