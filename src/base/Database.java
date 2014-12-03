/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tan
 */
public class Database {
    public static EntityManagerFactory EMF;
    
    public Database(){
        EMF = Persistence.createEntityManagerFactory("InventoryPersistence");
        loadDatabase();
    }
    
    private void loadDatabase(){
        EntityManager em = EMF.createEntityManager();
        Query users = em.createNativeQuery("SELECT * FROM MONKEY");
        users.getResultList();
        
        em.close();
    }
}
