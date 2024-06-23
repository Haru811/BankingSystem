/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankingsystem;

/**
 *
 * @author NC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transfer = new javax.swing.JButton();
        PayElec = new javax.swing.JButton();
        Loan = new javax.swing.JButton();
        Saving = new javax.swing.JButton();
        ChaPass = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Transaction = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        View = new javax.swing.JButton();
        LockCard = new javax.swing.JButton();
        PayWater = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        Transfer.setBackground(new java.awt.Color(0, 204, 204));
        Transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bank.png"))); // NOI18N
        Transfer.setText("Transfer");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        PayElec.setBackground(new java.awt.Color(0, 204, 204));
        PayElec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mobile-payment.png"))); // NOI18N
        PayElec.setText("Pay Electricity Bill");
        PayElec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayElecActionPerformed(evt);
            }
        });

        Loan.setBackground(new java.awt.Color(0, 204, 204));
        Loan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/business.png"))); // NOI18N
        Loan.setText("Loan");
        Loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanActionPerformed(evt);
            }
        });

        Saving.setBackground(new java.awt.Color(0, 204, 204));
        Saving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallet.png"))); // NOI18N
        Saving.setText("Saving");
        Saving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingActionPerformed(evt);
            }
        });

        ChaPass.setBackground(new java.awt.Color(0, 204, 204));
        ChaPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallet.png"))); // NOI18N
        ChaPass.setText("Change Password");
        ChaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChaPassActionPerformed(evt);
            }
        });

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Balance");

        Transaction.setBackground(new java.awt.Color(0, 204, 204));
        Transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notification.png"))); // NOI18N
        Transaction.setText("Transaction");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(0, 204, 204));
        View.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\view.png")); // NOI18N
        View.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LockCard.setBackground(new java.awt.Color(0, 204, 204));
        LockCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/protection.png"))); // NOI18N
        LockCard.setText("Lock Card");
        LockCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockCardActionPerformed(evt);
            }
        });

        PayWater.setBackground(new java.awt.Color(0, 204, 204));
        PayWater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mobile-payment.png"))); // NOI18N
        PayWater.setText("Pay Water Bill");
        PayWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayWaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(View))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(Transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Loan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(Saving, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(PayElec)
                        .addGap(82, 82, 82)
                        .addComponent(LockCard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(PayWater, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(ChaPass)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(View))
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Transfer)
                    .addComponent(Transaction))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Loan)
                    .addComponent(Saving))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayElec)
                    .addComponent(LockCard))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayWater)
                    .addComponent(ChaPass))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void LoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanActionPerformed
        dispose();
        Loan loan=new Loan();
        loan.setVisible(true);
    }//GEN-LAST:event_LoanActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        dispose();
        Transfer tra=new Transfer();
        tra.setVisible(true);
    }//GEN-LAST:event_TransferActionPerformed

    private void PayElecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayElecActionPerformed
       dispose();
       PayElectric elec=new PayElectric();
       elec.setVisible(true);
    }//GEN-LAST:event_PayElecActionPerformed

    private void PayWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayWaterActionPerformed
       dispose();
       PayWater wat=new PayWater();
       wat.setVisible(true);
    }//GEN-LAST:event_PayWaterActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
       dispose();
       Transaction tras=new Transaction();
       tras.setVisible(true);
    }//GEN-LAST:event_TransactionActionPerformed

    private void SavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingActionPerformed
       dispose();
       Saving sa=new Saving();
       sa.setVisible(true);
    }//GEN-LAST:event_SavingActionPerformed

    private void LockCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockCardActionPerformed
       dispose();
       Lock lock=new Lock();
       lock.setVisible(true);
    }//GEN-LAST:event_LockCardActionPerformed

    private void ChaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChaPassActionPerformed
       dispose();
       ChaPass cha=new ChaPass();
       cha.setVisible(true);
    }//GEN-LAST:event_ChaPassActionPerformed


    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChaPass;
    private javax.swing.JButton Loan;
    private javax.swing.JButton LockCard;
    private javax.swing.JButton PayElec;
    private javax.swing.JButton PayWater;
    private javax.swing.JButton Saving;
    private javax.swing.JButton Transaction;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
