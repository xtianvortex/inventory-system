/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import javax.swing.JFrame;

/**
 *
 * @author tan
 */
public abstract class Command {
    protected JFrame uiElements;
    public abstract void execute();
}