/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import static base.Database.EMF;
import javax.persistence.EntityManager;

/**
 *
 * @author tan
 */
public abstract class Commitable {
    protected EntityManager em;
    
    /**
     * This method commits the object to the database
     */
    public void commit(){
        em.persist(this);
        em.getTransaction().commit();
    }
    
    /**
     * This method deletes the object
     * from the database
     */
    public void delete(){
        em.remove(this);
        em.getTransaction().commit();
    }
    
    /**
     * This method updates the object
     * from the database
     */
    public void update(){
        em.getTransaction().commit();
    }
}
