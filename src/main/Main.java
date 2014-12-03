/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import base.Database;
import javax.swing.JFrame;
import models.Monkey;
import models.factory.ModelFactory;
import ui.LoginWindow;

/**
 *
 * @author tan
 */
public class Main {
    private static Database inventory;
    
    public Main(){
        inventory = new Database();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    
    private static void start(){
        JFrame login = new LoginWindow();
        login.setVisible(true);
    }
}
