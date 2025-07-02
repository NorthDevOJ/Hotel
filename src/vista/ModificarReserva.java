package vista;

import controlador.GestorReservas;
import static controlador.GestorReservas.isInteger;
import static controlador.GestorReservas.reservas;
import javax.swing.JOptionPane;

public class ModificarReserva extends javax.swing.JFrame {

    int xMouse, yMouse;

    public void limpiar() {
        txtCamaExtra.setText("");
        txtTipoDesayuno.setText("");
        txtTipoHabitacion.setText("");
        txtTransporteda.setText("");
        txtTransporteha.setText("");
        txtIdReserva.setText("");
    }

    public ModificarReserva() {
        initComponents();
        btnDeshacer.setFocusPainted(false);
        btnDeshacer.setBorderPainted(false);
        btnDeshacer.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnVerReservas.setFocusPainted(false);
        btnVerReservas.setBorderPainted(false);
        btnVerReservas.setContentAreaFilled(false);
        btnModificar.setFocusPainted(false);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        panelBarra.setOpaque(false);
        txtTipoHabitacion.setOpaque(false);
        txtCamaExtra.setOpaque(false);
        txtIdReserva.setOpaque(false);
        txtTipoDesayuno.setOpaque(false);
        txtTransporteda.setOpaque(false);
        txtTransporteha.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtIdReserva = new javax.swing.JTextField();
        txtTransporteda = new javax.swing.JTextField();
        txtTipoHabitacion = new javax.swing.JTextField();
        txtCamaExtra = new javax.swing.JTextField();
        txtTipoDesayuno = new javax.swing.JTextField();
        txtTransporteha = new javax.swing.JTextField();
        btnVerReservas = new javax.swing.JToggleButton();
        btnDeshacer = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        panelBarra = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 255));
        btnRegresar.setText("←");
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 50));

        btnSalir.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("X");
        btnSalir.setToolTipText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 120, 60, 50));

        txtIdReserva.setBackground(new java.awt.Color(255, 255, 255));
        txtIdReserva.setForeground(new java.awt.Color(0, 0, 0));
        txtIdReserva.setBorder(null);
        PanelFondo.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 304, 260, 20));

        txtTransporteda.setBackground(new java.awt.Color(255, 255, 255));
        txtTransporteda.setForeground(new java.awt.Color(0, 0, 0));
        txtTransporteda.setBorder(null);
        txtTransporteda.setMaximumSize(new java.awt.Dimension(2147483647, 2));
        txtTransporteda.setName(""); // NOI18N
        PanelFondo.add(txtTransporteda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 563, 260, 20));

        txtTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoHabitacion.setBorder(null);
        PanelFondo.add(txtTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 355, 260, 20));

        txtCamaExtra.setBackground(new java.awt.Color(255, 255, 255));
        txtCamaExtra.setForeground(new java.awt.Color(0, 0, 0));
        txtCamaExtra.setBorder(null);
        PanelFondo.add(txtCamaExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 405, 260, 20));

        txtTipoDesayuno.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoDesayuno.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoDesayuno.setBorder(null);
        PanelFondo.add(txtTipoDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 453, 262, 20));

        txtTransporteha.setBackground(new java.awt.Color(255, 255, 255));
        txtTransporteha.setForeground(new java.awt.Color(0, 0, 0));
        txtTransporteha.setBorder(null);
        txtTransporteha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransportehaActionPerformed(evt);
            }
        });
        PanelFondo.add(txtTransporteha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 260, 20));

        btnVerReservas.setToolTipText("Ver Reservas");
        btnVerReservas.setBorder(null);
        btnVerReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservasActionPerformed(evt);
            }
        });
        PanelFondo.add(btnVerReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 100, 30));

        btnDeshacer.setToolTipText("Deshacer Modificación");
        btnDeshacer.setBorder(null);
        btnDeshacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        PanelFondo.add(btnDeshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 100, 30));

        btnModificar.setToolTipText("Modificar Reserva");
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 100, 30));

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.setForeground(new java.awt.Color(255, 255, 255));
        panelBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModificarReserva.jpg"))); // NOI18N
        PanelFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null, "¿DESEA REGRESAR AL MENÚ PRINCIPAL?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) { // CONFIRMACIÓN
            Principal principal = new Principal();
            this.dispose();
            principal.setVisible(true);

        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTransportehaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransportehaActionPerformed

    }//GEN-LAST:event_txtTransportehaActionPerformed

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed
        int cont = 0;
        try {
            if (!txtIdReserva.getText().isEmpty()) {
                for (int i = 0; i < reservas.size(); i++) {
                    if (reservas.get(i).getIdReserva() == Integer.parseInt(txtIdReserva.getText())) {
                        txtCamaExtra.setText(reservas.get(i).getCamaExtra());
                        txtTipoDesayuno.setText(String.valueOf(reservas.get(i).getIdDesayuno()));
                        txtTipoHabitacion.setText(String.valueOf(reservas.get(i).getTipoDeHabitacion()));
                        txtTransporteda.setText(String.valueOf(reservas.get(i).getTipoDeTransporteDesdeElAereopuerto()));
                        txtTransporteha.setText(String.valueOf(reservas.get(i).getTipoDeTransporteHaciaElAereopuerto()));;
                        cont = 1;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "EL ESPACIO ID RESERVA ESTÁ VACÍO.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "NO EXISTE UNA RESERVA REGISTRADO CON ESE ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DEL SISTEMA.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnVerReservasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        GestorReservas gestor = GestorReservas.getGestor();
        try {
            boolean respuesta = true;
            boolean vnh, vid, vth, vtd, vtha;
            vnh = isInteger(String.valueOf(txtIdReserva.getText()));
            vid = isInteger(String.valueOf(txtTipoDesayuno.getText()));
            vth = isInteger(String.valueOf(txtTransporteha.getText()));
            vtd = isInteger(String.valueOf(txtTransporteda.getText()));
            vtha = isInteger(String.valueOf(txtTipoHabitacion.getText()));
            if (vnh == false) {
                JOptionPane.showMessageDialog(null, "EL NÚMERO DE RESERVA DEBE SER UN NÚMERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
            if (vid == false) {
                JOptionPane.showMessageDialog(null, "EL TIPO DE DESAYUNO DEBE SER EL NÚMERO CORRESPONDIENTE AL MENÚ. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
            if (vth == false) {
                JOptionPane.showMessageDialog(null, "EL TIPO DE TRANSPORTE HACIA EL AEROPUERTO DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
            if (vtd == false) {
                JOptionPane.showMessageDialog(null, "EL TIPO DE TRANSPORTE DESDE EL AEROPUERTO DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
            if (vtha == false) {
                JOptionPane.showMessageDialog(null, "EL TIPO DE HABITACIÓN DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
            respuesta = gestor.modificarReserva(Integer.parseInt(txtIdReserva.getText()), Integer.parseInt(txtTipoDesayuno.getText()), Integer.parseInt(txtTransporteha.getText()),
                    Integer.parseInt(txtTransporteda.getText()), Integer.parseInt(txtTipoHabitacion.getText()), txtCamaExtra.getText());
            if (respuesta == true) {
                JOptionPane.showMessageDialog(null, "RESERVA MODIFICADA CON ÉXITO.", "SOLICITUD DE MODIFICACIÓN DE RESERVA", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR LA RESERVA ALGUNO DE LOS DATOS INGRESADOS NO SON CORRECTOS, \nVERIFIQUE NUEVAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR LA RESERVA ALGUNO DE LOS DATOS INGRESADOS NO SON CORRECTOS, \nVERIFIQUE NUEVAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        try {
            GestorReservas gestor = GestorReservas.getGestor();
            gestor.deshacerReserva(Integer.parseInt(txtIdReserva.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO DESHACER LA OPERACIÓN", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JToggleButton btnDeshacer;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnVerReservas;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JTextField txtCamaExtra;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtTipoDesayuno;
    private javax.swing.JTextField txtTipoHabitacion;
    private javax.swing.JTextField txtTransporteda;
    private javax.swing.JTextField txtTransporteha;
    // End of variables declaration//GEN-END:variables
}
