/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics;

import base.Command;
import exceptions.ExecutorException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tan
 */
public class Executor {
    private static Map<String, Command> commands = new HashMap<>();
    
    public static void put(String key, Command value){
        commands.put(key, value);
    }
    
    public static void execute(String key) throws ExecutorException{
        Command value = commands.get(key);
        if(value==null)
            throw new ExecutorException("Executor does not have the " + key + " command.");
        value.execute();
    }
    
}