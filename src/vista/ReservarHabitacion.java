package vista;

import javax.swing.JOptionPane;
import controlador.GestorReservas;
import static controlador.GestorReservas.isInteger;
public class ReservarHabitacion extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public void limpiar(){
        txtCamaExtra.setText("");
        txtFechaIngreso.setText("");
        txtFechaSalida.setText("");
        txtNroHabitacion.setText("");
        txtTipoDesayuno.setText("");
        txtTipoHabitacion.setText("");
        txtTransporteda.setText("");
        txtTransporteha.setText("");
    }

    public ReservarHabitacion() {
        initComponents();
        btnRegresar.setFocusPainted(false);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnPersonalizaciones.setFocusPainted(false);
        btnPersonalizaciones.setBorderPainted(false);
        btnPersonalizaciones.setContentAreaFilled(false);
        btnRegistro.setFocusPainted(false);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        panelBarra.setOpaque(false);
        txtCamaExtra.setOpaque(false);
        txtFechaIngreso.setOpaque(false);
        txtFechaSalida.setOpaque(false);
        txtNroHabitacion.setOpaque(false);
        txtTipoDesayuno.setOpaque(false);
        txtTipoHabitacion.setOpaque(false);
        txtTransporteda.setOpaque(false);
        txtTransporteha.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        txtNroHabitacion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        txtTipoDesayuno = new javax.swing.JTextField();
        txtTransporteha = new javax.swing.JTextField();
        txtTransporteda = new javax.swing.JTextField();
        txtTipoHabitacion = new javax.swing.JTextField();
        txtCamaExtra = new javax.swing.JTextField();
        btnPersonalizaciones = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JButton();
        btnRegistro = new javax.swing.JToggleButton();
        btnRegresar = new javax.swing.JButton();
        panelBarra = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNroHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtNroHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtNroHabitacion.setBorder(null);
        PanelFondo.add(txtNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 260, 30));

        txtFechaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaIngreso.setBorder(null);
        PanelFondo.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 260, 30));

        txtFechaSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaSalida.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaSalida.setBorder(null);
        PanelFondo.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 260, 30));

        txtTipoDesayuno.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoDesayuno.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoDesayuno.setBorder(null);
        PanelFondo.add(txtTipoDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 260, 30));

        txtTransporteha.setBackground(new java.awt.Color(255, 255, 255));
        txtTransporteha.setForeground(new java.awt.Color(0, 0, 0));
        txtTransporteha.setBorder(null);
        txtTransporteha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransportehaActionPerformed(evt);
            }
        });
        PanelFondo.add(txtTransporteha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 260, 20));

        txtTransporteda.setBackground(new java.awt.Color(255, 255, 255));
        txtTransporteda.setForeground(new java.awt.Color(0, 0, 0));
        txtTransporteda.setBorder(null);
        txtTransporteda.setMaximumSize(new java.awt.Dimension(2147483647, 2));
        txtTransporteda.setName(""); // NOI18N
        PanelFondo.add(txtTransporteda, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 304, 260, 20));

        txtTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoHabitacion.setBorder(null);
        PanelFondo.add(txtTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 398, 260, 20));

        txtCamaExtra.setBackground(new java.awt.Color(255, 255, 255));
        txtCamaExtra.setForeground(new java.awt.Color(0, 0, 0));
        txtCamaExtra.setBorder(null);
        txtCamaExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamaExtraActionPerformed(evt);
            }
        });
        PanelFondo.add(txtCamaExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 500, 260, 20));

        btnPersonalizaciones.setToolTipText("Ver Tipos de Personalizaciones");
        btnPersonalizaciones.setBorder(null);
        btnPersonalizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPersonalizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalizacionesActionPerformed(evt);
            }
        });
        PanelFondo.add(btnPersonalizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 130, 30));

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

        btnRegistro.setToolTipText("Reservar");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        PanelFondo.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 100, 30));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReservaHabitacion.jpg"))); // NOI18N
        PanelFondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

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

    private void txtTransportehaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransportehaActionPerformed

    }//GEN-LAST:event_txtTransportehaActionPerformed

    private void btnPersonalizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalizacionesActionPerformed
        Personalizaciones personalizar = new Personalizaciones();
        personalizar.setVisible(true);
    }//GEN-LAST:event_btnPersonalizacionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
      GestorReservas gestor = GestorReservas.getGestor();
        try {
            boolean respuesta = true;
            boolean vnh, vid, vth, vtd, vtha;
        vnh = isInteger(String.valueOf(txtNroHabitacion.getText()));
        vid = isInteger(String.valueOf(txtTipoDesayuno.getText()));
        vth = isInteger(String.valueOf(txtTransporteha.getText()));
        vtd = isInteger(String.valueOf(txtTransporteda.getText()));
        vtha = isInteger(String.valueOf(txtTipoHabitacion.getText()));
        if(vnh == false){
            JOptionPane.showMessageDialog(null, "EL NÚMERO DE HABITACIÓN DEBE SER UN NÚMERO", "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
        }
        if(vid == false){
            JOptionPane.showMessageDialog(null, "EL TIPO DE DESAYUNO DEBE SER EL NÚMERO CORRESPONDIENTE AL MENÚ. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
        }
        if(vth == false){
            JOptionPane.showMessageDialog(null, "EL TIPO DE TRANSPORTE HACIA EL AEROPUERTO DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
        }
        if(vtd == false){
            JOptionPane.showMessageDialog(null, "EL TIPO DE TRANSPORTE DESDE EL AEROPUERTO DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
        }
        if(vtha == false){
            JOptionPane.showMessageDialog(null, "EL TIPO DE HABITACIÓN DEBE SER EL NÚMERO CORRESPONDIENTE A LA TABLA. \nOBSERVE LAS PERSONALIZACIONES", "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
        }
          respuesta = gestor.reservar(Integer.parseInt(txtNroHabitacion.getText()), txtFechaIngreso.getText(), txtFechaSalida.getText(),Integer.parseInt(txtTipoDesayuno.getText()) , Integer.parseInt(txtTransporteha.getText()),
              Integer.parseInt(txtTransporteda.getText()), Integer.parseInt(txtTipoHabitacion.getText()), txtCamaExtra.getText());  
          if(respuesta == true){
              JOptionPane.showMessageDialog(null, "RESERVA REALIZADA CON ÉXITO.", "SOLICITUD DE RESERVA", JOptionPane.INFORMATION_MESSAGE);
              limpiar();
          }else{
              JOptionPane.showMessageDialog(null, "NO SE PUDO HACER LA RESERVA ALGUNO DE LOS DATOS INGRESADOS NO SON CORRECTOS, \nVERIFIQUE NUEVAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "NO SE PUDO HACER LA RESERVA ALGUNO DE LOS DATOS INGRESADOS NO SON CORRECTOS, \nVERIFIQUE NUEVAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
      
      
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void txtCamaExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamaExtraActionPerformed

    }//GEN-LAST:event_txtCamaExtraActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null, "¿DESEA REGRESAR AL MENÚ PRINCIPAL?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) { // CONFIRMACIÓN
            Principal principal = new Principal();
            this.dispose();
            principal.setVisible(true);
            
        } 
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JToggleButton btnPersonalizaciones;
    private javax.swing.JToggleButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JTextField txtCamaExtra;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtNroHabitacion;
    private javax.swing.JTextField txtTipoDesayuno;
    private javax.swing.JTextField txtTipoHabitacion;
    private javax.swing.JTextField txtTransporteda;
    private javax.swing.JTextField txtTransporteha;
    // End of variables declaration//GEN-END:variables
}
