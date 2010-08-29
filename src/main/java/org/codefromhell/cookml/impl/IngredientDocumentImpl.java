/*
 * An XML document type.
 * Localname: ingredient
 * Namespace: http://codefromhell.org/cookml
 * Java type: org.codefromhell.cookml.IngredientDocument
 *
 * Automatically generated - do not modify.
 */
package org.codefromhell.cookml.impl;
/**
 * A document containing one ingredient(@http://codefromhell.org/cookml) element.
 *
 * This is a complex type.
 */
public class IngredientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.IngredientDocument
{
    private static final long serialVersionUID = 1L;
    
    public IngredientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INGREDIENT$0 = 
        new javax.xml.namespace.QName("http://codefromhell.org/cookml", "ingredient");
    
    
    /**
     * Gets the "ingredient" element
     */
    public org.codefromhell.cookml.IngredientDocument.Ingredient getIngredient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
            target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().find_element_user(INGREDIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ingredient" element
     */
    public void setIngredient(org.codefromhell.cookml.IngredientDocument.Ingredient ingredient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.codefromhell.cookml.IngredientDocument.Ingredient target = null;
            target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().find_element_user(INGREDIENT$0, 0);
            if (target == null)
            {
                target = (org.codefromhell.cookml.IngredientDocument.Ingredient)get_store().add_element_user(INGREDIENT$0);
            }
            target.set(ingredient);
        }
    }
    
    /**
     * Appends and returns a new empty "ingredient" element
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
     * An XML ingredient(@http://codefromhell.org/cookml).
     *
     * This is a complex type.
     */
    public static class IngredientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.codefromhell.cookml.IngredientDocument.Ingredient
    {
        private static final long serialVersionUID = 1L;
        
        public IngredientImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INOTE$0 = 
            new javax.xml.namespace.QName("http://codefromhell.org/cookml", "inote");
        private static final javax.xml.namespace.QName QTY$2 = 
            new javax.xml.namespace.QName("", "qty");
        private static final javax.xml.namespace.QName UNIT$4 = 
            new javax.xml.namespace.QName("", "unit");
        private static final javax.xml.namespace.QName ITEM$6 = 
            new javax.xml.namespace.QName("", "item");
        private static final javax.xml.namespace.QName BLS$8 = 
            new javax.xml.namespace.QName("", "bls");
        private static final javax.xml.namespace.QName GRAM$10 = 
            new javax.xml.namespace.QName("", "gram");
        private static final javax.xml.namespace.QName SHOP$12 = 
            new javax.xml.namespace.QName("", "shop");
        private static final javax.xml.namespace.QName CALC$14 = 
            new javax.xml.namespace.QName("", "calc");
        private static final javax.xml.namespace.QName RIDLINK$16 = 
            new javax.xml.namespace.QName("", "ridlink");
        
        
        /**
         * Gets array of all "inote" elements
         */
        public java.lang.String[] getInoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INOTE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "inote" element
         */
        public java.lang.String getInoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INOTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "inote" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetInoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INOTE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "inote" element
         */
        public org.apache.xmlbeans.XmlString xgetInoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INOTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "inote" element
         */
        public int sizeOfInoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INOTE$0);
            }
        }
        
        /**
         * Sets array of all "inote" element
         */
        public void setInoteArray(java.lang.String[] inoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inoteArray, INOTE$0);
            }
        }
        
        /**
         * Sets ith "inote" element
         */
        public void setInoteArray(int i, java.lang.String inote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INOTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(inote);
            }
        }
        
        /**
         * Sets (as xml) array of all "inote" element
         */
        public void xsetInoteArray(org.apache.xmlbeans.XmlString[]inoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inoteArray, INOTE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "inote" element
         */
        public void xsetInoteArray(int i, org.apache.xmlbeans.XmlString inote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INOTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(inote);
            }
        }
        
        /**
         * Inserts the value as the ith "inote" element
         */
        public void insertInote(int i, java.lang.String inote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INOTE$0, i);
                target.setStringValue(inote);
            }
        }
        
        /**
         * Appends the value as the last "inote" element
         */
        public void addInote(java.lang.String inote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INOTE$0);
                target.setStringValue(inote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "inote" element
         */
        public org.apache.xmlbeans.XmlString insertNewInote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(INOTE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "inote" element
         */
        public org.apache.xmlbeans.XmlString addNewInote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INOTE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "inote" element
         */
        public void removeInote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INOTE$0, i);
            }
        }
        
        /**
         * Gets the "qty" attribute
         */
        public float getQty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QTY$2);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "qty" attribute
         */
        public org.apache.xmlbeans.XmlFloat xgetQty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(QTY$2);
                return target;
            }
        }
        
        /**
         * True if has "qty" attribute
         */
        public boolean isSetQty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(QTY$2) != null;
            }
        }
        
        /**
         * Sets the "qty" attribute
         */
        public void setQty(float qty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QTY$2);
                }
                target.setFloatValue(qty);
            }
        }
        
        /**
         * Sets (as xml) the "qty" attribute
         */
        public void xsetQty(org.apache.xmlbeans.XmlFloat qty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(QTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(QTY$2);
                }
                target.set(qty);
            }
        }
        
        /**
         * Unsets the "qty" attribute
         */
        public void unsetQty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(QTY$2);
            }
        }
        
        /**
         * Gets the "unit" attribute
         */
        public java.lang.String getUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "unit" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$4);
                return target;
            }
        }
        
        /**
         * True if has "unit" attribute
         */
        public boolean isSetUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UNIT$4) != null;
            }
        }
        
        /**
         * Sets the "unit" attribute
         */
        public void setUnit(java.lang.String unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$4);
                }
                target.setStringValue(unit);
            }
        }
        
        /**
         * Sets (as xml) the "unit" attribute
         */
        public void xsetUnit(org.apache.xmlbeans.XmlString unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIT$4);
                }
                target.set(unit);
            }
        }
        
        /**
         * Unsets the "unit" attribute
         */
        public void unsetUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UNIT$4);
            }
        }
        
        /**
         * Gets the "item" attribute
         */
        public java.lang.String getItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEM$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "item" attribute
         */
        public org.apache.xmlbeans.XmlString xgetItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ITEM$6);
                return target;
            }
        }
        
        /**
         * Sets the "item" attribute
         */
        public void setItem(java.lang.String item)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEM$6);
                }
                target.setStringValue(item);
            }
        }
        
        /**
         * Sets (as xml) the "item" attribute
         */
        public void xsetItem(org.apache.xmlbeans.XmlString item)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ITEM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ITEM$6);
                }
                target.set(item);
            }
        }
        
        /**
         * Gets the "bls" attribute
         */
        public java.lang.String getBls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLS$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bls" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BLS$8);
                return target;
            }
        }
        
        /**
         * True if has "bls" attribute
         */
        public boolean isSetBls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BLS$8) != null;
            }
        }
        
        /**
         * Sets the "bls" attribute
         */
        public void setBls(java.lang.String bls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLS$8);
                }
                target.setStringValue(bls);
            }
        }
        
        /**
         * Sets (as xml) the "bls" attribute
         */
        public void xsetBls(org.apache.xmlbeans.XmlString bls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BLS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BLS$8);
                }
                target.set(bls);
            }
        }
        
        /**
         * Unsets the "bls" attribute
         */
        public void unsetBls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BLS$8);
            }
        }
        
        /**
         * Gets the "gram" attribute
         */
        public java.math.BigInteger getGram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRAM$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gram" attribute
         */
        public org.apache.xmlbeans.XmlUnsignedLong xgetGram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(GRAM$10);
                return target;
            }
        }
        
        /**
         * True if has "gram" attribute
         */
        public boolean isSetGram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GRAM$10) != null;
            }
        }
        
        /**
         * Sets the "gram" attribute
         */
        public void setGram(java.math.BigInteger gram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRAM$10);
                }
                target.setBigIntegerValue(gram);
            }
        }
        
        /**
         * Sets (as xml) the "gram" attribute
         */
        public void xsetGram(org.apache.xmlbeans.XmlUnsignedLong gram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedLong target = null;
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(GRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_attribute_user(GRAM$10);
                }
                target.set(gram);
            }
        }
        
        /**
         * Unsets the "gram" attribute
         */
        public void unsetGram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GRAM$10);
            }
        }
        
        /**
         * Gets the "shop" attribute
         */
        public boolean getShop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOP$12);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "shop" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetShop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOP$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "shop" attribute
         */
        public boolean isSetShop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHOP$12) != null;
            }
        }
        
        /**
         * Sets the "shop" attribute
         */
        public void setShop(boolean shop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOP$12);
                }
                target.setBooleanValue(shop);
            }
        }
        
        /**
         * Sets (as xml) the "shop" attribute
         */
        public void xsetShop(org.apache.xmlbeans.XmlBoolean shop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOP$12);
                }
                target.set(shop);
            }
        }
        
        /**
         * Unsets the "shop" attribute
         */
        public void unsetShop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHOP$12);
            }
        }
        
        /**
         * Gets the "calc" attribute
         */
        public boolean getCalc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALC$14);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "calc" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCalc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALC$14);
                return target;
            }
        }
        
        /**
         * True if has "calc" attribute
         */
        public boolean isSetCalc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CALC$14) != null;
            }
        }
        
        /**
         * Sets the "calc" attribute
         */
        public void setCalc(boolean calc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALC$14);
                }
                target.setBooleanValue(calc);
            }
        }
        
        /**
         * Sets (as xml) the "calc" attribute
         */
        public void xsetCalc(org.apache.xmlbeans.XmlBoolean calc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CALC$14);
                }
                target.set(calc);
            }
        }
        
        /**
         * Unsets the "calc" attribute
         */
        public void unsetCalc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CALC$14);
            }
        }
        
        /**
         * Gets the "ridlink" attribute
         */
        public java.lang.String getRidlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIDLINK$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ridlink" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRidlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIDLINK$16);
                return target;
            }
        }
        
        /**
         * True if has "ridlink" attribute
         */
        public boolean isSetRidlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RIDLINK$16) != null;
            }
        }
        
        /**
         * Sets the "ridlink" attribute
         */
        public void setRidlink(java.lang.String ridlink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIDLINK$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIDLINK$16);
                }
                target.setStringValue(ridlink);
            }
        }
        
        /**
         * Sets (as xml) the "ridlink" attribute
         */
        public void xsetRidlink(org.apache.xmlbeans.XmlString ridlink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIDLINK$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RIDLINK$16);
                }
                target.set(ridlink);
            }
        }
        
        /**
         * Unsets the "ridlink" attribute
         */
        public void unsetRidlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RIDLINK$16);
            }
        }
    }
}
