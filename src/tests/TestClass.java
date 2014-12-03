/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import base.Commitable;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import models.Contact;
import models.Monkey;
import models.factory.ModelFactory;
import ui.LoginWindow;


/**
 *
 * @author tan
 * 
 * This class is just used for testing.
 * Not supposed to be in final.
 */

public class TestClass {
    public static void main(String[] args) {
        EntityManager em = Commitable.emf.createEntityManager();
        em.getTransaction().begin();
        Monkey test = ModelFactory.createMonkey();
        test.setUsername("test");
        test.setPassword("123");
        test.setHead(true);
        Contact contact = new Contact();
        contact.setEmail("test@123.com");
        contact.setNumber("1234567890");
        test.setContact(contact);
        em.persist(test);
        em.getTransaction().commit();
        JFrame main = new LoginWindow();
        main.setVisible(true);
    }
}
