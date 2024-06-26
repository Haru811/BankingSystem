
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
        Loan = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        Transfer.setBackground(new java.awt.Color(0, 204, 204));
        Transfer.setText("Transfer");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        PayElec.setBackground(new java.awt.Color(0, 204, 204));
        PayElec.setText("Pay Electricity Bill");
        PayElec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayElecActionPerformed(evt);
            }
        });

        Loan.setBackground(new java.awt.Color(0, 204, 204));
        Loan.setText("Loan");
        Loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanActionPerformed(evt);
            }
        });

        Saving.setBackground(new java.awt.Color(0, 204, 204));
        Saving.setText("Saving");
        Saving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingActionPerformed(evt);
            }
        });

        ChaPass.setBackground(new java.awt.Color(0, 204, 204));
        ChaPass.setText("Change Password");
        ChaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChaPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Balance");

        Transaction.setBackground(new java.awt.Color(0, 204, 204));
        Transaction.setText("Transaction");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });

        LockCard.setBackground(new java.awt.Color(0, 204, 204));
        LockCard.setText("Lock Card");
        LockCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockCardActionPerformed(evt);
            }
        });

        PayWater.setBackground(new java.awt.Color(0, 204, 204));
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
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(Transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Loan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(Saving, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PayElec)
                                .addGap(82, 82, 82)
                                .addComponent(LockCard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PayWater, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(ChaPass)))))
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanActionPerformed
        try {
            String query="SELECT * FROM accountt where accountid='"+myAccNum+"'";
            pst = Menu.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                Loan lo=new Loan(rs.getInt(1));
                lo.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_LoanActionPerformed

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


    
    public static void main(String args[]) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
