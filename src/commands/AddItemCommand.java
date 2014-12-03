/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import models.Item;
import models.factory.ModelFactory;

/**
 *
 * @author tan
 */
public class AddItemCommand extends Command {
    
    public AddItemCommand(UI ui){
        elements = ui;
        
    }
    
    @Override
    public void execute() {

    }
    
}
