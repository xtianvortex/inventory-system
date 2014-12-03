/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import models.Item;
import models.factory.ModelFactory;

/**
 *
 * @author tan
 */
public class AddItemCommand extends Command {
    
    public AddItemCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }
    
    @Override
    public void execute() {
        Item item = ModelFactory.createItem();
        JComboBox category = (JComboBox) fields.get("category_combo");
        // TODO
    }
    
}
