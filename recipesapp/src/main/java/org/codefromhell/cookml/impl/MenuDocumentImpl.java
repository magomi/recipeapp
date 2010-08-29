/*
 * An XML document type.
 * Localname: menu
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.MenuDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one menu(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class MenuDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.MenuDocument
{
    private static final long serialVersionUID = 1L;
    
    public MenuDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENU$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "menu");
    
    
    /**
     * Gets the "menu" element
     */
    public org.codefromhell.cookml.MenuDocument.Menu getMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MenuDocument.Menu target = null;
            target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().find_element_user(MENU$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "menu" element
     */
    public void setMenu(org.codefromhell.cookml.MenuDocument.Menu menu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MenuDocument.Menu target = null;
            target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().find_element_user(MENU$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().add_element_user(MENU$0);
            }
            target.set(menu);
        }
    }
    
    /**
     * Appends and returns a new empty "menu" element
     */
    public org.codefromhell.cookml.MenuDocument.Menu addNewMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.MenuDocument.Menu target = null;
            target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().add_element_user(MENU$0);
            return target;
        }
    }
    /**
     * An XML menu(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class MenuImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.MenuDocument.Menu
    {
        private static final long serialVersionUID = 1L;
        
        public MenuImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MCUSTOM$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "mcustom");
        private static final javax.xml.namespace.QName MRECIPE$2 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "mrecipe");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("", "title");
        
        
        /**
         * Gets array of all "mcustom" elements
         */
        public org.codefromhell.cookml.McustomDocument.Mcustom[] getMcustomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MCUSTOM$0, targetList);
                org.codefromhell.cookml.McustomDocument.Mcustom[] result = new org.codefromhell.cookml.McustomDocument.Mcustom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "mcustom" element
         */
        public org.codefromhell.cookml.McustomDocument.Mcustom getMcustomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.McustomDocument.Mcustom target = null;
                target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().find_element_user(MCUSTOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "mcustom" element
         */
        public int sizeOfMcustomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MCUSTOM$0);
            }
        }
        
        /**
         * Sets array of all "mcustom" element
         */
        public void setMcustomArray(org.codefromhell.cookml.McustomDocument.Mcustom[] mcustomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mcustomArray, MCUSTOM$0);
            }
        }
        
        /**
         * Sets ith "mcustom" element
         */
        public void setMcustomArray(int i, org.codefromhell.cookml.McustomDocument.Mcustom mcustom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.McustomDocument.Mcustom target = null;
                target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().find_element_user(MCUSTOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mcustom);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mcustom" element
         */
        public org.codefromhell.cookml.McustomDocument.Mcustom insertNewMcustom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.McustomDocument.Mcustom target = null;
                target = (org.codefromhell.cookml.McustomDocument.Mcustom)get_store().insert_element_user(MCUSTOM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mcustom" element
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
         * Removes the ith "mcustom" element
         */
        public void removeMcustom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MCUSTOM$0, i);
            }
        }
        
        /**
         * Gets array of all "mrecipe" elements
         */
        public org.codefromhell.cookml.MrecipeDocument.Mrecipe[] getMrecipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MRECIPE$2, targetList);
                org.codefromhell.cookml.MrecipeDocument.Mrecipe[] result = new org.codefromhell.cookml.MrecipeDocument.Mrecipe[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "mrecipe" element
         */
        public org.codefromhell.cookml.MrecipeDocument.Mrecipe getMrecipeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
                target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().find_element_user(MRECIPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "mrecipe" element
         */
        public int sizeOfMrecipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MRECIPE$2);
            }
        }
        
        /**
         * Sets array of all "mrecipe" element
         */
        public void setMrecipeArray(org.codefromhell.cookml.MrecipeDocument.Mrecipe[] mrecipeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mrecipeArray, MRECIPE$2);
            }
        }
        
        /**
         * Sets ith "mrecipe" element
         */
        public void setMrecipeArray(int i, org.codefromhell.cookml.MrecipeDocument.Mrecipe mrecipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
                target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().find_element_user(MRECIPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mrecipe);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mrecipe" element
         */
        public org.codefromhell.cookml.MrecipeDocument.Mrecipe insertNewMrecipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
                target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().insert_element_user(MRECIPE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mrecipe" element
         */
        public org.codefromhell.cookml.MrecipeDocument.Mrecipe addNewMrecipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MrecipeDocument.Mrecipe target = null;
                target = (org.codefromhell.cookml.MrecipeDocument.Mrecipe)get_store().add_element_user(MRECIPE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "mrecipe" element
         */
        public void removeMrecipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MRECIPE$2, i);
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
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$4) != null;
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
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$4);
            }
        }
    }
}
