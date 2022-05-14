/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlgcompartidos;

import entidades.Contacto;
import entidades.Direccion;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DlgDireccion extends javax.swing.JDialog {

    Direccion direccion;
    Contacto contacto = new Contacto();

    /**
     * Creates new form DlgDireccion
     */
    public DlgDireccion(Direccion direccion) {

        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.direccion = direccion;
        llenarCampos();
    }
    
    private void llenarCampos(){
        txtCalle.setText(direccion.getCalle());
        txtCP.setText(direccion.getCodigoPostal());
        txtColonia.setText(direccion.getColonia());
        txtEntreCalles.setText(direccion.getEntreCalles());
        txtNumExterior.setText(direccion.getNumExterior());
        txtNumInterior.setText(direccion.getNumInterior());
        txtReferencias.setText(direccion.getReferencia());
    }

    public Direccion getDireccion() {
        if (direccion != null) {
            return direccion;
        }
        return new Direccion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosDireccion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNumExterior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReferencias = new javax.swing.JTextArea();
        txtNumInterior = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEntreCalles = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Direccion");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setText("Num. Exterior:");

        txtNumExterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumExteriorKeyTyped(evt);
            }
        });

        jLabel6.setText("Calle:");

        jLabel11.setText("Referencias:");

        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });

        jLabel7.setText("Colonia:");

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });

        jLabel8.setText("Código Postal:");

        txtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPKeyTyped(evt);
            }
        });

        jLabel12.setText("Num. Interior:");

        txtReferencias.setColumns(20);
        txtReferencias.setRows(5);
        txtReferencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReferenciasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtReferencias);

        txtNumInterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumInteriorKeyTyped(evt);
            }
        });

        jLabel16.setText("Entre Calles:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosDireccionLayout = new javax.swing.GroupLayout(panelDatosDireccion);
        panelDatosDireccion.setLayout(panelDatosDireccionLayout);
        panelDatosDireccionLayout.setHorizontalGroup(
            panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosDireccionLayout.createSequentialGroup()
                        .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosDireccionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32))
                            .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8))
                                    .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumInterior, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCalle)
                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEntreCalles, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelDatosDireccionLayout.setVerticalGroup(
            panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosDireccionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntreCalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelDatosDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(panelDatosDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (validacion()) {
            guardarDireccion();
            dispose();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean validacion() {
        if (txtCalle.getText().equals("") || txtColonia.getText().equals("")
                || txtCP.getText().equals("") || txtNumInterior.getText().equals("")
                || txtNumExterior.getText().equals("") || txtReferencias.getText().equals("")
                || txtEntreCalles.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Existen campos vacíos, debe llenar todos los campos");
            return false;
        }
        return true;
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtCP.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCPKeyTyped

    private void txtNumInteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumInteriorKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtNumInterior.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumInteriorKeyTyped

    private void txtNumExteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumExteriorKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtNumExterior.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumExteriorKeyTyped

    private void txtReferenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferenciasKeyTyped

    }//GEN-LAST:event_txtReferenciasKeyTyped

    public void limpiar() {
        this.txtCalle.setText("");
        this.txtCP.setText("");
        this.txtColonia.setText("");
        this.txtEntreCalles.setText("");
        this.txtNumExterior.setText("");
        this.txtNumInterior.setText("");
        this.txtReferencias.setText("");
    }

    public void guardarDireccion() {

        direccion = getDireccion();

        direccion.setCalle(txtCalle.getText());
        direccion.setCodigoPostal(txtCP.getText());
        direccion.setColonia(txtColonia.getText());
        direccion.setEntreCalles(txtEntreCalles.getText());
        direccion.setNumExterior(txtNumExterior.getText());
        direccion.setNumInterior(txtNumInterior.getText());
        direccion.setReferencia(txtReferencias.getText());

        if (contacto.getDireccion() != null) {
            contacto.getDireccion().setCalle(txtCalle.getText());
            contacto.getDireccion().setCodigoPostal(txtCP.getText());
            contacto.getDireccion().setColonia(txtColonia.getText());
            contacto.getDireccion().setEntreCalles(txtEntreCalles.getText());
            contacto.getDireccion().setNumExterior(txtNumExterior.getText());
            contacto.getDireccion().setNumInterior(txtNumInterior.getText());
            contacto.getDireccion().setReferencia(txtReferencias.getText());

        }

    }

    public void resetearDireccion() {
        direccion.setCalle("");
        direccion.setCodigoPostal("");
        direccion.setColonia("");
        direccion.setEntreCalles("");
        direccion.setNumExterior("");
        direccion.setNumInterior("");
        direccion.setReferencia("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDatosDireccion;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtEntreCalles;
    private javax.swing.JTextField txtNumExterior;
    private javax.swing.JTextField txtNumInterior;
    private javax.swing.JTextArea txtReferencias;
    // End of variables declaration//GEN-END:variables
}
