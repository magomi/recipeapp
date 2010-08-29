/*
 * An XML document type.
 * Localname: mcustom
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.McustomDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one mcustom(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class McustomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.McustomDocument
{
    private static final long serialVersionUID = 1L;
    
    public McustomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MCUSTOM$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "mcustom");
    
    
    /**
     * Gets the "mcustom" element
     */
    public org.codefromhell.cookml.McustomDocument.Mcustom getMcustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.McustomDocument.Mcustom target = null;
            target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().find_element_user(MCUSTOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mcustom" element
     */
    public void setMcustom(org.codefromhell.cookml.McustomDocument.Mcustom mcustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.McustomDocument.Mcustom target = null;
            target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().find_element_user(MCUSTOM$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().add_element_user(MCUSTOM$0);
            }
            target.set(mcustom);
        }
    }
    
    /**
     * Appends and returns a new empty "mcustom" element
     */
    public org.codefromhell.cookml.McustomDocument.Mcustom addNewMcustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.McustomDocument.Mcustom target = null;
            target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().add_element_user(MCUSTOM$0);
            return target;
        }
    }
    /**
     * An XML mcustom(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class McustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.McustomDocument.Mcustom
    {
        private static final long serialVersionUID = 1L;
        
        public McustomImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DATATYPE$2 = 
            new javax.xml.namespace.QName("", "datatype");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "datatype" attribute
         */
        public java.lang.String getDatatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATATYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "datatype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDatatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATATYPE$2);
                return target;
            }
        }
        
        /**
         * Sets the "datatype" attribute
         */
        public void setDatatype(java.lang.String datatype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATATYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATATYPE$2);
                }
                target.setStringValue(datatype);
            }
        }
        
        /**
         * Sets (as xml) the "datatype" attribute
         */
        public void xsetDatatype(org.apache.xmlbeans.XmlString datatype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATATYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATATYPE$2);
                }
                target.set(datatype);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
    }
}
