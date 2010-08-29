/*
 * An XML document type.
 * Localname: remark
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.RemarkDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one remark(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class RemarkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RemarkDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemarkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMARK$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "remark");
    
    
    /**
     * Gets the "remark" element
     */
    public org.codefromhell.cookml.RemarkDocument.Remark getRemark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RemarkDocument.Remark target = null;
            target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().find_element_user(REMARK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remark" element
     */
    public void setRemark(org.codefromhell.cookml.RemarkDocument.Remark remark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RemarkDocument.Remark target = null;
            target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().find_element_user(REMARK$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().add_element_user(REMARK$0);
            }
            target.set(remark);
        }
    }
    
    /**
     * Appends and returns a new empty "remark" element
     */
    public org.codefromhell.cookml.RemarkDocument.Remark addNewRemark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RemarkDocument.Remark target = null;
            target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().add_element_user(REMARK$0);
            return target;
        }
    }
    /**
     * An XML remark(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class RemarkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RemarkDocument.Remark
    {
        private static final long serialVersionUID = 1L;
        
        public RemarkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINE$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "line");
        private static final javax.xml.namespace.QName USER$2 = 
            new javax.xml.namespace.QName("", "user");
        
        
        /**
         * Gets array of all "line" elements
         */
        public java.lang.String[] getLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "line" element
         */
        public java.lang.String getLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "line" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "line" element
         */
        public org.apache.xmlbeans.XmlString xgetLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "line" element
         */
        public int sizeOfLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINE$0);
            }
        }
        
        /**
         * Sets array of all "line" element
         */
        public void setLineArray(java.lang.String[] lineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineArray, LINE$0);
            }
        }
        
        /**
         * Sets ith "line" element
         */
        public void setLineArray(int i, java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(line);
            }
        }
        
        /**
         * Sets (as xml) array of all "line" element
         */
        public void xsetLineArray(org.apache.xmlbeans.XmlString[]lineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineArray, LINE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "line" element
         */
        public void xsetLineArray(int i, org.apache.xmlbeans.XmlString line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(line);
            }
        }
        
        /**
         * Inserts the value as the ith "line" element
         */
        public void insertLine(int i, java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LINE$0, i);
                target.setStringValue(line);
            }
        }
        
        /**
         * Appends the value as the last "line" element
         */
        public void addLine(java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE$0);
                target.setStringValue(line);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "line" element
         */
        public org.apache.xmlbeans.XmlString insertNewLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line" element
         */
        public org.apache.xmlbeans.XmlString addNewLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "line" element
         */
        public void removeLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINE$0, i);
            }
        }
        
        /**
         * Gets the "user" attribute
         */
        public java.lang.String getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "user" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USER$2);
                return target;
            }
        }
        
        /**
         * True if has "user" attribute
         */
        public boolean isSetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USER$2) != null;
            }
        }
        
        /**
         * Sets the "user" attribute
         */
        public void setUser(java.lang.String user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USER$2);
                }
                target.setStringValue(user);
            }
        }
        
        /**
         * Sets (as xml) the "user" attribute
         */
        public void xsetUser(org.apache.xmlbeans.XmlString user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USER$2);
                }
                target.set(user);
            }
        }
        
        /**
         * Unsets the "user" attribute
         */
        public void unsetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USER$2);
            }
        }
    }
}
