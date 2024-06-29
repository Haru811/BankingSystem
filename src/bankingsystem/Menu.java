
package bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);//form in center
        
    }
    
    int myAccNum;
    public Menu(int AccNum){
        initComponents();
        myAccNum = AccNum;    
        jLabel2.setText(" " +myAccNum);
        this.setLocationRelativeTo(null);//form in center
    }
    
    PreparedStatement pst;
    ResultSet rs;
    
    int Bala;
    public void GetBalance(int Bal){
        Bala= Bal;
        jLabel3.setText(" "+Bala);
    }
    
     public static Connection upDataDB(){
       Connection con= null;
       String vi="12345678";
       String tam="123456";     
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root",vi);
           System.out.println("Connected to database successfully");
           //con.close();
           return con;
       }catch(ClassNotFoundException | SQLException e){
           throw new RuntimeException("Cannot connect to database");
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transfer = new javax.swing.JButton();
        PayElec = new javax.swing.JButton();
        Saving = new javax.swing.JButton();
        ChaPass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Transaction = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LockCard = new javax.swing.JButton();
        PayWater = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Balance");

        Transaction.setBackground(new java.awt.Color(0, 204, 204));
        Transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/business.png"))); // NOI18N
        Transaction.setText("Transaction");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Account ID");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(PayElec))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ChaPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Transaction, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(Saving, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(PayWater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LockCard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transfer)
                    .addComponent(Transaction))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Saving)
                    .addComponent(ChaPass))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayElec)
                    .addComponent(PayWater))
                .addGap(30, 30, 30)
                .addComponent(LockCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
       try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                TransferConfirm tras=new TransferConfirm(rs.getInt(1));
                tras.GetBalance(rs.getInt(7));
                tras.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_TransferActionPerformed

    private void PayElecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayElecActionPerformed
        try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                PayElectric elec=new PayElectric(rs.getInt(1));
                elec.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }

    }//GEN-LAST:event_PayElecActionPerformed

    private void PayWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayWaterActionPerformed
       try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                PayWater water=new PayWater(rs.getInt(1));
                water.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_PayWaterActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
        try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                Transaction tras=new Transaction(rs.getInt(1));
                tras.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_TransactionActionPerformed

    private void SavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingActionPerformed
       try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                Saving sa=new Saving(rs.getInt(1));
                sa.GetBalance(rs.getInt(7));
                sa.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_SavingActionPerformed

    private void LockCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockCardActionPerformed
       try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                Lock lo=new Lock(rs.getInt(1));
                //tras.GetBalance(rs.getInt(7));
                lo.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_LockCardActionPerformed

    private void ChaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChaPassActionPerformed
       try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                ChaPass cha=new ChaPass(rs.getInt(1));
                //tras.GetBalance(rs.getInt(7));
                cha.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_ChaPassActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Login lg= new Login();
         lg.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChaPass;
    private javax.swing.JButton LockCard;
    private javax.swing.JButton PayElec;
    private javax.swing.JButton PayWater;
    private javax.swing.JButton Saving;
    private javax.swing.JButton Transaction;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
