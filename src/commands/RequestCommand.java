/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import models.PurchaseRequest;
import models.factory.ModelFactory;
import base.UI;

/**
 *
 * @author tan
 */
public class RequestCommand extends Command {
    
    public RequestCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }

    @Override
    public void execute() {
        JComboBox item =  (JComboBox) fields.get("requestItem_combo");
        JSpinner quantity = (JSpinner) fields.get("quantity_spinner");
        
        PurchaseRequest request = ModelFactory.createRequest();
    }
    
}
