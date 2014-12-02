/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Transient;

/**
 *
 * @author tan
 */
public abstract class Commitable {
    
    @Transient
    protected static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("InventoryPersistence");
    
    /**
     * This method commits the object to the database
     */
    public void commit(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(this);
        em.getTransaction().commit();
        em.close();
    }
    
    /**
     * This method deletes the matching object
     * from the database
     */
    public void delete(){
        // TODO
    }
}
