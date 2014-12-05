/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import static base.Database.EMF;
import base.UI;
import exceptions.ExecutorException;
import javax.persistence.EntityManager;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import models.Item;

/**
 *
 * @author tan
 */
public class AddQuantityCommand extends Command {
    
    public AddQuantityCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }

    @Override
    public void execute() throws ExecutorException {
        JComboBox item = (JComboBox) fields.get("itemName_combo");
        JSpinner quantity = (JSpinner) fields.get("quantity_field");
        Item selectedItem = (Item) item.getSelectedItem();
        int selectedQuantity = (int) quantity.getValue();
        
        selectedItem.incQuantity(selectedQuantity);
        selectedItem.update();
    }
    
}
