/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversor;
import javax.swing.*;
/**
 *
 * @author C4ptaiN
 */
public class Entrada_datos extends javax.swing.JFrame {

    /**
     * Creates new form Entrada_datos
     */
    public Entrada_datos() {
        initComponents();
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        valor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setEditable(false);
        result.setBackground(new java.awt.Color(0, 0, 51));
        result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(255, 51, 51));
        result.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        result.setEnabled(false);
        jPanel1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, -1));

        menu.setBackground(new java.awt.Color(0, 0, 51));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso_Mexicano a Dólar", "Peso_Mexicano a Euro", "Peso_Mexicano a Libras Esterlinas", "Peso_Mexicano a Yen Japonés", "Peso_Mexicano a Won sur-coreano", "Dólar a Peso_Mexicano", "Euro a Peso_Mexicano", "Libras Esterlinas a Peso_Mexicano", "Yen Japonés a Peso_Mexicano", "Won sur-coreano a Peso_Mexicano" }));
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        valor.setBackground(new java.awt.Color(0, 0, 51));
        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setCaretColor(new java.awt.Color(255, 255, 255));
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Divisas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("De:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantida a convertir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        convertir.setBackground(new java.awt.Color(0, 0, 51));
        convertir.setForeground(new java.awt.Color(255, 255, 255));
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        jPanel1.add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        salir.setBackground(new java.awt.Color(0, 0, 51));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\fondo.jpg"));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 290));

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("<<");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
       
       Conversor conver = new Conversor();
       double cantidad = 0.00;

        int opciones = menu.getSelectedIndex();
      
       String texto = valor.getText();
       if (conver.validacion(texto)){
        cantidad = Double.parseDouble(valor.getText());
         switch (opciones){
             case 0:
                conver.resultado = conver.PesomxaDolar(cantidad);
                 result.setText(String.valueOf( String.format("%.2f",conver.resultado)));
             break;

             case 1:
                conver.resultado = conver.PesomxaEuro(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 2:
                 conver.resultado = conver.PesomxaLibras(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 3:
               conver.resultado = conver.PesomxaYen(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 4:
                 conver.resultado = conver.PesomxaWon(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 5:
                 conver.resultado = conver.DolaraPesomx(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 6:
                 conver.resultado = conver.EuroaPesomx(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;   
             case 7:
                 conver.resultado = conver.LibrasaPesomx(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 8:
                 conver.resultado = conver.YenaPesomx(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;
             case 9:
                 conver.resultado = conver.WonaPesomx(cantidad);
                 result.setText(String.valueOf(String.format("%.2f",conver.resultado)));
             break;

         }
        }else{
               JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);

        }
      
    }//GEN-LAST:event_convertirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane,"Deseas salir",""+"Conversor Alura", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu_principal home = new Menu_principal();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Entrada_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JTextField result;
    private javax.swing.JButton salir;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
