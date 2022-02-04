
package ajedrez;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Alfil extends javax.swing.JFrame {
    Ajedrez ajedrez = new Ajedrez();
    char pieza = ' ';
    boolean valid = true, es = false;
    ImageIcon mymelody = new ImageIcon("mymelody.jpg");
    
    public Alfil() {
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
            pieza = JOptionPane.showInputDialog("Ingrese un caracter para simbolizar su alfil:");
            if (pieza != null) {
                try{
                    k = pieza.charAt(0);
                    ajedrez.método1(k);
                    this.valid = true;
                    valid = true;
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "¡Ups! Debe ingresar un caracter para continuar.", "Entrada inválida", JOptionPane.INFORMATION_MESSAGE, this.mymelody);
                } 
            }
            else{
                this.valid = false;
                valid = true;
                Ventana v = new Ventana(2);
                v.setVisible(true);
            }
            
        }
        return k;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenú = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        diagonal3 = new javax.swing.JButton();
        diagonal2 = new javax.swing.JButton();
        diagonal4 = new javax.swing.JButton();
        diagonal1 = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenú.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movimientos diagonales");

        diagonal3.setBackground(new java.awt.Color(102, 102, 255));
        diagonal3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        diagonal3.setForeground(new java.awt.Color(255, 255, 255));
        diagonal3.setText("Abajo a la derecha");
        diagonal3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        diagonal3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagonal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diagonal3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diagonal3MouseExited(evt);
            }
        });
        diagonal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal3ActionPerformed(evt);
            }
        });

        diagonal2.setBackground(new java.awt.Color(102, 102, 255));
        diagonal2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        diagonal2.setForeground(new java.awt.Color(255, 255, 255));
        diagonal2.setText("Arriba a la izquierda");
        diagonal2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        diagonal2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagonal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diagonal2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diagonal2MouseExited(evt);
            }
        });
        diagonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal2ActionPerformed(evt);
            }
        });

        diagonal4.setBackground(new java.awt.Color(102, 102, 255));
        diagonal4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        diagonal4.setForeground(new java.awt.Color(255, 255, 255));
        diagonal4.setText("Abajo a la izquierda");
        diagonal4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        diagonal4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagonal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diagonal4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diagonal4MouseExited(evt);
            }
        });
        diagonal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal4ActionPerformed(evt);
            }
        });

        diagonal1.setBackground(new java.awt.Color(102, 102, 255));
        diagonal1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        diagonal1.setForeground(new java.awt.Color(255, 255, 255));
        diagonal1.setText("Arriba a la derecha");
        diagonal1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        diagonal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diagonal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diagonal1MouseExited(evt);
            }
        });
        diagonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonal1ActionPerformed(evt);
            }
        });

        salir1.setBackground(new java.awt.Color(153, 153, 255));
        salir1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        salir1.setForeground(new java.awt.Color(255, 255, 255));
        salir1.setIcon(new javax.swing.ImageIcon("/Users/pame/NetBeansProjects/Ajedrez_Nuevo/sdkfjjd (1).png")); // NOI18N
        salir1.setBorder(null);
        salir1.setBorderPainted(false);
        salir1.setContentAreaFilled(false);
        salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir1.setFocusPainted(false);
        salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir1MouseExited(evt);
            }
        });
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenúLayout = new javax.swing.GroupLayout(pnlMenú);
        pnlMenú.setLayout(pnlMenúLayout);
        pnlMenúLayout.setHorizontalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenúLayout.createSequentialGroup()
                        .addComponent(salir1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenúLayout.createSequentialGroup()
                        .addGroup(pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnlMenúLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diagonal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diagonal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diagonal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diagonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(91, 91, 91))))
        );
        pnlMenúLayout.setVerticalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(diagonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(salir1)
                .addGap(31, 31, 31))
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

    private void diagonal3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal3MouseEntered
        diagonal3.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_diagonal3MouseEntered

    private void diagonal3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal3MouseExited
        diagonal3.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_diagonal3MouseExited

    private void diagonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal3ActionPerformed
        this.setVisible(false);
        es = ajedrez.pedirCasillas();
        if (es) {
            int s = 3;
            int[] limites = ajedrez.opcionDiagonal(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_diagonal3ActionPerformed

    private void diagonal2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal2MouseEntered
        diagonal2.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_diagonal2MouseEntered

    private void diagonal2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal2MouseExited
        diagonal2.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_diagonal2MouseExited

    private void diagonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal2ActionPerformed
        this.setVisible(false);
        es = ajedrez.pedirCasillas();
        if (es) {
            int s = 2;
            int[] limites = ajedrez.opcionDiagonal(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_diagonal2ActionPerformed

    private void diagonal4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal4MouseEntered
        diagonal4.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_diagonal4MouseEntered

    private void diagonal4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal4MouseExited
        diagonal4.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_diagonal4MouseExited

    private void diagonal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal4ActionPerformed
        this.setVisible(false);
        es = ajedrez.pedirCasillas();
        if (es) {
            int s = 4;
            int[] limites = ajedrez.opcionDiagonal(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_diagonal4ActionPerformed

    private void diagonal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal1MouseEntered
        diagonal1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_diagonal1MouseEntered

    private void diagonal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal1MouseExited
        diagonal1.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_diagonal1MouseExited

    private void diagonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal1ActionPerformed
        this.setVisible(false);
        es = ajedrez.pedirCasillas();
        if (es) {
            int s = 1;
            int[] limites = ajedrez.opcionDiagonal(s);
            ajedrez.mover(limites[0], limites[1]);
            es = false;
        }
        this.setVisible(true);
    }//GEN-LAST:event_diagonal1ActionPerformed

    private void salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salir1MouseEntered

    private void salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salir1MouseExited

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        this.setVisible(false);
        Ventana b = new Ventana(2);
        b.setPrimero(1);
        b.setVisible(true);
    }//GEN-LAST:event_salir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Alfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagonal1;
    private javax.swing.JButton diagonal2;
    private javax.swing.JButton diagonal3;
    private javax.swing.JButton diagonal4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlMenú;
    private javax.swing.JButton salir1;
    // End of variables declaration//GEN-END:variables
}
