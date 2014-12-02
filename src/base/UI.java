/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author tan
 */
public abstract class UI extends JFrame {
    
    /**
     * 
     * @return a Map of the fields in the program.
     * The fields are mapped by their set name.
     * 
     * Implementation must put the usable fields one-by-one.
     */
    public abstract Map getFields();
}
