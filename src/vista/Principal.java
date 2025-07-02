package vista;

import controlador.GestorReservas;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Principal() {
        initComponents();
        btnVerReservas.setFocusPainted(false);
        btnVerReservas.setBorderPainted(false);
        btnVerReservas.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnReservar.setFocusPainted(false);
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnModificar.setFocusPainted(false);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        panelBarra.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        PanelFondo = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        panelBarra = new javax.swing.JPanel();
        btnVerReservas = new javax.swing.JToggleButton();
        btnReservar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        Fondo = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Magneto", 1, 48)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("X");
        btnSalir.setToolTipText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 90, 60));

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
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PanelFondo.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 50));

        btnVerReservas.setToolTipText("Ver Reservas");
        btnVerReservas.setBorder(null);
        btnVerReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservasActionPerformed(evt);
            }
        });
        PanelFondo.add(btnVerReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 230, 50));

        btnReservar.setToolTipText("Reservar Habitación");
        btnReservar.setBorder(null);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 230, 50));

        btnModificar.setToolTipText("Modificar Reserva");
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 230, 50));

        btnEliminar.setToolTipText("Eliminar Reserva");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 230, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PRINCIPAL.jpg"))); // NOI18N
        PanelFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        ReservarHabitacion reservar = new ReservarHabitacion();
        reservar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModificarReserva modificar = new ModificarReserva();
        modificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            GestorReservas gestor = GestorReservas.getGestor();
            int ide = Integer.parseInt(JOptionPane.showInputDialog(null, "INDIQUE EL ID DE RESERVA QUE DESEA ELIMINAR."));
            int eliminar = JOptionPane.showConfirmDialog(null, "¿ESTÁ SEGURO QUE DESEA ELIMINAR: \nRESERVA #" + ide + " ?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (eliminar == JOptionPane.YES_OPTION) { // CONFIRMACIÓN
                boolean respuesta = gestor.eliminarReserva(ide);
                if (respuesta == true) {
                    JOptionPane.showMessageDialog(null, "RESERVA ELIMINADA CON ÉXITO.", "SOLICITUD DE RESERVA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR LA RESERVA, ID NO EXISTENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR LA RESERVA, ID NO EXISTENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿DESEA REGRESAR AL INICIO DE SESIÓN?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) { // CONFIRMACIÓN
            InicioSesion inicio = new InicioSesion();
            this.dispose();
            inicio.setVisible(true);

        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed
        ListaReservas listar = new ListaReservas();
        this.dispose();
        listar.setVisible(true);

    }//GEN-LAST:event_btnVerReservasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JToggleButton btnReservar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnVerReservas;
    private javax.swing.JPanel panelBarra;
    // End of variables declaration//GEN-END:variables
}
