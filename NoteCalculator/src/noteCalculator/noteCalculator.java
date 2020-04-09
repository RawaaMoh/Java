/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noteCalculator;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RawaaMoh
 */
public class noteCalculator extends javax.swing.JFrame {

    /**
     * Creates new form noteCalculator
     */
    student stu = new student();
    Random rn = new Random();

    public noteCalculator() {

        initComponents();

    }

    /**
     * Creates new form noteCalculator
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLetter = new javax.swing.JTextField();
        txtTerm = new javax.swing.JTextField();
        txtLab = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        txtMidterm = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Note Calculator");

        jLabel2.setText("Enter Midterm note, Final note and Lab note:");

        btnCalculate.setText("Calculate");
        btnCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalculateMouseExited(evt);
            }
        });
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        btnCalculate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCalculateKeyTyped(evt);
            }
        });

        jLabel3.setText("Midterm note:");

        jLabel4.setText("Final note     :");

        jLabel5.setText("Lab note       :");

        jLabel6.setText("Term note    :");

        jLabel7.setText("Letter note    :");

        txtLetter.setEditable(false);
        txtLetter.setText(" ");
        txtLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetterActionPerformed(evt);
            }
        });
        txtLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetterKeyTyped(evt);
            }
        });

        txtTerm.setEditable(false);
        txtTerm.setText(" ");
        txtTerm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTermKeyTyped(evt);
            }
        });

        txtLab.setText(" ");
        txtLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLabKeyTyped(evt);
            }
        });

        txtFinal.setText(" ");
        txtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinalKeyTyped(evt);
            }
        });

        txtMidterm.setText(" ");
        txtMidterm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMidterm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMidtermKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMidtermKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMidterm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLab, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTerm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLetter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalculate)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:

        stu.midterNote = Integer.valueOf(txtMidterm.getText().trim());
        stu.finalNote = Integer.valueOf(txtFinal.getText().trim());
        stu.labNote = Integer.valueOf(txtLab.getText().trim());

        txtTerm.setText(String.format("%.2f", stu.termNote()));
        txtLetter.setText(stu.letterNote());

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        if (evt .getKeyCode() == java.awt.event.KeyEvent.VK_E) {
            txtMidterm.setText(Integer.toString(rn.nextInt(101)));
            txtFinal.setText(Integer.toString(rn.nextInt(101)));
            txtLab.setText(Integer.toString(rn.nextInt(101)));
        }

    }//GEN-LAST:event_formKeyPressed

    private void btnCalculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateMouseEntered
        // TODO add your handling code here:
        btnCalculate.setForeground(Color.red);
    }//GEN-LAST:event_btnCalculateMouseEntered

    private void btnCalculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateMouseExited
        // TODO add your handling code here:
        btnCalculate.setForeground(Color.black);
    }//GEN-LAST:event_btnCalculateMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.out.println("Closing..");
    }//GEN-LAST:event_formWindowClosing

    private void txtMidtermKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidtermKeyPressed
        // TODO add your handling code here:
//        System.out.println(evt);
//        if(evt.getKeyChar() == 'r' || evt.getKeyChar() == 'R'  ){
//            System.out.println("R presssed");
//        }
    }//GEN-LAST:event_txtMidtermKeyPressed

    private void txtMidtermKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidtermKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_txtMidtermKeyTyped

    private void txtFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_txtFinalKeyTyped

    private void txtLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLabKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_txtLabKeyTyped

    private void txtTermKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTermKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_txtTermKeyTyped

    private void txtLetterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetterKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_txtLetterKeyTyped

    private void btnCalculateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalculateKeyTyped
        // TODO add your handling code here:
        keyEventChecker(evt);
    }//GEN-LAST:event_btnCalculateKeyTyped

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
        txtMidterm.setText(Integer.parseInt(txtMidterm.getText().trim()) - 10 + "");
        System.out.println("The program been resized");

//        txtMidterm.setText(Integer.parseInt(txtMidterm.getText().trim())-10 + "");
//        txtFinal.setText(Integer.parseInt(txtFinal.getText().trim())-10 + "");
//        txtLab.setText(Integer.parseInt(txtLab.getText().trim())-10 + "");
//
//        txtTerm.setText(stu.termNote() + "");
//        txtLetter.setText(stu.letterNote());
    }//GEN-LAST:event_formWindowIconified

    private void txtLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetterActionPerformed

    public void keyEventChecker(java.awt.event.KeyEvent evt) {

        char typed = evt.getKeyChar();
        if (!Character.isDigit(typed)) {
            if (typed == 'r' || typed == 'R') {
                txtMidterm.setText(Integer.toString(rn.nextInt(101)));
                txtFinal.setText(Integer.toString(rn.nextInt(101)));
                txtLab.setText(Integer.toString(rn.nextInt(101)));
            }
            evt.consume();
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_E) {
            txtMidterm.setText(Integer.toString(rn.nextInt(101)));
            txtFinal.setText(Integer.toString(rn.nextInt(101)));
            txtLab.setText(Integer.toString(rn.nextInt(101)));
        }
    }

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
            java.util.logging.Logger.getLogger(noteCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(noteCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(noteCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(noteCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new noteCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtLab;
    private javax.swing.JTextField txtLetter;
    private javax.swing.JTextField txtMidterm;
    private javax.swing.JTextField txtTerm;
    // End of variables declaration//GEN-END:variables
}