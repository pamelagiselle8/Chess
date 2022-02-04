
package ajedrez;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {
    Ajedrez ajedrez = new Ajedrez();
    int primero = 0;
    boolean esDama = true;
    ImageIcon icon = new ImageIcon("tablero.png");
    ImageIcon mymelody = new ImageIcon("mymelody.jpg");
    ImageIcon tab = new ImageIcon("caballito.jpg");

    public void setPrimero(int primero) {
        this.primero = primero;
    }
    
    public Ventana(){
        
    }
    
    public Ventana(int primero) { //ayuda no me puedo desmutear xd
        this.primero=primero;
        if (primero == 1) {
            String mensaje = "Instrucciones:" + "\n" + "El juego consiste en coronar a un peón y mover la nueva pieza.";
            mensaje += "\n" + "La posición de la pieza está marcada por un caracter y la posición anterior por un '-'.";
            JOptionPane.showMessageDialog(null, mensaje, "¡Bienvenido al juego de ajedrez!", JOptionPane.INFORMATION_MESSAGE, this.icon);
        }
        this.setLocationRelativeTo(null);
        initComponents();
    }

    public boolean asdEsDama() {
        return esDama;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenú = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rey = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        torre = new javax.swing.JButton();
        alfil = new javax.swing.JButton();
        dama = new javax.swing.JButton();
        caballo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenú.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú Principal");

        rey.setBackground(new java.awt.Color(102, 102, 255));
        rey.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        rey.setForeground(new java.awt.Color(255, 255, 255));
        rey.setText("Rey");
        rey.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        rey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reyMouseExited(evt);
            }
        });
        rey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reyActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 102, 153));
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        torre.setBackground(new java.awt.Color(102, 102, 255));
        torre.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        torre.setForeground(new java.awt.Color(255, 255, 255));
        torre.setText("Torre");
        torre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        torre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        torre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                torreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                torreMouseExited(evt);
            }
        });
        torre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torreActionPerformed(evt);
            }
        });

        alfil.setBackground(new java.awt.Color(102, 102, 255));
        alfil.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        alfil.setForeground(new java.awt.Color(255, 255, 255));
        alfil.setText("Alfil");
        alfil.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        alfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alfilMouseExited(evt);
            }
        });
        alfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfilActionPerformed(evt);
            }
        });

        dama.setBackground(new java.awt.Color(102, 102, 255));
        dama.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        dama.setForeground(new java.awt.Color(255, 255, 255));
        dama.setText("Dama");
        dama.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        dama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                damaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                damaMouseExited(evt);
            }
        });
        dama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damaActionPerformed(evt);
            }
        });

        caballo.setBackground(new java.awt.Color(102, 102, 255));
        caballo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo.setForeground(new java.awt.Color(255, 255, 255));
        caballo.setText("Caballo");
        caballo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballoMouseExited(evt);
            }
        });
        caballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/pame/NetBeansProjects/Ajedrez_Nuevo/principal.png")); // NOI18N

        javax.swing.GroupLayout pnlMenúLayout = new javax.swing.GroupLayout(pnlMenú);
        pnlMenú.setLayout(pnlMenúLayout);
        pnlMenúLayout.setHorizontalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alfil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rey, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pnlMenúLayout.setVerticalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(alfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(torre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(rey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenú, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenú, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reyActionPerformed
        this.setVisible(false);
        
        esDama = false;
        this.ajedrez.setEsRey(false);
        ajedrez.mostrarFrameDama();
    }//GEN-LAST:event_reyActionPerformed

    private void torreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torreActionPerformed
        this.setVisible(false);
        ajedrez.mostrarFrameTorre();
    }//GEN-LAST:event_torreActionPerformed

    private void alfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfilActionPerformed
        this.setVisible(false);
        ajedrez.mostrarFrameAlfil();
    }//GEN-LAST:event_alfilActionPerformed

    private void damaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damaActionPerformed
        this.setVisible(false);
        
        esDama = true;
        this.ajedrez.setEsRey(true);
        ajedrez.mostrarFrameDama();
    }//GEN-LAST:event_damaActionPerformed

    private void caballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballoActionPerformed
        this.setVisible(false);
        ajedrez.mostrarFrameCaballo();
    }//GEN-LAST:event_caballoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void caballoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballoMouseEntered
        caballo.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballoMouseEntered

    private void caballoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballoMouseExited
        caballo.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballoMouseExited

    private void alfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alfilMouseEntered
        alfil.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_alfilMouseEntered

    private void alfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alfilMouseExited
        alfil.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_alfilMouseExited

    private void torreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_torreMouseEntered
        torre.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_torreMouseEntered

    private void torreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_torreMouseExited
        torre.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_torreMouseExited

    private void damaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damaMouseEntered
        dama.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_damaMouseEntered

    private void damaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damaMouseExited
        dama.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_damaMouseExited

    private void reyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reyMouseEntered
        rey.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_reyMouseEntered

    private void reyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reyMouseExited
        rey.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_reyMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(new Color(255,102,153));
        salir.setForeground(Color.white);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(Color.white);
        salir.setForeground(new Color(255,102,153));
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Ventana().setVisible();
                Ventana v = new Ventana(1);
                v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alfil;
    private javax.swing.JButton caballo;
    private javax.swing.JButton dama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlMenú;
    private javax.swing.JButton rey;
    private javax.swing.JButton salir;
    private javax.swing.JButton torre;
    // End of variables declaration//GEN-END:variables
}
