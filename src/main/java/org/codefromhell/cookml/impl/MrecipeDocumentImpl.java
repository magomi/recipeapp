/*
 * An XML document type.
 * Localname: mrecipe
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.MrecipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one mrecipe(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class MrecipeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.MrecipeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MrecipeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MRECIPE$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "mrecipe");
    
    
    /**
     * Gets the "mrecipe" element
     */
    public org.codefromhell.cookml.MrecipeDocument.Mrecipe getMrecipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
            target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().find_element_user(MRECIPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mrecipe" element
     */
    public void setMrecipe(org.codefromhell.cookml.MrecipeDocument.Mrecipe mrecipe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
            target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().find_element_user(MRECIPE$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().add_element_user(MRECIPE$0);
            }
            target.set(mrecipe);
        }
    }
    
    /**
     * Appends and returns a new empty "mrecipe" element
     */
    public org.codefromhell.cookml.MrecipeDocument.Mrecipe addNewMrecipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
            target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().add_element_user(MRECIPE$0);
            return target;
        }
    }
    /**
     * An XML mrecipe(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class MrecipeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.MrecipeDocument.Mrecipe
    {
        private static final long serialVersionUID = 1L;
        
        public MrecipeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESC$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "desc");
        private static final javax.xml.namespace.QName RID$2 = 
            new javax.xml.namespace.QName("", "rid");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName AMOUNT$6 = 
            new javax.xml.namespace.QName("", "amount");
        private static final javax.xml.namespace.QName PERSONS$8 = 
            new javax.xml.namespace.QName("", "persons");
        
        
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
         * True if has "desc" element
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESC$0) != 0;
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
        
        /**
         * Unsets the "desc" element
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESC$0, 0);
            }
        }
        
        /**
         * Gets the "rid" attribute
         */
        public java.lang.String getRid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RID$2);
                return target;
            }
        }
        
        /**
         * Sets the "rid" attribute
         */
        public void setRid(java.lang.String rid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RID$2);
                }
                target.setStringValue(rid);
            }
        }
        
        /**
         * Sets (as xml) the "rid" attribute
         */
        public void xsetRid(org.apache.xmlbeans.XmlString rid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RID$2);
                }
                target.set(rid);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
                return target;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$4);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$4);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "amount" attribute
         */
        public float getAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$6);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "amount" attribute
         */
        public org.apache.xmlbeans.XmlFloat xgetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(AMOUNT$6);
                return target;
            }
        }
        
        /**
         * True if has "amount" attribute
         */
        public boolean isSetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AMOUNT$6) != null;
            }
        }
        
        /**
         * Sets the "amount" attribute
         */
        public void setAmount(float amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMOUNT$6);
                }
                target.setFloatValue(amount);
            }
        }
        
        /**
         * Sets (as xml) the "amount" attribute
         */
        public void xsetAmount(org.apache.xmlbeans.XmlFloat amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(AMOUNT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(AMOUNT$6);
                }
                target.set(amount);
            }
        }
        
        /**
         * Unsets the "amount" attribute
         */
        public void unsetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AMOUNT$6);
            }
        }
        
        /**
         * Gets the "persons" attribute
         */
        public long getPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONS$8);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "persons" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(PERSONS$8);
                return target;
            }
        }
        
        /**
         * True if has "persons" attribute
         */
        public boolean isSetPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERSONS$8) != null;
            }
        }
        
        /**
         * Sets the "persons" attribute
         */
        public void setPersons(long persons)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONS$8);
                }
                target.setLongValue(persons);
            }
        }
        
        /**
         * Sets (as xml) the "persons" attribute
         */
        public void xsetPersons(org.apache.xmlbeans.XmlLong persons)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(PERSONS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(PERSONS$8);
                }
                target.set(persons);
            }
        }
        
        /**
         * Unsets the "persons" attribute
         */
        public void unsetPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERSONS$8);
            }
        }
    }
}
