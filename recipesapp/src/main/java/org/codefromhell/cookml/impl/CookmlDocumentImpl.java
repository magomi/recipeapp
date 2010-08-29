/*
 * An XML document type.
 * Localname: cookml
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.CookmlDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one cookml(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class CookmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.CookmlDocument
{
    private static final long serialVersionUID = 1L;
    
    public CookmlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COOKML$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "cookml");
    
    
    /**
     * Gets the "cookml" element
     */
    public org.codefromhell.cookml.CookmlDocument.Cookml getCookml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.CookmlDocument.Cookml target = null;
            target = (org.codefromhell.cookml.CookmlDocument.Cookml)get_store().find_element_user(COOKML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cookml" element
     */
    public void setCookml(org.codefromhell.cookml.CookmlDocument.Cookml cookml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.CookmlDocument.Cookml target = null;
            target = (org.codefromhell.cookml.CookmlDocument.Cookml)get_store().find_element_user(COOKML$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.CookmlDocument.Cookml)get_store().add_element_user(COOKML$0);
            }
            target.set(cookml);
        }
    }
    
    /**
     * Appends and returns a new empty "cookml" element
     */
    public org.codefromhell.cookml.CookmlDocument.Cookml addNewCookml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.CookmlDocument.Cookml target = null;
            target = (org.codefromhell.cookml.CookmlDocument.Cookml)get_store().add_element_user(COOKML$0);
            return target;
        }
    }
    /**
     * An XML cookml(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class CookmlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.CookmlDocument.Cookml
    {
        private static final long serialVersionUID = 1L;
        
        public CookmlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECIPE$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "recipe");
        private static final javax.xml.namespace.QName MENU$2 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "menu");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PROG$8 = 
            new javax.xml.namespace.QName("", "prog");
        private static final javax.xml.namespace.QName PROGVER$10 = 
            new javax.xml.namespace.QName("", "progver");
        
        
        /**
         * Gets array of all "recipe" elements
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe[] getRecipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RECIPE$0, targetList);
                org.codefromhell.cookml.RecipeDocument.Recipe[] result = new org.codefromhell.cookml.RecipeDocument.Recipe[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recipe" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe getRecipeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().find_element_user(RECIPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recipe" element
         */
        public int sizeOfRecipeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECIPE$0);
            }
        }
        
        /**
         * Sets array of all "recipe" element
         */
        public void setRecipeArray(org.codefromhell.cookml.RecipeDocument.Recipe[] recipeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recipeArray, RECIPE$0);
            }
        }
        
        /**
         * Sets ith "recipe" element
         */
        public void setRecipeArray(int i, org.codefromhell.cookml.RecipeDocument.Recipe recipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().find_element_user(RECIPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(recipe);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recipe" element
         */
        public org.codefromhell.cookml.RecipeDocument.Recipe insertNewRecipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.RecipeDocument.Recipe target = null;
                target = (org.codefromhell.cookml.RecipeDocument.Recipe)get_store().insert_element_user(RECIPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recipe" element
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
         * Removes the ith "recipe" element
         */
        public void removeRecipe(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECIPE$0, i);
            }
        }
        
        /**
         * Gets array of all "menu" elements
         */
        public org.codefromhell.cookml.MenuDocument.Menu[] getMenuArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MENU$2, targetList);
                org.codefromhell.cookml.MenuDocument.Menu[] result = new org.codefromhell.cookml.MenuDocument.Menu[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "menu" element
         */
        public org.codefromhell.cookml.MenuDocument.Menu getMenuArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MenuDocument.Menu target = null;
                target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().find_element_user(MENU$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "menu" element
         */
        public int sizeOfMenuArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MENU$2);
            }
        }
        
        /**
         * Sets array of all "menu" element
         */
        public void setMenuArray(org.codefromhell.cookml.MenuDocument.Menu[] menuArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(menuArray, MENU$2);
            }
        }
        
        /**
         * Sets ith "menu" element
         */
        public void setMenuArray(int i, org.codefromhell.cookml.MenuDocument.Menu menu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MenuDocument.Menu target = null;
                target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().find_element_user(MENU$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(menu);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menu" element
         */
        public org.codefromhell.cookml.MenuDocument.Menu insertNewMenu(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MenuDocument.Menu target = null;
                target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().insert_element_user(MENU$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menu" element
         */
        public org.codefromhell.cookml.MenuDocument.Menu addNewMenu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.codefromhell.cookml.MenuDocument.Menu target = null;
                target = (org.codefromhell.cookml.MenuDocument.Menu)get_store().add_element_user(MENU$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "menu" element
         */
        public void removeMenu(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MENU$2, i);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
                return target;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$4);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$6);
            }
        }
        
        /**
         * Gets the "prog" attribute
         */
        public java.lang.String getProg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROG$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetProg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROG$8);
                return target;
            }
        }
        
        /**
         * Sets the "prog" attribute
         */
        public void setProg(java.lang.String prog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROG$8);
                }
                target.setStringValue(prog);
            }
        }
        
        /**
         * Sets (as xml) the "prog" attribute
         */
        public void xsetProg(org.apache.xmlbeans.XmlString prog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROG$8);
                }
                target.set(prog);
            }
        }
        
        /**
         * Gets the "progver" attribute
         */
        public java.lang.String getProgver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGVER$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "progver" attribute
         */
        public org.apache.xmlbeans.XmlString xgetProgver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGVER$10);
                return target;
            }
        }
        
        /**
         * Sets the "progver" attribute
         */
        public void setProgver(java.lang.String progver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGVER$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROGVER$10);
                }
                target.setStringValue(progver);
            }
        }
        
        /**
         * Sets (as xml) the "progver" attribute
         */
        public void xsetProgver(org.apache.xmlbeans.XmlString progver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGVER$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROGVER$10);
                }
                target.set(progver);
            }
        }
    }
}
