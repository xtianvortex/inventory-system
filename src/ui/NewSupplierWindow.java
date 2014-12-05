/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.UI;
import commands.factory.CommandFactory;
import exceptions.ExecutorException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import statics.Executor;

/**
 *
 * @author MiriamMarie
 */
public class NewSupplierWindow extends UI {

    /**
     * Creates new form NewSupplierWindow
     */
    public NewSupplierWindow() {
        initComponents();
        Executor.put("addNewSupplier", CommandFactory.createAddSupplierCommand(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplier_panel = new javax.swing.JPanel();
        suppliername_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        supplierName_field = new javax.swing.JTextField();
        street_label = new javax.swing.JLabel();
        street_field = new javax.swing.JTextField();
        zipcode_label = new javax.swing.JLabel();
        zipcode_field = new javax.swing.JTextField();
        country_label = new javax.swing.JLabel();
        country_field = new javax.swing.JTextField();
        city_label = new javax.swing.JLabel();
        city_field = new javax.swing.JTextField();
        province_label = new javax.swing.JLabel();
        province_field = new javax.swing.JTextField();
        cancel_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Supplier");

        suppliername_label.setText("Supplier Name:");

        address_label.setText("Address");

        supplierName_field.setName("supplierName_field"); // NOI18N
        supplierName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierName_fieldActionPerformed(evt);
            }
        });

        street_label.setText("Street:");

        street_field.setName("street_field"); // NOI18N

        zipcode_label.setText("Zip Code:");

        zipcode_field.setName("zipcode_field"); // NOI18N

        country_label.setText("Country:");

        country_field.setName("country_field"); // NOI18N

        city_label.setText("City:");

        city_field.setName("city_field"); // NOI18N

        province_label.setText("Province:");

        province_field.setName("province_field"); // NOI18N

        cancel_button.setText("Cancel");
        cancel_button.setToolTipText("");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supplier_panelLayout = new javax.swing.GroupLayout(supplier_panel);
        supplier_panel.setLayout(supplier_panelLayout);
        supplier_panelLayout.setHorizontalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addComponent(country_label)
                                .addGap(18, 18, 18)
                                .addComponent(country_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(supplier_panelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(supplier_panelLayout.createSequentialGroup()
                                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                                .addComponent(street_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(street_field, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                                .addComponent(province_label)
                                                .addGap(16, 16, 16)
                                                .addComponent(province_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(city_label)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplier_panelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(zipcode_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(zipcode_field, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(city_field))))
                                .addGap(67, 67, 67))))
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addComponent(suppliername_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplierName_field, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(address_label))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        supplier_panelLayout.setVerticalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliername_label)
                    .addComponent(supplierName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(address_label)
                .addGap(18, 18, 18)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(street_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcode_label)
                            .addComponent(zipcode_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplier_panelLayout.createSequentialGroup()
                        .addComponent(street_label)
                        .addGap(18, 18, 18)))
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country_label)
                    .addComponent(country_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(province_label)
                    .addComponent(province_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_label)
                    .addComponent(city_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_button)
                    .addComponent(add_button))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplier_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplier_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supplierName_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierName_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierName_fieldActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        try {
            // TODO add your handling code here:
            Executor.execute("addNewSupplier");
        } catch (ExecutorException ex) {
            Logger.getLogger(NewSupplierWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        new AddWindow().setVisible(true);
    }//GEN-LAST:event_add_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        this.dispose();
        new AddWindow().setVisible(true);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSupplierWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JLabel address_label;
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField city_field;
    private javax.swing.JLabel city_label;
    private javax.swing.JTextField country_field;
    private javax.swing.JLabel country_label;
    private javax.swing.JTextField province_field;
    private javax.swing.JLabel province_label;
    private javax.swing.JTextField street_field;
    private javax.swing.JLabel street_label;
    private javax.swing.JTextField supplierName_field;
    private javax.swing.JPanel supplier_panel;
    private javax.swing.JLabel suppliername_label;
    private javax.swing.JTextField zipcode_field;
    private javax.swing.JLabel zipcode_label;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        Map fields = new HashMap();
        fields.put(city_field.getName(), city_field);
        fields.put(zipcode_field.getName(), zipcode_field);
        fields.put(street_field.getName(), street_field);
        fields.put(province_field.getName(), province_field);
        fields.put(country_field.getName(), country_field);
        fields.put(supplierName_field.getName(), supplierName_field);
        return fields;
    }
}
