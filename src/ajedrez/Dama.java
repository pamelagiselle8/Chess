
package ajedrez;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dama extends javax.swing.JFrame {
    Ajedrez ajedrez = new Ajedrez();
    Ventana v = new Ventana();
    char pieza = ' ';
    String mensaje = "";
    boolean valid = true, es = false, esDama;
    ImageIcon mymelody = new ImageIcon("mymelody.jpg");
    
    public Dama() {
        this.esDama = ajedrez.getEsRey();
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
        if (this.esDama == false) {
            mensaje = "Ingrese un caracter para simbolizar su rey:";
            System.out.println("no entro");
        }
        else{
            System.out.println("entro");
            mensaje = "Ingrese un caracter para simbolizar su dama:";
        }
        while(valid == false){
            pieza = JOptionPane.showInputDialog(mensaje);
            if (pieza == null) {
                this.valid = false;
                valid = true;
                this.setVisible(false);
                Ventana b = new Ventana(2);
                b.setPrimero(1);
                b.setVisible(true);
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

        pnlMenú = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salir1 = new javax.swing.JButton();
        diagonal3 = new javax.swing.JButton();
        diagonal2 = new javax.swing.JButton();
        diagonal4 = new javax.swing.JButton();
        diagonal1 = new javax.swing.JButton();
        abajoD = new javax.swing.JButton();
        arribaI = new javax.swing.JButton();
        abajoI = new javax.swing.JButton();
        arribaD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenú.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movimientos en línea recta");

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

        abajoD.setBackground(new java.awt.Color(102, 102, 255));
        abajoD.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        abajoD.setForeground(new java.awt.Color(255, 255, 255));
        abajoD.setText("Derecha");
        abajoD.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        abajoD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abajoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abajoDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abajoDMouseExited(evt);
            }
        });
        abajoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoDActionPerformed(evt);
            }
        });

        arribaI.setBackground(new java.awt.Color(102, 102, 255));
        arribaI.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        arribaI.setForeground(new java.awt.Color(255, 255, 255));
        arribaI.setText("Abajo");
        arribaI.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        arribaI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arribaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arribaIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arribaIMouseExited(evt);
            }
        });
        arribaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaIActionPerformed(evt);
            }
        });

        abajoI.setBackground(new java.awt.Color(102, 102, 255));
        abajoI.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        abajoI.setForeground(new java.awt.Color(255, 255, 255));
        abajoI.setText("Izquierda");
        abajoI.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        abajoI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abajoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abajoIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abajoIMouseExited(evt);
            }
        });
        abajoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoIActionPerformed(evt);
            }
        });

        arribaD.setBackground(new java.awt.Color(102, 102, 255));
        arribaD.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        arribaD.setForeground(new java.awt.Color(255, 255, 255));
        arribaD.setText("Arriba");
        arribaD.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        arribaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arribaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arribaDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arribaDMouseExited(evt);
            }
        });
        arribaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Movimientos diagonales");

        javax.swing.GroupLayout pnlMenúLayout = new javax.swing.GroupLayout(pnlMenú);
        pnlMenú.setLayout(pnlMenúLayout);
        pnlMenúLayout.setHorizontalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addGroup(pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(diagonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(diagonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(diagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(diagonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(arribaD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(arribaI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(abajoD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(abajoI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenúLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(salir1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlMenúLayout.setVerticalGroup(
            pnlMenúLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenúLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(diagonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(diagonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(arribaD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(arribaI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(abajoD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(abajoI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(salir1)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void diagonal3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal3MouseEntered
        diagonal3.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_diagonal3MouseEntered

    private void diagonal3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonal3MouseExited
        diagonal3.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_diagonal3MouseExited

    private void diagonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonal3ActionPerformed
        this.setVisible(false);
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
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
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
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
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
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
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
        if (es) {
            int s = 1;
            int[] limites = ajedrez.opcionDiagonal(s);
            ajedrez.mover(limites[0], limites[1]);
            es = false;
        }
        this.setVisible(true);
    }//GEN-LAST:event_diagonal1ActionPerformed

    private void abajoDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoDMouseEntered
        abajoD.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_abajoDMouseEntered

    private void abajoDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoDMouseExited
        abajoD.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_abajoDMouseExited

    private void abajoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoDActionPerformed
        this.setVisible(false);
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
        if (es) {
            int s = 3;
            int[] limites = ajedrez.opcionRecta(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_abajoDActionPerformed

    private void arribaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaIMouseEntered
        arribaI.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_arribaIMouseEntered

    private void arribaIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaIMouseExited
        arribaI.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_arribaIMouseExited

    private void arribaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaIActionPerformed
        this.setVisible(false);
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
        if (es) {
            int s = 2;
            int[] limites = ajedrez.opcionRecta(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_arribaIActionPerformed

    private void abajoIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoIMouseEntered
        abajoI.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_abajoIMouseEntered

    private void abajoIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoIMouseExited
        abajoI.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_abajoIMouseExited

    private void abajoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoIActionPerformed
        this.setVisible(false);
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
        if (es) {
            int s = 4;
            int[] limites = ajedrez.opcionRecta(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_abajoIActionPerformed

    private void arribaDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaDMouseEntered
        arribaD.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_arribaDMouseEntered

    private void arribaDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaDMouseExited
        arribaD.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_arribaDMouseExited

    private void arribaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaDActionPerformed
        this.setVisible(false);
        if (esDama) {
            es = ajedrez.pedirCasillas();
        }
        else{
            ajedrez.setLimFila(1);
            es = true;
        }
        if (es) {
            int s = 1;
            int[] limites = ajedrez.opcionRecta(s);
            ajedrez.mover(limites[0], limites[1]);
        }
        this.setVisible(true);
        es = false;
    }//GEN-LAST:event_arribaDActionPerformed

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
            java.util.logging.Logger.getLogger(Dama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajoD;
    private javax.swing.JButton abajoI;
    private javax.swing.JButton arribaD;
    private javax.swing.JButton arribaI;
    private javax.swing.JButton diagonal1;
    private javax.swing.JButton diagonal2;
    private javax.swing.JButton diagonal3;
    private javax.swing.JButton diagonal4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlMenú;
    private javax.swing.JButton salir1;
    // End of variables declaration//GEN-END:variables
}
