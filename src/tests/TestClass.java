/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import javax.swing.JFrame;
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
        //System.out.println("something");
        JFrame main = new LoginWindow();
        main.setVisible(true);
    }
}
