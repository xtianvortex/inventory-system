/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import exceptions.ExecutorException;
import javax.swing.JTextField;
import models.Category;
import models.factory.ModelFactory;

/**
 *
 * @author tan
 */
public class AddCategoryCommand extends Command {
    
    public AddCategoryCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }

    @Override
    public void execute() throws ExecutorException {
        Category newCategory = ModelFactory.createCategory();
        
        
        JTextField name = (JTextField) fields.get("categoryName_field");
        // TODO
        throw new UnsupportedOperationException("FIXME: complete execute() function");
        //newCategory.commit();
    }
    
}
