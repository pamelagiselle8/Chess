
package ajedrez;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Caballo extends javax.swing.JFrame {
    Ajedrez ajedrez = new Ajedrez();
    char pieza = ' ';
    boolean valid = true;
    ImageIcon mymelody = new ImageIcon("mymelody.jpg");

    public Caballo() {
        this.pieza = obtenerPieza();
        if (this.valid) {
            initComponents();
            this.setLocationRelativeTo(null);
            ajedrez.setPieza(this.pieza);
        }
    }
    
    public char obtenerPieza(){
        String pieza = " ";
        char k = pieza.charAt(0);
        int num = k;
        boolean valid = false;
        while(valid == false){
            pieza = JOptionPane.showInputDialog("Ingrese un caracter para simbolizar su caballo:");
            if (pieza == null) {
                this.valid = false;
                valid = true;
                Ventana v = new Ventana(2);
                v.setVisible(true);
            }
            else{
                if(pieza.length() == 1){
                    k = pieza.charAt(0);
                    num = k;
                }
                else{
                    num = 1;
                }
                if ((num < 33) || (num > 126)) {
                    valid = false;
                    JOptionPane.showMessageDialog(null, "¡Ups! Debe ingresar un caracter para continuar.", "Entrada inválida", JOptionPane.INFORMATION_MESSAGE, this.mymelody);
                }
                else{
                   valid = true;
                   ajedrez.método1(k);
                }
            }
        }
        return k;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caballo = new javax.swing.JButton();
        caballo1 = new javax.swing.JButton();
        caballo2 = new javax.swing.JButton();
        caballo3 = new javax.swing.JButton();
        caballo4 = new javax.swing.JButton();
        caballo5 = new javax.swing.JButton();
        caballo6 = new javax.swing.JButton();
        caballo7 = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movimientos en L");

        caballo.setBackground(new java.awt.Color(102, 102, 255));
        caballo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo.setForeground(new java.awt.Color(255, 255, 255));
        caballo.setText("Arriba izquierda");
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

        caballo1.setBackground(new java.awt.Color(102, 102, 255));
        caballo1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo1.setForeground(new java.awt.Color(255, 255, 255));
        caballo1.setText("Derecha abajo");
        caballo1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo1MouseExited(evt);
            }
        });
        caballo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo1ActionPerformed(evt);
            }
        });

        caballo2.setBackground(new java.awt.Color(102, 102, 255));
        caballo2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo2.setForeground(new java.awt.Color(255, 255, 255));
        caballo2.setText("Izquierda abajo");
        caballo2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo2MouseExited(evt);
            }
        });
        caballo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo2ActionPerformed(evt);
            }
        });

        caballo3.setBackground(new java.awt.Color(102, 102, 255));
        caballo3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo3.setForeground(new java.awt.Color(255, 255, 255));
        caballo3.setText("Abajo derecha");
        caballo3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo3MouseExited(evt);
            }
        });
        caballo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo3ActionPerformed(evt);
            }
        });

        caballo4.setBackground(new java.awt.Color(102, 102, 255));
        caballo4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo4.setForeground(new java.awt.Color(255, 255, 255));
        caballo4.setText("Abajo izquierda");
        caballo4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo4MouseExited(evt);
            }
        });
        caballo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo4ActionPerformed(evt);
            }
        });

        caballo5.setBackground(new java.awt.Color(102, 102, 255));
        caballo5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo5.setForeground(new java.awt.Color(255, 255, 255));
        caballo5.setText("Derecha arriba");
        caballo5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo5MouseExited(evt);
            }
        });
        caballo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo5ActionPerformed(evt);
            }
        });

        caballo6.setBackground(new java.awt.Color(102, 102, 255));
        caballo6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo6.setForeground(new java.awt.Color(255, 255, 255));
        caballo6.setText("Izquierda arriba");
        caballo6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo6MouseExited(evt);
            }
        });
        caballo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo6ActionPerformed(evt);
            }
        });

        caballo7.setBackground(new java.awt.Color(102, 102, 255));
        caballo7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        caballo7.setForeground(new java.awt.Color(255, 255, 255));
        caballo7.setText("Arriba derecha");
        caballo7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        caballo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caballo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caballo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caballo7MouseExited(evt);
            }
        });
        caballo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballo7ActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(153, 153, 255));
        salir.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon("/Users/pame/NetBeansProjects/Ajedrez_Nuevo/sdkfjjd (1).png")); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caballo1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salir)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(caballo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(25, 25, 25))
        );

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

    private void caballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballoActionPerformed
        this.setVisible(false);
        int s = 8;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballoActionPerformed

    private void caballo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo1ActionPerformed
        this.setVisible(false);
        int s = 1;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo1ActionPerformed

    private void caballo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo2ActionPerformed
        this.setVisible(false);
        int s = 2;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo2ActionPerformed

    private void caballo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo3ActionPerformed
        this.setVisible(false);
        int s = 3;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo3ActionPerformed

    private void caballo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo4ActionPerformed
        this.setVisible(false);
        int s = 4;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo4ActionPerformed

    private void caballo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo5ActionPerformed
        this.setVisible(false);
        int s = 5;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo5ActionPerformed

    private void caballo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo6ActionPerformed
        this.setVisible(false);
        int s = 6;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo6ActionPerformed

    private void caballo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballo7ActionPerformed
        this.setVisible(false);
        int s = 7;
        int[] limites = ajedrez.opcionL(s);
        ajedrez.mover(limites[0], limites[1]);
        this.setVisible(true);
    }//GEN-LAST:event_caballo7ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
        Ventana b = new Ventana(2);
        b.setPrimero(1);
        b.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void caballo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo1MouseEntered
        caballo1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo1MouseEntered

    private void caballo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo2MouseEntered
        caballo2.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo2MouseEntered

    private void caballo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo3MouseEntered
        caballo3.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo3MouseEntered

    private void caballo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo4MouseEntered
        caballo4.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo4MouseEntered

    private void caballo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo5MouseEntered
        caballo5.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo5MouseEntered

    private void caballo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo6MouseEntered
        caballo6.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo6MouseEntered

    private void caballo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo7MouseEntered
        caballo7.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballo7MouseEntered

    private void caballoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballoMouseEntered
        caballo.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_caballoMouseEntered

    private void caballo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo1MouseExited
        caballo1.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo1MouseExited

    private void caballo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo2MouseExited
        caballo2.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo2MouseExited

    private void caballo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo3MouseExited
        caballo3.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo3MouseExited

    private void caballo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo4MouseExited
        caballo4.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo4MouseExited

    private void caballo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo5MouseExited
        caballo5.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo5MouseExited

    private void caballo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo6MouseExited
        caballo6.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo6MouseExited

    private void caballo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballo7MouseExited
        caballo7.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballo7MouseExited

    private void caballoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caballoMouseExited
        caballo.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_caballoMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(Caballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caballo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caballo;
    private javax.swing.JButton caballo1;
    private javax.swing.JButton caballo2;
    private javax.swing.JButton caballo3;
    private javax.swing.JButton caballo4;
    private javax.swing.JButton caballo5;
    private javax.swing.JButton caballo6;
    private javax.swing.JButton caballo7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
