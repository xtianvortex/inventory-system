/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands.factory;

import base.Command;
import base.UI;
import commands.*;

/**
 *
 * @author tan
 */
public class CommandFactory {
    
    /**
     * 
     * @param ui the UI object to bound this command with.
     * @return a login command bounded with the UI elements.
     */
    public static Command createLoginCommand(UI ui){
        return new LoginCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bound this command with.
     * @return an add item command bounded with the UI elements.
     */
    public static Command createAddItemCommand(UI ui){
        return new AddItemCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bound this command with.
     * @return an add supplier command bounded with the UI elements
     */
    public static Command createAddSupplierCommand(UI ui){
        return new AddSupplierCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bound this command with.
     * @return a remove item command bounded with the UI elements.
     */
    public static Command createRemoveItemCommand(UI ui){
        return new RemoveItemCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bind this command with.
     * @return a command to add a category
     */
    public static Command createAddCategoryCommand(UI ui){
        return new AddCategoryCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bind this command with.
     * @return a command to add quantity to an Item
     */
    public static Command createAddQuantityCommand(UI ui){
        return new AddQuantityCommand(ui);
    }
    
    /**
     * 
     * @param ui the UI object to bind this command with.
     * @return a command that creates a request.
     */
    public static Command createRequestCommand(UI ui){
        return new RequestCommand(ui);
    }
}
