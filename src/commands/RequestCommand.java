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

/**
 *
 * @author tan
 */
public class RequestCommand extends Command {

    @Override
    public void execute() {
        JComboBox item =  (JComboBox) fields.get("requestItem_combo");
        JSpinner quantity = (JSpinner) fields.get("quantity_spinner");
        
        PurchaseRequest request = ModelFactory.createRequest();
    }
    
}
