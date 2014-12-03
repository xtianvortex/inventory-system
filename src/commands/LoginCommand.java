/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.Commitable;
import base.UI;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Monkey;

/**
 *
 * @author tan
 */
public class LoginCommand extends Command {
    
    public LoginCommand(UI ui){
        elements = ui;
    }

    @Override
    public void execute() {
        Map fields = elements.getFields();
        
        JTextField usernameField = (JTextField) fields.get("username_field");
        JPasswordField passwordField = (JPasswordField) fields.get("password_field");
        
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        login(username, password);
    }
    
    private void login(String username, String password){
        EntityManager em = Commitable.emf.createEntityManager();
        
        em.getTransaction().begin();
        StringBuilder builder = new StringBuilder("SELECT * FROM MONKEY WHERE ");
        builder.append("USERNAME=").append("\'").append(username).append("\'")
                .append(" AND PASSWORD=").append("\'").append(password).append("\'");
        Monkey monkey = (Monkey) em.createNativeQuery(builder.toString(), Monkey.class).getSingleResult();
        
        // TODO
        
    }
    
}
