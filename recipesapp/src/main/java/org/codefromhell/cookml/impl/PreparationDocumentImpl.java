/*
 * An XML document type.
 * Localname: preparation
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.PreparationDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one preparation(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class PreparationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.PreparationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PreparationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPARATION$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "preparation");
    
    
    /**
     * Gets the "preparation" element
     */
    public org.codefromhell.cookml.PreparationDocument.Preparation getPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PreparationDocument.Preparation target = null;
            target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().find_element_user(PREPARATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "preparation" element
     */
    public void setPreparation(org.codefromhell.cookml.PreparationDocument.Preparation preparation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PreparationDocument.Preparation target = null;
            target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().find_element_user(PREPARATION$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().add_element_user(PREPARATION$0);
            }
            target.set(preparation);
        }
    }
    
    /**
     * Appends and returns a new empty "preparation" element
     */
    public org.codefromhell.cookml.PreparationDocument.Preparation addNewPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.PreparationDocument.Preparation target = null;
            target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().add_element_user(PREPARATION$0);
            return target;
        }
    }
    /**
     * An XML preparation(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class PreparationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.PreparationDocument.Preparation
    {
        private static final long serialVersionUID = 1L;
        
        public PreparationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "text");
        private static final javax.xml.namespace.QName STEP$2 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "step");
        
        
        /**
         * Gets array of all "text" elements
         */
        public java.lang.String[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "text" element
         */
        public java.lang.String getTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "text" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "text" element
         */
        public org.apache.xmlbeans.XmlString xgetTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "text" element
         */
        public int sizeOfTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$0);
            }
        }
        
        /**
         * Sets array of all "text" element
         */
        public void setTextArray(java.lang.String[] textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$0);
            }
        }
        
        /**
         * Sets ith "text" element
         */
        public void setTextArray(int i, java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) array of all "text" element
         */
        public void xsetTextArray(org.apache.xmlbeans.XmlString[]textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "text" element
         */
        public void xsetTextArray(int i, org.apache.xmlbeans.XmlString text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(text);
            }
        }
        
        /**
         * Inserts the value as the ith "text" element
         */
        public void insertText(int i, java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TEXT$0, i);
                target.setStringValue(text);
            }
        }
        
        /**
         * Appends the value as the last "text" element
         */
        public void addText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
                target.setStringValue(text);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "text" element
         */
        public org.apache.xmlbeans.XmlString insertNewText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TEXT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "text" element
         */
        public org.apache.xmlbeans.XmlString addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "text" element
         */
        public void removeText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$0, i);
            }
        }
        
        /**
         * Gets array of all "step" elements
         */
        public java.lang.String[] getStepArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STEP$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "step" element
         */
        public java.lang.String getStepArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "step" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetStepArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STEP$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "step" element
         */
        public org.apache.xmlbeans.XmlString xgetStepArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "step" element
         */
        public int sizeOfStepArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STEP$2);
            }
        }
        
        /**
         * Sets array of all "step" element
         */
        public void setStepArray(java.lang.String[] stepArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stepArray, STEP$2);
            }
        }
        
        /**
         * Sets ith "step" element
         */
        public void setStepArray(int i, java.lang.String step)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(step);
            }
        }
        
        /**
         * Sets (as xml) array of all "step" element
         */
        public void xsetStepArray(org.apache.xmlbeans.XmlString[]stepArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stepArray, STEP$2);
            }
        }
        
        /**
         * Sets (as xml) ith "step" element
         */
        public void xsetStepArray(int i, org.apache.xmlbeans.XmlString step)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(step);
            }
        }
        
        /**
         * Inserts the value as the ith "step" element
         */
        public void insertStep(int i, java.lang.String step)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STEP$2, i);
                target.setStringValue(step);
            }
        }
        
        /**
         * Appends the value as the last "step" element
         */
        public void addStep(java.lang.String step)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STEP$2);
                target.setStringValue(step);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "step" element
         */
        public org.apache.xmlbeans.XmlString insertNewStep(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STEP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "step" element
         */
        public org.apache.xmlbeans.XmlString addNewStep()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STEP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "step" element
         */
        public void removeStep(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STEP$2, i);
            }
        }
    }
}
