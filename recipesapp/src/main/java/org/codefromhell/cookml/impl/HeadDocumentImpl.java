/*
 * An XML document type.
 * Localname: head
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.HeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one head(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class HeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.HeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "head");
    
    
    /**
     * Gets the "head" element
     */
    public org.codefromhell.cookml.HeadDocument.Head getHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.HeadDocument.Head target = null;
            target = (org.codefromhell.cookml.HeadDocument.Head)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "head" element
     */
    public void setHead(org.codefromhell.cookml.HeadDocument.Head head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.HeadDocument.Head target = null;
            target = (org.codefromhell.cookml.HeadDocument.Head)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.HeadDocument.Head)get_store().add_element_user(HEAD$0);
            }
            target.set(head);
        }
    }
    
    /**
     * Appends and returns a new empty "head" element
     */
    public org.codefromhell.cookml.HeadDocument.Head addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.HeadDocument.Head target = null;
            target = (org.codefromhell.cookml.HeadDocument.Head)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    /**
     * An XML head(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class HeadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.HeadDocument.Head
    {
        private static final long serialVersionUID = 1L;
        
        public HeadImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAT$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "cat");
        private static final javax.xml.namespace.QName HINT$2 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "hint");
        private static final javax.xml.namespace.QName SOURCELINE$4 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "sourceline");
        private static final javax.xml.namespace.QName CONTENT$6 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "content");
        private static final javax.xml.namespace.QName PICTURE$8 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "picture");
        private static final javax.xml.namespace.QName PICBIN$10 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "picbin");
        private static final javax.xml.namespace.QName TITLE$12 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName RID$14 = 
            new javax.xml.namespace.QName("", "rid");
        private static final javax.xml.namespace.QName CARD$16 = 
            new javax.xml.namespace.QName("", "card");
        private static final javax.xml.namespace.QName SERVINGQTY$18 = 
            new javax.xml.namespace.QName("", "servingqty");
        private static final javax.xml.namespace.QName SERVINGTYPE$20 = 
            new javax.xml.namespace.QName("", "servingtype");
        private static final javax.xml.namespace.QName CREATEDATE$22 = 
            new javax.xml.namespace.QName("", "createdate");
        private static final javax.xml.namespace.QName CREATEUSER$24 = 
            new javax.xml.namespace.QName("", "createuser");
        private static final javax.xml.namespace.QName CREATEEMAIL$26 = 
            new javax.xml.namespace.QName("", "createemail");
        private static final javax.xml.namespace.QName CHANGEDATE$28 = 
            new javax.xml.namespace.QName("", "changedate");
        private static final javax.xml.namespace.QName CHANGEUSER$30 = 
            new javax.xml.namespace.QName("", "changeuser");
        private static final javax.xml.namespace.QName CHANGEEMAIL$32 = 
            new javax.xml.namespace.QName("", "changeemail");
        private static final javax.xml.namespace.QName TIMEALLQTY$34 = 
            new javax.xml.namespace.QName("", "timeallqty");
        private static final javax.xml.namespace.QName TIMEPREPQTY$36 = 
            new javax.xml.namespace.QName("", "timeprepqty");
        private static final javax.xml.namespace.QName TIMECOOKQTY$38 = 
            new javax.xml.namespace.QName("", "timecookqty");
        private static final javax.xml.namespace.QName COSTS$40 = 
            new javax.xml.namespace.QName("", "costs");
        private static final javax.xml.namespace.QName WWPOINTS$42 = 
            new javax.xml.namespace.QName("", "wwpoints");
        
        
        /**
         * Gets array of all "cat" elements
         */
        public java.lang.String[] getCatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAT$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "cat" element
         */
        public java.lang.String getCatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "cat" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAT$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "cat" element
         */
        public org.apache.xmlbeans.XmlString xgetCatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "cat" element
         */
        public int sizeOfCatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAT$0);
            }
        }
        
        /**
         * Sets array of all "cat" element
         */
        public void setCatArray(java.lang.String[] catArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(catArray, CAT$0);
            }
        }
        
        /**
         * Sets ith "cat" element
         */
        public void setCatArray(int i, java.lang.String cat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(cat);
            }
        }
        
        /**
         * Sets (as xml) array of all "cat" element
         */
        public void xsetCatArray(org.apache.xmlbeans.XmlString[]catArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(catArray, CAT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "cat" element
         */
        public void xsetCatArray(int i, org.apache.xmlbeans.XmlString cat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cat);
            }
        }
        
        /**
         * Inserts the value as the ith "cat" element
         */
        public void insertCat(int i, java.lang.String cat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAT$0, i);
                target.setStringValue(cat);
            }
        }
        
        /**
         * Appends the value as the last "cat" element
         */
        public void addCat(java.lang.String cat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAT$0);
                target.setStringValue(cat);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "cat" element
         */
        public org.apache.xmlbeans.XmlString insertNewCat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CAT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "cat" element
         */
        public org.apache.xmlbeans.XmlString addNewCat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "cat" element
         */
        public void removeCat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAT$0, i);
            }
        }
        
        /**
         * Gets array of all "hint" elements
         */
        public java.lang.String[] getHintArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HINT$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "hint" element
         */
        public java.lang.String getHintArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "hint" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetHintArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HINT$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "hint" element
         */
        public org.apache.xmlbeans.XmlString xgetHintArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HINT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "hint" element
         */
        public int sizeOfHintArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HINT$2);
            }
        }
        
        /**
         * Sets array of all "hint" element
         */
        public void setHintArray(java.lang.String[] hintArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hintArray, HINT$2);
            }
        }
        
        /**
         * Sets ith "hint" element
         */
        public void setHintArray(int i, java.lang.String hint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(hint);
            }
        }
        
        /**
         * Sets (as xml) array of all "hint" element
         */
        public void xsetHintArray(org.apache.xmlbeans.XmlString[]hintArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hintArray, HINT$2);
            }
        }
        
        /**
         * Sets (as xml) ith "hint" element
         */
        public void xsetHintArray(int i, org.apache.xmlbeans.XmlString hint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HINT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hint);
            }
        }
        
        /**
         * Inserts the value as the ith "hint" element
         */
        public void insertHint(int i, java.lang.String hint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HINT$2, i);
                target.setStringValue(hint);
            }
        }
        
        /**
         * Appends the value as the last "hint" element
         */
        public void addHint(java.lang.String hint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HINT$2);
                target.setStringValue(hint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hint" element
         */
        public org.apache.xmlbeans.XmlString insertNewHint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HINT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hint" element
         */
        public org.apache.xmlbeans.XmlString addNewHint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HINT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "hint" element
         */
        public void removeHint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HINT$2, i);
            }
        }
        
        /**
         * Gets array of all "sourceline" elements
         */
        public java.lang.String[] getSourcelineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCELINE$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceline" element
         */
        public java.lang.String getSourcelineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "sourceline" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSourcelineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCELINE$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceline" element
         */
        public org.apache.xmlbeans.XmlString xgetSourcelineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCELINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "sourceline" element
         */
        public int sizeOfSourcelineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCELINE$4);
            }
        }
        
        /**
         * Sets array of all "sourceline" element
         */
        public void setSourcelineArray(java.lang.String[] sourcelineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourcelineArray, SOURCELINE$4);
            }
        }
        
        /**
         * Sets ith "sourceline" element
         */
        public void setSourcelineArray(int i, java.lang.String sourceline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceline);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceline" element
         */
        public void xsetSourcelineArray(org.apache.xmlbeans.XmlString[]sourcelineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourcelineArray, SOURCELINE$4);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceline" element
         */
        public void xsetSourcelineArray(int i, org.apache.xmlbeans.XmlString sourceline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCELINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceline);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceline" element
         */
        public void insertSourceline(int i, java.lang.String sourceline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCELINE$4, i);
                target.setStringValue(sourceline);
            }
        }
        
        /**
         * Appends the value as the last "sourceline" element
         */
        public void addSourceline(java.lang.String sourceline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCELINE$4);
                target.setStringValue(sourceline);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceline" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCELINE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceline" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCELINE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceline" element
         */
        public void removeSourceline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCELINE$4, i);
            }
        }
        
        /**
         * Gets array of all "content" elements
         */
        public org.codefromhell.cookml.HeadDocument.Head.Content[] getContentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTENT$6, targetList);
                org.codefromhell.cookml.HeadDocument.Head.Content[] result = new org.codefromhell.cookml.HeadDocument.Head.Content[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "content" element
         */
        public org.codefromhell.cookml.HeadDocument.Head.Content getContentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head.Content target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head.Content)get_store().find_element_user(CONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "content" element
         */
        public int sizeOfContentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTENT$6);
            }
        }
        
        /**
         * Sets array of all "content" element
         */
        public void setContentArray(org.codefromhell.cookml.HeadDocument.Head.Content[] contentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contentArray, CONTENT$6);
            }
        }
        
        /**
         * Sets ith "content" element
         */
        public void setContentArray(int i, org.codefromhell.cookml.HeadDocument.Head.Content content)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head.Content target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head.Content)get_store().find_element_user(CONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(content);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "content" element
         */
        public org.codefromhell.cookml.HeadDocument.Head.Content insertNewContent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head.Content target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head.Content)get_store().insert_element_user(CONTENT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "content" element
         */
        public org.codefromhell.cookml.HeadDocument.Head.Content addNewContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head.Content target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head.Content)get_store().add_element_user(CONTENT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "content" element
         */
        public void removeContent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTENT$6, i);
            }
        }
        
        /**
         * Gets array of all "picture" elements
         */
        public org.codefromhell.cookml.PictureDocument.Picture[] getPictureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PICTURE$8, targetList);
                org.codefromhell.cookml.PictureDocument.Picture[] result = new org.codefromhell.cookml.PictureDocument.Picture[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "picture" element
         */
        public org.codefromhell.cookml.PictureDocument.Picture getPictureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PictureDocument.Picture target = null;
                target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().find_element_user(PICTURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "picture" element
         */
        public int sizeOfPictureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PICTURE$8);
            }
        }
        
        /**
         * Sets array of all "picture" element
         */
        public void setPictureArray(org.codefromhell.cookml.PictureDocument.Picture[] pictureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pictureArray, PICTURE$8);
            }
        }
        
        /**
         * Sets ith "picture" element
         */
        public void setPictureArray(int i, org.codefromhell.cookml.PictureDocument.Picture picture)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PictureDocument.Picture target = null;
                target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().find_element_user(PICTURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(picture);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "picture" element
         */
        public org.codefromhell.cookml.PictureDocument.Picture insertNewPicture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PictureDocument.Picture target = null;
                target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().insert_element_user(PICTURE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "picture" element
         */
        public org.codefromhell.cookml.PictureDocument.Picture addNewPicture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PictureDocument.Picture target = null;
                target = (org.codefromhell.cookml.PictureDocument.Picture)get_store().add_element_user(PICTURE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "picture" element
         */
        public void removePicture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PICTURE$8, i);
            }
        }
        
        /**
         * Gets array of all "picbin" elements
         */
        public org.codefromhell.cookml.PicbinDocument.Picbin[] getPicbinArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PICBIN$10, targetList);
                org.codefromhell.cookml.PicbinDocument.Picbin[] result = new org.codefromhell.cookml.PicbinDocument.Picbin[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "picbin" element
         */
        public org.codefromhell.cookml.PicbinDocument.Picbin getPicbinArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PicbinDocument.Picbin target = null;
                target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().find_element_user(PICBIN$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "picbin" element
         */
        public int sizeOfPicbinArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PICBIN$10);
            }
        }
        
        /**
         * Sets array of all "picbin" element
         */
        public void setPicbinArray(org.codefromhell.cookml.PicbinDocument.Picbin[] picbinArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(picbinArray, PICBIN$10);
            }
        }
        
        /**
         * Sets ith "picbin" element
         */
        public void setPicbinArray(int i, org.codefromhell.cookml.PicbinDocument.Picbin picbin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PicbinDocument.Picbin target = null;
                target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().find_element_user(PICBIN$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(picbin);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "picbin" element
         */
        public org.codefromhell.cookml.PicbinDocument.Picbin insertNewPicbin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PicbinDocument.Picbin target = null;
                target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().insert_element_user(PICBIN$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "picbin" element
         */
        public org.codefromhell.cookml.PicbinDocument.Picbin addNewPicbin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PicbinDocument.Picbin target = null;
                target = (org.codefromhell.cookml.PicbinDocument.Picbin)get_store().add_element_user(PICBIN$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "picbin" element
         */
        public void removePicbin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PICBIN$10, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$12);
                }
                target.set(title);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RID$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RID$14);
                }
                target.set(rid);
            }
        }
        
        /**
         * Gets the "card" attribute
         */
        public java.lang.String getCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARD$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "card" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARD$16);
                return target;
            }
        }
        
        /**
         * True if has "card" attribute
         */
        public boolean isSetCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CARD$16) != null;
            }
        }
        
        /**
         * Sets the "card" attribute
         */
        public void setCard(java.lang.String card)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARD$16);
                }
                target.setStringValue(card);
            }
        }
        
        /**
         * Sets (as xml) the "card" attribute
         */
        public void xsetCard(org.apache.xmlbeans.XmlString card)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARD$16);
                }
                target.set(card);
            }
        }
        
        /**
         * Unsets the "card" attribute
         */
        public void unsetCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CARD$16);
            }
        }
        
        /**
         * Gets the "servingqty" attribute
         */
        public float getServingqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVINGQTY$18);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "servingqty" attribute
         */
        public org.apache.xmlbeans.XmlFloat xgetServingqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SERVINGQTY$18);
                return target;
            }
        }
        
        /**
         * Sets the "servingqty" attribute
         */
        public void setServingqty(float servingqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVINGQTY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVINGQTY$18);
                }
                target.setFloatValue(servingqty);
            }
        }
        
        /**
         * Sets (as xml) the "servingqty" attribute
         */
        public void xsetServingqty(org.apache.xmlbeans.XmlFloat servingqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SERVINGQTY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(SERVINGQTY$18);
                }
                target.set(servingqty);
            }
        }
        
        /**
         * Gets the "servingtype" attribute
         */
        public java.lang.String getServingtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVINGTYPE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "servingtype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetServingtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVINGTYPE$20);
                return target;
            }
        }
        
        /**
         * Sets the "servingtype" attribute
         */
        public void setServingtype(java.lang.String servingtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVINGTYPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVINGTYPE$20);
                }
                target.setStringValue(servingtype);
            }
        }
        
        /**
         * Sets (as xml) the "servingtype" attribute
         */
        public void xsetServingtype(org.apache.xmlbeans.XmlString servingtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVINGTYPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVINGTYPE$20);
                }
                target.set(servingtype);
            }
        }
        
        /**
         * Gets the "createdate" attribute
         */
        public java.util.Calendar getCreatedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDATE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "createdate" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreatedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDATE$22);
                return target;
            }
        }
        
        /**
         * True if has "createdate" attribute
         */
        public boolean isSetCreatedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEDATE$22) != null;
            }
        }
        
        /**
         * Sets the "createdate" attribute
         */
        public void setCreatedate(java.util.Calendar createdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDATE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDATE$22);
                }
                target.setCalendarValue(createdate);
            }
        }
        
        /**
         * Sets (as xml) the "createdate" attribute
         */
        public void xsetCreatedate(org.apache.xmlbeans.XmlDateTime createdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDATE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CREATEDATE$22);
                }
                target.set(createdate);
            }
        }
        
        /**
         * Unsets the "createdate" attribute
         */
        public void unsetCreatedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEDATE$22);
            }
        }
        
        /**
         * Gets the "createuser" attribute
         */
        public java.lang.String getCreateuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEUSER$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "createuser" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreateuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEUSER$24);
                return target;
            }
        }
        
        /**
         * True if has "createuser" attribute
         */
        public boolean isSetCreateuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEUSER$24) != null;
            }
        }
        
        /**
         * Sets the "createuser" attribute
         */
        public void setCreateuser(java.lang.String createuser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEUSER$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEUSER$24);
                }
                target.setStringValue(createuser);
            }
        }
        
        /**
         * Sets (as xml) the "createuser" attribute
         */
        public void xsetCreateuser(org.apache.xmlbeans.XmlString createuser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEUSER$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEUSER$24);
                }
                target.set(createuser);
            }
        }
        
        /**
         * Unsets the "createuser" attribute
         */
        public void unsetCreateuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEUSER$24);
            }
        }
        
        /**
         * Gets the "createemail" attribute
         */
        public java.lang.String getCreateemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEEMAIL$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "createemail" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreateemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEEMAIL$26);
                return target;
            }
        }
        
        /**
         * True if has "createemail" attribute
         */
        public boolean isSetCreateemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEEMAIL$26) != null;
            }
        }
        
        /**
         * Sets the "createemail" attribute
         */
        public void setCreateemail(java.lang.String createemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEEMAIL$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEEMAIL$26);
                }
                target.setStringValue(createemail);
            }
        }
        
        /**
         * Sets (as xml) the "createemail" attribute
         */
        public void xsetCreateemail(org.apache.xmlbeans.XmlString createemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEEMAIL$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEEMAIL$26);
                }
                target.set(createemail);
            }
        }
        
        /**
         * Unsets the "createemail" attribute
         */
        public void unsetCreateemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEEMAIL$26);
            }
        }
        
        /**
         * Gets the "changedate" attribute
         */
        public java.util.Calendar getChangedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEDATE$28);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "changedate" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetChangedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CHANGEDATE$28);
                return target;
            }
        }
        
        /**
         * True if has "changedate" attribute
         */
        public boolean isSetChangedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHANGEDATE$28) != null;
            }
        }
        
        /**
         * Sets the "changedate" attribute
         */
        public void setChangedate(java.util.Calendar changedate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEDATE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGEDATE$28);
                }
                target.setCalendarValue(changedate);
            }
        }
        
        /**
         * Sets (as xml) the "changedate" attribute
         */
        public void xsetChangedate(org.apache.xmlbeans.XmlDateTime changedate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CHANGEDATE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CHANGEDATE$28);
                }
                target.set(changedate);
            }
        }
        
        /**
         * Unsets the "changedate" attribute
         */
        public void unsetChangedate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHANGEDATE$28);
            }
        }
        
        /**
         * Gets the "changeuser" attribute
         */
        public java.lang.String getChangeuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEUSER$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "changeuser" attribute
         */
        public org.apache.xmlbeans.XmlString xgetChangeuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHANGEUSER$30);
                return target;
            }
        }
        
        /**
         * True if has "changeuser" attribute
         */
        public boolean isSetChangeuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHANGEUSER$30) != null;
            }
        }
        
        /**
         * Sets the "changeuser" attribute
         */
        public void setChangeuser(java.lang.String changeuser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEUSER$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGEUSER$30);
                }
                target.setStringValue(changeuser);
            }
        }
        
        /**
         * Sets (as xml) the "changeuser" attribute
         */
        public void xsetChangeuser(org.apache.xmlbeans.XmlString changeuser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHANGEUSER$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHANGEUSER$30);
                }
                target.set(changeuser);
            }
        }
        
        /**
         * Unsets the "changeuser" attribute
         */
        public void unsetChangeuser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHANGEUSER$30);
            }
        }
        
        /**
         * Gets the "changeemail" attribute
         */
        public java.lang.String getChangeemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEEMAIL$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "changeemail" attribute
         */
        public org.apache.xmlbeans.XmlString xgetChangeemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHANGEEMAIL$32);
                return target;
            }
        }
        
        /**
         * True if has "changeemail" attribute
         */
        public boolean isSetChangeemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHANGEEMAIL$32) != null;
            }
        }
        
        /**
         * Sets the "changeemail" attribute
         */
        public void setChangeemail(java.lang.String changeemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEEMAIL$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGEEMAIL$32);
                }
                target.setStringValue(changeemail);
            }
        }
        
        /**
         * Sets (as xml) the "changeemail" attribute
         */
        public void xsetChangeemail(org.apache.xmlbeans.XmlString changeemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHANGEEMAIL$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHANGEEMAIL$32);
                }
                target.set(changeemail);
            }
        }
        
        /**
         * Unsets the "changeemail" attribute
         */
        public void unsetChangeemail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHANGEEMAIL$32);
            }
        }
        
        /**
         * Gets the "timeallqty" attribute
         */
        public java.math.BigInteger getTimeallqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEALLQTY$34);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeallqty" attribute
         */
        public org.apache.xmlbeans.XmlUnsignedLong xgetTimeallqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMEALLQTY$34);
                return target;
            }
        }
        
        /**
         * True if has "timeallqty" attribute
         */
        public boolean isSetTimeallqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMEALLQTY$34) != null;
            }
        }
        
        /**
         * Sets the "timeallqty" attribute
         */
        public void setTimeallqty(java.math.BigInteger timeallqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEALLQTY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEALLQTY$34);
                }
                target.setBigIntegerValue(timeallqty);
            }
        }
        
        /**
         * Sets (as xml) the "timeallqty" attribute
         */
        public void xsetTimeallqty(org.apache.xmlbeans.XmlUnsignedLong timeallqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMEALLQTY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_attribute_user(TIMEALLQTY$34);
                }
                target.set(timeallqty);
            }
        }
        
        /**
         * Unsets the "timeallqty" attribute
         */
        public void unsetTimeallqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMEALLQTY$34);
            }
        }
        
        /**
         * Gets the "timeprepqty" attribute
         */
        public java.math.BigInteger getTimeprepqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPREPQTY$36);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeprepqty" attribute
         */
        public org.apache.xmlbeans.XmlUnsignedLong xgetTimeprepqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMEPREPQTY$36);
                return target;
            }
        }
        
        /**
         * True if has "timeprepqty" attribute
         */
        public boolean isSetTimeprepqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMEPREPQTY$36) != null;
            }
        }
        
        /**
         * Sets the "timeprepqty" attribute
         */
        public void setTimeprepqty(java.math.BigInteger timeprepqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPREPQTY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEPREPQTY$36);
                }
                target.setBigIntegerValue(timeprepqty);
            }
        }
        
        /**
         * Sets (as xml) the "timeprepqty" attribute
         */
        public void xsetTimeprepqty(org.apache.xmlbeans.XmlUnsignedLong timeprepqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMEPREPQTY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_attribute_user(TIMEPREPQTY$36);
                }
                target.set(timeprepqty);
            }
        }
        
        /**
         * Unsets the "timeprepqty" attribute
         */
        public void unsetTimeprepqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMEPREPQTY$36);
            }
        }
        
        /**
         * Gets the "timecookqty" attribute
         */
        public java.math.BigInteger getTimecookqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMECOOKQTY$38);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "timecookqty" attribute
         */
        public org.apache.xmlbeans.XmlUnsignedLong xgetTimecookqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMECOOKQTY$38);
                return target;
            }
        }
        
        /**
         * True if has "timecookqty" attribute
         */
        public boolean isSetTimecookqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMECOOKQTY$38) != null;
            }
        }
        
        /**
         * Sets the "timecookqty" attribute
         */
        public void setTimecookqty(java.math.BigInteger timecookqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMECOOKQTY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMECOOKQTY$38);
                }
                target.setBigIntegerValue(timecookqty);
            }
        }
        
        /**
         * Sets (as xml) the "timecookqty" attribute
         */
        public void xsetTimecookqty(org.apache.xmlbeans.XmlUnsignedLong timecookqty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(TIMECOOKQTY$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_attribute_user(TIMECOOKQTY$38);
                }
                target.set(timecookqty);
            }
        }
        
        /**
         * Unsets the "timecookqty" attribute
         */
        public void unsetTimecookqty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMECOOKQTY$38);
            }
        }
        
        /**
         * Gets the "costs" attribute
         */
        public java.lang.String getCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COSTS$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "costs" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COSTS$40);
                return target;
            }
        }
        
        /**
         * True if has "costs" attribute
         */
        public boolean isSetCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COSTS$40) != null;
            }
        }
        
        /**
         * Sets the "costs" attribute
         */
        public void setCosts(java.lang.String costs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COSTS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COSTS$40);
                }
                target.setStringValue(costs);
            }
        }
        
        /**
         * Sets (as xml) the "costs" attribute
         */
        public void xsetCosts(org.apache.xmlbeans.XmlString costs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COSTS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COSTS$40);
                }
                target.set(costs);
            }
        }
        
        /**
         * Unsets the "costs" attribute
         */
        public void unsetCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COSTS$40);
            }
        }
        
        /**
         * Gets the "wwpoints" attribute
         */
        public float getWwpoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WWPOINTS$42);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "wwpoints" attribute
         */
        public org.apache.xmlbeans.XmlFloat xgetWwpoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(WWPOINTS$42);
                return target;
            }
        }
        
        /**
         * True if has "wwpoints" attribute
         */
        public boolean isSetWwpoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WWPOINTS$42) != null;
            }
        }
        
        /**
         * Sets the "wwpoints" attribute
         */
        public void setWwpoints(float wwpoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WWPOINTS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WWPOINTS$42);
                }
                target.setFloatValue(wwpoints);
            }
        }
        
        /**
         * Sets (as xml) the "wwpoints" attribute
         */
        public void xsetWwpoints(org.apache.xmlbeans.XmlFloat wwpoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(WWPOINTS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(WWPOINTS$42);
                }
                target.set(wwpoints);
            }
        }
        
        /**
         * Unsets the "wwpoints" attribute
         */
        public void unsetWwpoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WWPOINTS$42);
            }
        }
        /**
         * An XML content(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public static class ContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.HeadDocument.Head.Content
        {
            private static final long serialVersionUID = 1L;
            
            public ContentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName VALUE$2 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                    }
                    target.set(value);
                }
            }
        }
    }
}
