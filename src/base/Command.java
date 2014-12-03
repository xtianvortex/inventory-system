/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import exceptions.ExecutorException;
import java.util.Map;

/**
 *
 * @author tan
 */
public abstract class Command {
    protected UI elements;
    protected Map fields;
    public abstract void execute() throws ExecutorException ;
}
