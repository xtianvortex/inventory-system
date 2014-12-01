/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Item;
import models.factory.ModelFactory;

/**
 *
 * @author tan
 * 
 * This class is just used for testing.
 * Not supposed to be in final.
 */

public class TestClass {
    public static void main(String[] args) {
        Item item = ModelFactory.createItem();
        item.setName("New item, very new");
        item.commit();
    }
}
