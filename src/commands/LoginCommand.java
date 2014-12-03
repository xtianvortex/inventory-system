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
import javax.persistence.NoResultException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Monkey;

/**
 *
 * @author tan
 */
public class LoginCommand extends Command {
    
    Map fields;
    
    public LoginCommand(UI ui){
        elements = ui;
        fields = elements.getFields();
    }

    @Override
    public void execute() {
        
        JTextField usernameField = (JTextField) fields.get("username_field");
        JPasswordField passwordField = (JPasswordField) fields.get("password_field");
        
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        login(username, password);
    }
    
    private void login(String username, String password) {
        EntityManager em = Commitable.emf.createEntityManager();
        
        em.getTransaction().begin();
        StringBuilder builder = new StringBuilder("SELECT * FROM MONKEY WHERE ");
        builder.append("USERNAME=").append("\'").append(username).append("\'")
                .append(" AND PASSWORD=").append("\'").append(password).append("\'");
        
        try{
            Monkey monkey = (Monkey) em.createNativeQuery(builder.toString(), Monkey.class).getSingleResult();
        } catch(NoResultException inc){
            JLabel info = (JLabel) fields.get("information_label");
            info.setText("Login details incorrect.");
            elements.update(null);
        }
        
    }
    
}
