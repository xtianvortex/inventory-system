/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

<<<<<<< HEAD
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Item;
import models.factory.ModelFactory;
=======
import javax.swing.JFrame;
import ui.*;
>>>>>>> a76d56ae7a3e900d45bfaf799d53837c4ea89c2a

/**
 *
 * @author tan
 * 
 * This class is just used for testing.
 * Not supposed to be in final.
 */

public class TestClass {
    public static void main(String[] args) {
<<<<<<< HEAD
        Item item = ModelFactory.createItem();
        item.setName("New item, very new");
        item.commit();
=======
        JFrame test = new LoginWindow();
        test.show();
>>>>>>> a76d56ae7a3e900d45bfaf799d53837c4ea89c2a
    }
}
