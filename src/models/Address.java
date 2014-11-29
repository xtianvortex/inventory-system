/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author tan
 */

@Embeddable
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column(name="STREET_ADDRESS")
    private String street;
    
    // TODO
    
}
