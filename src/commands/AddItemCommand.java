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
public class AddItemCommand extends Command {
    
    public AddItemCommand(JFrame ui){
        uiElements = ui;
    }
    
    @Override
    public void execute() {
        // TODO
    }
    
}
