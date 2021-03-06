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
public class EditItemWindow extends UI {

    /**
     * Creates new form EditItemWindow
     */
    public EditItemWindow() {
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

        editItem_panel = new javax.swing.JPanel();
        item_label = new javax.swing.JLabel();
        itemName_combo = new javax.swing.JComboBox();
        itemName_radiobutton = new javax.swing.JRadioButton();
        itemName_field = new javax.swing.JTextField();
        itemDescription_radiobutton = new javax.swing.JRadioButton();
        description_scollpane = new javax.swing.JScrollPane();
        itemDescription_field = new javax.swing.JTextArea();
        save_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Item");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        item_label.setText("Choose Item to Edit:");

        itemName_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemName_combo.setName("itemName_combo"); // NOI18N

        itemName_radiobutton.setLabel("Edit Item Name:");
        itemName_radiobutton.setName("itemName_radiobutton"); // NOI18N
        itemName_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemName_radiobuttonActionPerformed(evt);
            }
        });

        itemName_field.setEnabled(false);
        itemName_field.setName("itemName_field"); // NOI18N

        itemDescription_radiobutton.setLabel("Edit Item Description:");
        itemDescription_radiobutton.setName("itemDescription_radiobutton"); // NOI18N
        itemDescription_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDescription_radiobuttonActionPerformed(evt);
            }
        });

        itemDescription_field.setColumns(20);
        itemDescription_field.setLineWrap(true);
        itemDescription_field.setRows(5);
        itemDescription_field.setEnabled(false);
        itemDescription_field.setName("itemDescription_field"); // NOI18N
        description_scollpane.setViewportView(itemDescription_field);

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

        javax.swing.GroupLayout editItem_panelLayout = new javax.swing.GroupLayout(editItem_panel);
        editItem_panel.setLayout(editItem_panelLayout);
        editItem_panelLayout.setHorizontalGroup(
            editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItem_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editItem_panelLayout.createSequentialGroup()
                        .addComponent(itemDescription_radiobutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(description_scollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editItem_panelLayout.createSequentialGroup()
                        .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_label)
                            .addComponent(itemName_radiobutton))
                        .addGap(20, 20, 20)
                        .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editItem_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        editItem_panelLayout.setVerticalGroup(
            editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItem_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_label)
                    .addComponent(itemName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName_radiobutton)
                    .addComponent(itemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemDescription_radiobutton)
                    .addComponent(description_scollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(cancel_button))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editItem_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editItem_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemName_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemName_radiobuttonActionPerformed
        // TODO add your handling code here:]
        if(itemName_radiobutton.isSelected())
            itemName_field.setEnabled(true);
        else itemName_field.setEnabled(false);
    }//GEN-LAST:event_itemName_radiobuttonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void itemDescription_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDescription_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(itemDescription_radiobutton.isSelected())
            itemDescription_field.setEnabled(true);
        else itemDescription_field.setEnabled(false);
    }//GEN-LAST:event_itemDescription_radiobuttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_save_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItemWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JScrollPane description_scollpane;
    private javax.swing.JPanel editItem_panel;
    private javax.swing.JTextArea itemDescription_field;
    private javax.swing.JRadioButton itemDescription_radiobutton;
    private javax.swing.JComboBox itemName_combo;
    private javax.swing.JTextField itemName_field;
    private javax.swing.JRadioButton itemName_radiobutton;
    private javax.swing.JLabel item_label;
    private javax.swing.JButton save_button;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
