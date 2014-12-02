/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands.factory;

import base.Command;
import base.UI;
import commands.AddItemCommand;
import commands.AddSupplierCommand;
import commands.LoginCommand;
import commands.RemoveItemCommand;

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
    
    
}
