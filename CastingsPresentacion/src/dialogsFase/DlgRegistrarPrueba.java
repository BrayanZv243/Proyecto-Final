/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogsFase;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;
import dlgcompartidos.DlgDireccion;
import entidades.Direccion;
import entidades.Prueba;
import entidades.Sala;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DlgRegistrarPrueba extends javax.swing.JDialog {

    static Prueba prueba;
    Direccion direccion = new Direccion();

    /**
     * Creates new form DlgRegistrarPrueba
     *
     * @param prueba
     */
    public DlgRegistrarPrueba(Prueba prueba) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.prueba = prueba;
        llenarCampos();
    }

    private void llenarCampos(){
        if (prueba.getFecha() != null) {
            LocalDate localDate = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(prueba.getFecha()));
            dateFecha.setDate(localDate);
        }
        aprobadoCheckBox.setSelected(prueba.isAprobado());
        if (prueba.getSala() != null) {
            txtNombreSala.setText(prueba.getSala().getNombre());
            txtDescripcionSala.setText(prueba.getSala().getDescripcion());
            direccion = prueba.getSala().getDireccion();
        } else {
            this.prueba = new Prueba();
            this.prueba.setSala(new Sala());
            this.prueba.getSala().setDireccion(new Direccion());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateFecha = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        aprobadoCheckBox = new javax.swing.JCheckBox();
        btnRegistrarDireccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreSala = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionSala = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Prueba");

        jLabel1.setText("Fecha:");

        aprobadoCheckBox.setText("Aprobatorio");

        btnRegistrarDireccion.setText("Registrar Dirección Sala");
        btnRegistrarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDireccionActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Sala:");

        jLabel4.setText("Descripción:");

        txtDescripcionSala.setColumns(20);
        txtDescripcionSala.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionSala);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCancelar)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aprobadoCheckBox)
                            .addComponent(jScrollPane1)
                            .addComponent(txtNombreSala))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegistrarDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(aprobadoCheckBox)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCancelar))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!validacion()) {
            return;
        }
        Date fecha = null;
        try {
            fecha = toDate(null, dateFecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una Fecha Válida!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        prueba.setFecha(fecha);
        prueba.setAprobado(aprobadoCheckBox.isSelected());
        prueba.getSala().setNombre(txtNombreSala.getText());
        prueba.getSala().setDescripcion(txtDescripcionSala.getText());
        prueba.getSala().setDireccion(direccion);
        
        JOptionPane.showMessageDialog(null, "Prueba registrada correctamente",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static Prueba getPrueba() {
        if (prueba == null) {
            return new Prueba();
        }
        return prueba;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDireccionActionPerformed
        new DlgDireccion(direccion);
    }//GEN-LAST:event_btnRegistrarDireccionActionPerformed

    private void limpiar() {
        dateFecha.setText("");
        aprobadoCheckBox.setSelected(false);
        txtNombreSala.setText("");
        txtDescripcionSala.setText("");
    }

    private boolean validacion() {
        if (dateFecha.getText().equals("") || txtDescripcionSala.getText().equals("")
                || txtNombreSala.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacíos o inválidos, verifiquelos e intentelo de nuevo",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (direccion.getCalle() == null || direccion.getCodigoPostal() == null
                || direccion.getColonia() == null || direccion.getEntreCalles() == null
                || direccion.getNumExterior() == null || direccion.getNumInterior() == null
                || direccion.getReferencia() == null) {
            JOptionPane.showMessageDialog(null, "Llene la dirección y datos de la sala.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public Date toDate(DateTimePicker dateTimePicker, DatePicker datePicker) throws Exception {
        ZoneId defaultZoneId = ZoneId.systemDefault();

        if (dateTimePicker != null) {
            String date = dateTimePicker.getDatePicker().getDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
            String hour = dateTimePicker.timePicker.getTime().toString();

            String dateS = date + " " + hour;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
            Date fecha = null;
            try {
                fecha = formatter.parse(dateS);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return fecha;
        } else if (datePicker != null) {
            Date fecha = Date.from(datePicker.getDate().atStartOfDay(defaultZoneId).toInstant());
            return fecha;
        }
        return null;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aprobadoCheckBox;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarDireccion;
    private com.github.lgooddatepicker.components.DatePicker dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcionSala;
    private javax.swing.JTextField txtNombreSala;
    // End of variables declaration//GEN-END:variables
}
