
package vista;

import javax.swing.JOptionPane;


public class PantallaDeCarga extends javax.swing.JFrame {

  
    public PantallaDeCarga() {
        initComponents();
    }

    public void CargarScreen(PantallaDeCarga splash){
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                splash.cargando.setValue(i);
                splash.Fondo.setText("Cargando ....");
                if (i == 100) {
                    splash.setVisible(false);
                    InicioSesion inicio = new InicioSesion();
                    inicio.setVisible(true);
                }
            }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "ERROR DEL SISTEMA.", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        cargando = new javax.swing.JProgressBar();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargando.setBackground(new java.awt.Color(255, 255, 255));
        cargando.setForeground(new java.awt.Color(0, 0, 102));
        cargando.setBorder(null);
        PanelFondo.add(cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 450, 10));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoadingScreen.png"))); // NOI18N
        PanelFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 720));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaDeCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JProgressBar cargando;
    // End of variables declaration//GEN-END:variables
}
