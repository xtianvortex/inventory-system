/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.factory;

import models.Address;
import models.Category;
import models.Item;
import models.Monkey;
import models.Supplier;

/**
 *
 * @author tan
 */
public class ModelFactory {
    /**
     * 
     * @return a new Item object
     */
    public static Item createItem(){
        return new Item();
    }
    
    /**
     * 
     * @return a new Category object
     */
    public static Category createCategory(){
        return new Category();
    }
    
    /**
     * 
     * @return a new Address object
     */
    public static Address createAddress(){
        return new Address();
    }
    
    /**
     * 
     * @return a new Monkey(User) object
     */
    public static Monkey createMonkey(){
        return new Monkey();
    }
    
    /**
     * 
     * @return a new Supplier object
     */
    public static Supplier createSupplier(){
        return new Supplier();
    }
}
