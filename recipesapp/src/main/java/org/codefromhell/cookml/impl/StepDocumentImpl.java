/*
 * An XML document type.
 * Localname: step
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.StepDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one step(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class StepDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.StepDocument
{
    private static final long serialVersionUID = 1L;
    
    public StepDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STEP$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "step");
    
    
    /**
     * Gets the "step" element
     */
    public java.lang.String getStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "step" element
     */
    public org.apache.xmlbeans.XmlString xgetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "step" element
     */
    public void setStep(java.lang.String step)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STEP$0);
            }
            target.setStringValue(step);
        }
    }
    
    /**
     * Sets (as xml) the "step" element
     */
    public void xsetStep(org.apache.xmlbeans.XmlString step)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STEP$0);
            }
            target.set(step);
        }
    }
}
