/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import base.Commitable;
import static base.Database.EMF;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tan
 */

@Entity
@Table(name="DEPARTMENT")
public class Department extends Commitable implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public Department(){
        em = EMF.createEntityManager();
        em.getTransaction().begin();
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="DEPARTMENT_HEAD")
    private Monkey DepartmentHead;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the DepartmentHead
     */
    public Monkey getDepartmentHead() {
        return DepartmentHead;
    }

    /**
     * @param DepartmentHead the DepartmentHead to set
     */
    public void setDepartmentHead(Monkey DepartmentHead) {
        this.DepartmentHead = DepartmentHead;
    }
    
   
}
