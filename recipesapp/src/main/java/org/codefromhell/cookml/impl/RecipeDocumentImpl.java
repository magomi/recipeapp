/*
 * An XML document type.
 * Localname: recipe
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.RecipeDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one recipe(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class RecipeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RecipeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecipeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIPE$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "recipe");
    
    
    /**
     * Gets the "recipe" element
     */
    public org.codefromhell.cookml.RecipeDocument.Recipe getRecipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RecipeDocument.Recipe target = null;
            target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().find_element_user(RECIPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recipe" element
     */
    public void setRecipe(org.codefromhell.cookml.RecipeDocument.Recipe recipe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RecipeDocument.Recipe target = null;
            target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().find_element_user(RECIPE$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().add_element_user(RECIPE$0);
            }
            target.set(recipe);
        }
    }
    
    /**
     * Appends and returns a new empty "recipe" element
     */
    public org.codefromhell.cookml.RecipeDocument.Recipe addNewRecipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.RecipeDocument.Recipe target = null;
            target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().add_element_user(RECIPE$0);
            return target;
        }
    }
    /**
     * An XML recipe(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class RecipeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RecipeDocument.Recipe
    {
        private static final long serialVersionUID = 1L;
        
        public RecipeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEAD$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "head");
        private static final javax.xml.namespace.QName CUSTOM$2 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "custom");
        private static final javax.xml.namespace.QName PART$4 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "part");
        private static final javax.xml.namespace.QName PREPARATION$6 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "preparation");
        private static final javax.xml.namespace.QName REMARK$8 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "remark");
        private static final javax.xml.namespace.QName LANG$10 = 
            new javax.xml.namespace.QName("", "lang");
        
        
        /**
         * Gets array of all "head" elements
         */
        public org.codefromhell.cookml.HeadDocument.Head[] getHeadArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HEAD$0, targetList);
                org.codefromhell.cookml.HeadDocument.Head[] result = new org.codefromhell.cookml.HeadDocument.Head[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "head" element
         */
        public org.codefromhell.cookml.HeadDocument.Head getHeadArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head)get_store().find_element_user(HEAD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "head" element
         */
        public int sizeOfHeadArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEAD$0);
            }
        }
        
        /**
         * Sets array of all "head" element
         */
        public void setHeadArray(org.codefromhell.cookml.HeadDocument.Head[] headArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(headArray, HEAD$0);
            }
        }
        
        /**
         * Sets ith "head" element
         */
        public void setHeadArray(int i, org.codefromhell.cookml.HeadDocument.Head head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head)get_store().find_element_user(HEAD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(head);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "head" element
         */
        public org.codefromhell.cookml.HeadDocument.Head insertNewHead(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.HeadDocument.Head target = null;
                target = (org.codefromhell.cookml.HeadDocument.Head)get_store().insert_element_user(HEAD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "head" element
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
         * Removes the ith "head" element
         */
        public void removeHead(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEAD$0, i);
            }
        }
        
        /**
         * Gets array of all "custom" elements
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Custom[] getCustomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CUSTOM$2, targetList);
                org.codefromhell.cookml.RecipeDocument.Recipe.Custom[] result = new org.codefromhell.cookml.RecipeDocument.Recipe.Custom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "custom" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Custom getCustomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Custom target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Custom)get_store().find_element_user(CUSTOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "custom" element
         */
        public int sizeOfCustomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOM$2);
            }
        }
        
        /**
         * Sets array of all "custom" element
         */
        public void setCustomArray(org.codefromhell.cookml.RecipeDocument.Recipe.Custom[] customArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(customArray, CUSTOM$2);
            }
        }
        
        /**
         * Sets ith "custom" element
         */
        public void setCustomArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe.Custom custom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Custom target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Custom)get_store().find_element_user(CUSTOM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(custom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "custom" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Custom insertNewCustom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Custom target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Custom)get_store().insert_element_user(CUSTOM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "custom" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Custom addNewCustom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Custom target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Custom)get_store().add_element_user(CUSTOM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "custom" element
         */
        public void removeCustom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOM$2, i);
            }
        }
        
        /**
         * Gets array of all "part" elements
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Part[] getPartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PART$4, targetList);
                org.codefromhell.cookml.RecipeDocument.Recipe.Part[] result = new org.codefromhell.cookml.RecipeDocument.Recipe.Part[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "part" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Part getPartArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Part target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Part)get_store().find_element_user(PART$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "part" element
         */
        public int sizeOfPartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PART$4);
            }
        }
        
        /**
         * Sets array of all "part" element
         */
        public void setPartArray(org.codefromhell.cookml.RecipeDocument.Recipe.Part[] partArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(partArray, PART$4);
            }
        }
        
        /**
         * Sets ith "part" element
         */
        public void setPartArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe.Part part)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Part target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Part)get_store().find_element_user(PART$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(part);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "part" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Part insertNewPart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Part target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Part)get_store().insert_element_user(PART$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "part" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe.Part addNewPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe.Part target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe.Part)get_store().add_element_user(PART$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "part" element
         */
        public void removePart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PART$4, i);
            }
        }
        
        /**
         * Gets array of all "preparation" elements
         */
        public org.codefromhell.cookml.PreparationDocument.Preparation[] getPreparationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PREPARATION$6, targetList);
                org.codefromhell.cookml.PreparationDocument.Preparation[] result = new org.codefromhell.cookml.PreparationDocument.Preparation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "preparation" element
         */
        public org.codefromhell.cookml.PreparationDocument.Preparation getPreparationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PreparationDocument.Preparation target = null;
                target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().find_element_user(PREPARATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "preparation" element
         */
        public int sizeOfPreparationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREPARATION$6);
            }
        }
        
        /**
         * Sets array of all "preparation" element
         */
        public void setPreparationArray(org.codefromhell.cookml.PreparationDocument.Preparation[] preparationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(preparationArray, PREPARATION$6);
            }
        }
        
        /**
         * Sets ith "preparation" element
         */
        public void setPreparationArray(int i, org.codefromhell.cookml.PreparationDocument.Preparation preparation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PreparationDocument.Preparation target = null;
                target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().find_element_user(PREPARATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(preparation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "preparation" element
         */
        public org.codefromhell.cookml.PreparationDocument.Preparation insertNewPreparation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PreparationDocument.Preparation target = null;
                target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().insert_element_user(PREPARATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "preparation" element
         */
        public org.codefromhell.cookml.PreparationDocument.Preparation addNewPreparation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.PreparationDocument.Preparation target = null;
                target = (org.codefromhell.cookml.PreparationDocument.Preparation)get_store().add_element_user(PREPARATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "preparation" element
         */
        public void removePreparation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREPARATION$6, i);
            }
        }
        
        /**
         * Gets array of all "remark" elements
         */
        public org.codefromhell.cookml.RemarkDocument.Remark[] getRemarkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REMARK$8, targetList);
                org.codefromhell.cookml.RemarkDocument.Remark[] result = new org.codefromhell.cookml.RemarkDocument.Remark[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "remark" element
         */
        public org.codefromhell.cookml.RemarkDocument.Remark getRemarkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RemarkDocument.Remark target = null;
                target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().find_element_user(REMARK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "remark" element
         */
        public int sizeOfRemarkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMARK$8);
            }
        }
        
        /**
         * Sets array of all "remark" element
         */
        public void setRemarkArray(org.codefromhell.cookml.RemarkDocument.Remark[] remarkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(remarkArray, REMARK$8);
            }
        }
        
        /**
         * Sets ith "remark" element
         */
        public void setRemarkArray(int i, org.codefromhell.cookml.RemarkDocument.Remark remark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RemarkDocument.Remark target = null;
                target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().find_element_user(REMARK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(remark);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "remark" element
         */
        public org.codefromhell.cookml.RemarkDocument.Remark insertNewRemark(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RemarkDocument.Remark target = null;
                target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().insert_element_user(REMARK$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "remark" element
         */
        public org.codefromhell.cookml.RemarkDocument.Remark addNewRemark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RemarkDocument.Remark target = null;
                target = (org.codefromhell.cookml.RemarkDocument.Remark)get_store().add_element_user(REMARK$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "remark" element
         */
        public void removeRemark(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMARK$8, i);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
                return target;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$10);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$10);
                }
                target.set(lang);
            }
        }
        /**
         * An XML custom(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public static class CustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RecipeDocument.Recipe.Custom
        {
            private static final long serialVersionUID = 1L;
            
            public CustomImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML part(@http://codefromhell.org/cookml).
         *
         * This is a complex type.
         */
        public static class PartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.RecipeDocument.Recipe.Part
        {
            private static final long serialVersionUID = 1L;
            
            public PartImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INGREDIENT$0 = 
                new javax.xml.namespace.QName("http://codefromhell.org/cookml", "ingredient");
            private static final javax.xml.namespace.QName TITLE$2 = 
                new javax.xml.namespace.QName("", "title");
            
            
            /**
             * Gets array of all "ingredient" elements
             */
            public org.codefromhell.cookml.IngredientDocument.Ingredient[] getIngredientArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INGREDIENT$0, targetList);
                    org.codefromhell.cookml.IngredientDocument.Ingredient[] result = new org.codefromhell.cookml.IngredientDocument.Ingredient[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ingredient" element
             */
            public org.codefromhell.cookml.IngredientDocument.Ingredient getIngredientArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
                    target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().find_element_user(INGREDIENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ingredient" element
             */
            public int sizeOfIngredientArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INGREDIENT$0);
                }
            }
            
            /**
             * Sets array of all "ingredient" element
             */
            public void setIngredientArray(org.codefromhell.cookml.IngredientDocument.Ingredient[] ingredientArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(ingredientArray, INGREDIENT$0);
                }
            }
            
            /**
             * Sets ith "ingredient" element
             */
            public void setIngredientArray(int i, org.codefromhell.cookml.IngredientDocument.Ingredient ingredient)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
                    target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().find_element_user(INGREDIENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(ingredient);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ingredient" element
             */
            public org.codefromhell.cookml.IngredientDocument.Ingredient insertNewIngredient(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
                    target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().insert_element_user(INGREDIENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ingredient" element
             */
            public org.codefromhell.cookml.IngredientDocument.Ingredient addNewIngredient()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
                    target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().add_element_user(INGREDIENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ingredient" element
             */
            public void removeIngredient(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INGREDIENT$0, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
                    return target;
                }
            }
            
            /**
             * True if has "title" attribute
             */
            public boolean isSetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TITLE$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$2);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Unsets the "title" attribute
             */
            public void unsetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TITLE$2);
                }
            }
        }
    }
}
