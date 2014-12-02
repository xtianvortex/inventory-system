/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import javax.swing.JFrame;

/**
 *
 * @author tan
 */
public class LoginCommand extends Command {
    
    public LoginCommand(JFrame ui){
        uiElements = ui;
    }

    @Override
    public void execute() {
        System.out.println("THIS BUTTON WAS PRESSED");
    }
    
}
