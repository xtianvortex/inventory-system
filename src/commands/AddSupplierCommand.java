/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import javax.swing.JTextField;
import models.Supplier;
import models.factory.ModelFactory;

/**
 *
 * @author tan
 */
public class AddSupplierCommand extends Command {
    
    public AddSupplierCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }

    @Override
    public void execute() {
        Supplier newSupplier = ModelFactory.createSupplier();
        
        JTextField city = (JTextField) fields.get("city_field");
        // TODO
        
        //newSupplier.commit();
    }
    
}
