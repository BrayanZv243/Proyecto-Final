/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dialogsAgente.DlgRegistrarAgente;
import dialogsCasting.DlgRegistrarCasting;
import dialogsCliente.DlgRegistrarCliente;
import entidades.Cliente;
import interfaces.*;
import java.util.List;
import BOSFactory.*;
import entidades.Agente;
import javax.swing.DefaultComboBoxModel;
import negocio.PersistenciaFachada;
import utils.Conversiones;


public class CastingForm extends javax.swing.JFrame {

    Conversiones conversiones;
    IPersistenciaFachada persistencia;
    
    List<Cliente> clientes;
    List<Agente> agentes;
    
    public CastingForm() {
        persistencia = PersistenciaFachada.getInstance();
        conversiones = Conversiones.getInstance();
        initComponents();
        setLocationRelativeTo(null);
    }
    
   
    
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
            java.util.logging.Logger.getLogger(CastingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CastingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CastingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CastingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CastingForm().setVisible(true);
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcionMenuAgregarCasting = new javax.swing.JMenuItem();
        opcionMenuActualizarCasting = new javax.swing.JMenuItem();
        opcionMenuBuscarCasting = new javax.swing.JMenuItem();
        opcionMenuEliminarCasting = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcionMenuAgregarCliente = new javax.swing.JMenuItem();
        opcionMenuActualizarCliente = new javax.swing.JMenuItem();
        opcionMenuBuscarCliente = new javax.swing.JMenuItem();
        opcionMenuEliminarCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcionMenuAgregarAgente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Casting");

        jMenu1.setText("Casting");

        opcionMenuAgregarCasting.setText("Registrar Casting");
        opcionMenuAgregarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarCastingActionPerformed(evt);
            }
        });
        jMenu1.add(opcionMenuAgregarCasting);

        opcionMenuActualizarCasting.setText("Actualizar Casting");
        jMenu1.add(opcionMenuActualizarCasting);

        opcionMenuBuscarCasting.setText("Buscar Casting");
        jMenu1.add(opcionMenuBuscarCasting);

        opcionMenuEliminarCasting.setText("Eliminar Casting");
        opcionMenuEliminarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuEliminarCastingActionPerformed(evt);
            }
        });
        jMenu1.add(opcionMenuEliminarCasting);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");

        opcionMenuAgregarCliente.setText("Registrar Cliente");
        opcionMenuAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(opcionMenuAgregarCliente);

        opcionMenuActualizarCliente.setText("Actualizar Cliente");
        jMenu2.add(opcionMenuActualizarCliente);

        opcionMenuBuscarCliente.setText("Buscar Cliente");
        jMenu2.add(opcionMenuBuscarCliente);

        opcionMenuEliminarCliente.setText("Eliminar Cliente");
        jMenu2.add(opcionMenuEliminarCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Agente");

        opcionMenuAgregarAgente.setText("Registrar Agente");
        opcionMenuAgregarAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarAgenteActionPerformed(evt);
            }
        });
        jMenu3.add(opcionMenuAgregarAgente);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionMenuAgregarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarCastingActionPerformed
        DefaultComboBoxModel clientes = conversiones.clientesComboBoxModel(persistencia.buscarClientes());
        DefaultComboBoxModel agentes = conversiones.agentesComboBoxModel(persistencia.buscarAgentes());
        
        new DlgRegistrarCasting(clientes,agentes);
    }//GEN-LAST:event_opcionMenuAgregarCastingActionPerformed

    private void opcionMenuEliminarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuEliminarCastingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuEliminarCastingActionPerformed

    private void opcionMenuAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarClienteActionPerformed
        new DlgRegistrarCliente();
    }//GEN-LAST:event_opcionMenuAgregarClienteActionPerformed

    private void opcionMenuAgregarAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarAgenteActionPerformed
        new DlgRegistrarAgente();
    }//GEN-LAST:event_opcionMenuAgregarAgenteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opcionMenuActualizarCasting;
    private javax.swing.JMenuItem opcionMenuActualizarCliente;
    private javax.swing.JMenuItem opcionMenuAgregarAgente;
    private javax.swing.JMenuItem opcionMenuAgregarCasting;
    private javax.swing.JMenuItem opcionMenuAgregarCliente;
    private javax.swing.JMenuItem opcionMenuBuscarCasting;
    private javax.swing.JMenuItem opcionMenuBuscarCliente;
    private javax.swing.JMenuItem opcionMenuEliminarCasting;
    private javax.swing.JMenuItem opcionMenuEliminarCliente;
    // End of variables declaration//GEN-END:variables
}
