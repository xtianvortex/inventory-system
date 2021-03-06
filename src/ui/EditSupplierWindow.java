/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.UI;
import java.util.Map;

/**
 *
 * @author MiriamMarie
 */
public class EditSupplierWindow extends UI {

    /**
     * Creates new form EditSupplierWindow
     */
    public EditSupplierWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editSupplier_panel = new javax.swing.JPanel();
        editSupplier_label = new javax.swing.JLabel();
        supplier_combo = new javax.swing.JComboBox();
        name_radiobutton = new javax.swing.JRadioButton();
        name_field = new javax.swing.JTextField();
        street_radiobutton = new javax.swing.JRadioButton();
        editSupplier_label1 = new javax.swing.JLabel();
        street_field = new javax.swing.JTextField();
        city_radiobutton = new javax.swing.JRadioButton();
        city_field = new javax.swing.JTextField();
        country_radiobutton = new javax.swing.JRadioButton();
        country_field = new javax.swing.JTextField();
        province_radiobutton = new javax.swing.JRadioButton();
        zipcode_radiobutton = new javax.swing.JRadioButton();
        province_field = new javax.swing.JTextField();
        zipcode_field = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Supplier");

        editSupplier_label.setText("Choose Supplier to Edit:");

        supplier_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplier_combo.setName("supplier_combo"); // NOI18N

        name_radiobutton.setText("Edit Supplier Name:");
        name_radiobutton.setName("name_radiobutton"); // NOI18N
        name_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_radiobuttonActionPerformed(evt);
            }
        });

        name_field.setEnabled(false);
        name_field.setName("name_field"); // NOI18N

        street_radiobutton.setText("Edit Street:");
        street_radiobutton.setName("street_radiobutton"); // NOI18N
        street_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_radiobuttonActionPerformed(evt);
            }
        });

        editSupplier_label1.setText("Edit Address");

        street_field.setEnabled(false);
        street_field.setName("street_field"); // NOI18N

        city_radiobutton.setText("Edit City:");
        city_radiobutton.setName("city_radiobutton"); // NOI18N
        city_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_radiobuttonActionPerformed(evt);
            }
        });

        city_field.setEnabled(false);
        city_field.setName("city_field"); // NOI18N

        country_radiobutton.setText("Edit Country:");
        country_radiobutton.setName("country_radiobutton"); // NOI18N
        country_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_radiobuttonActionPerformed(evt);
            }
        });

        country_field.setEnabled(false);
        country_field.setName("country_field"); // NOI18N

        province_radiobutton.setText("Edit Province:");
        province_radiobutton.setName("province_radiobutton"); // NOI18N
        province_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                province_radiobuttonActionPerformed(evt);
            }
        });

        zipcode_radiobutton.setText("Edit Zip Code:");
        zipcode_radiobutton.setName("zipcode_radiobutton"); // NOI18N
        zipcode_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcode_radiobuttonActionPerformed(evt);
            }
        });

        province_field.setEnabled(false);
        province_field.setName("province_field"); // NOI18N

        zipcode_field.setEnabled(false);
        zipcode_field.setName("zipcode_field"); // NOI18N

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editSupplier_panelLayout = new javax.swing.GroupLayout(editSupplier_panel);
        editSupplier_panel.setLayout(editSupplier_panelLayout);
        editSupplier_panelLayout.setHorizontalGroup(
            editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editSupplier_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editSupplier_panelLayout.createSequentialGroup()
                            .addComponent(editSupplier_label)
                            .addGap(18, 18, 18)
                            .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(editSupplier_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editSupplier_panelLayout.createSequentialGroup()
                        .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_radiobutton)
                            .addComponent(street_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(country_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcode_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(province_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(street_field)
                            .addComponent(name_field)
                            .addComponent(city_field, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(country_field, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(province_field, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(zipcode_field, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editSupplier_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        editSupplier_panelLayout.setVerticalGroup(
            editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editSupplier_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSupplier_label)
                    .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_radiobutton)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editSupplier_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street_radiobutton)
                    .addComponent(street_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_radiobutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_radiobutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(province_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(province_radiobutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcode_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode_radiobutton))
                .addGap(18, 18, 18)
                .addGroup(editSupplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(cancel_button))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editSupplier_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editSupplier_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void province_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_province_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(province_radiobutton.isSelected())
            province_field.setEnabled(true);
        else province_field.setEnabled(false);
    }//GEN-LAST:event_province_radiobuttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_save_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void name_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(name_radiobutton.isSelected())
            name_field.setEnabled(true);
        else name_field.setEnabled(false);
    }//GEN-LAST:event_name_radiobuttonActionPerformed

    private void street_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(street_radiobutton.isSelected())
            street_field.setEnabled(true);
        else street_field.setEnabled(false);
    }//GEN-LAST:event_street_radiobuttonActionPerformed

    private void city_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(city_radiobutton.isSelected())
            city_field.setEnabled(true);
        else city_field.setEnabled(false);
    }//GEN-LAST:event_city_radiobuttonActionPerformed

    private void country_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(country_radiobutton.isSelected())
            country_field.setEnabled(true);
        else country_field.setEnabled(false);
    }//GEN-LAST:event_country_radiobuttonActionPerformed

    private void zipcode_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcode_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(zipcode_radiobutton.isSelected())
            zipcode_field.setEnabled(true);
        else zipcode_field.setEnabled(false);
    }//GEN-LAST:event_zipcode_radiobuttonActionPerformed

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
            java.util.logging.Logger.getLogger(EditSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSupplierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSupplierWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField city_field;
    private javax.swing.JRadioButton city_radiobutton;
    private javax.swing.JTextField country_field;
    private javax.swing.JRadioButton country_radiobutton;
    private javax.swing.JLabel editSupplier_label;
    private javax.swing.JLabel editSupplier_label1;
    private javax.swing.JPanel editSupplier_panel;
    private javax.swing.JTextField name_field;
    private javax.swing.JRadioButton name_radiobutton;
    private javax.swing.JTextField province_field;
    private javax.swing.JRadioButton province_radiobutton;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField street_field;
    private javax.swing.JRadioButton street_radiobutton;
    private javax.swing.JComboBox supplier_combo;
    private javax.swing.JTextField zipcode_field;
    private javax.swing.JRadioButton zipcode_radiobutton;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
