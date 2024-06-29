
package bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class Saving extends javax.swing.JFrame {

    public Saving() {
        initComponents();
        this.setLocationRelativeTo(null);//form in center
    }
    
    int myAccNum;
    PreparedStatement pst,pst1,pst2;
    ResultSet rs;
    
    public Saving(int Num) {
        initComponents();
        this.setLocationRelativeTo(null);//form in center
        myAccNum= Num;
        jLabel4.setText(" " +myAccNum);           
      
    }
    
    int Bala;
    public void GetBalance(int Bal){
        Bala= Bal;
        jLabel6.setText(" "+Bala);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saving");

        jLabel1.setText("Amount");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 month", "3 months", "6 months", "12 months" }));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("       Percentage profit for 1 month is 1.9%\n       Percentage profit for 3 months is 2.5%\n       Percentage profit for 6 months is 2.9%\n       Percentage profit for 12 months is 3.6%");
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Account ID");

        jLabel4.setText("jLabel4");

        jLabel5.setText("Month");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Balance");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton1)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
           String s;
           s=String.valueOf(myAccNum);
            String query="Select * from accountt where accountid='"+s+"'";
            pst = Saving.upDataDB().prepareStatement(query);
            rs= pst.executeQuery();
            if(rs.next()){
                Menu me=new Menu(rs.getInt(1));
                me.GetBalance(rs.getInt(7));
                me.setVisible(true);       
                this.dispose();
            }
         }catch(SQLException ex){
             java.util.logging.Logger.getLogger(Saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String s;
       s=String.valueOf(myAccNum);
       String mo=jComboBox1.getSelectedItem().toString();

       Date date =new Date();
       java.sql.Date sqldate= new java.sql.Date(date.getTime());
       
       LocalDate futureDate;
       //int balance = Integer.parseInt(jLabel6.getText());
       int amount = Integer.parseInt(jTextField1.getText());
        try{
            
            if(amount > Bala){
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
            }
            else{
            //update accountt
                String query1 = "Update accountt set balance=balance-? , saving=? where accountid='"+s+"'";
                pst1= Saving.upDataDB().prepareStatement(query1);
                pst1.setInt(1, amount);
                pst1.setInt(2,amount);
                pst1.executeUpdate(); 
                
                
            //update savingg
                String query2 ="Insert into saving(accountid,amount,monthsave,startdate,enddate) values ('"+s+"',?,?,?,?) ";
                pst2=Saving.upDataDB().prepareStatement(query2);
                pst2.setInt(1, amount);
                pst2.setString(2, mo);
                pst2.setDate(3, sqldate);
        
                if("1 month".equals(jComboBox1.getSelectedItem().toString())){
                    futureDate= LocalDate.now().plusMonths(1);
                    pst2.setDate(4, java.sql.Date.valueOf(futureDate));
                }
                else if("3 months".equals(jComboBox1.getSelectedItem().toString())){
                    futureDate= LocalDate.now().plusMonths(3);
                    pst2.setDate(4, java.sql.Date.valueOf(futureDate));
                }
                else if("6 months".equals(jComboBox1.getSelectedItem().toString())){
                    futureDate= LocalDate.now().plusMonths(6);
                    pst2.setDate(4, java.sql.Date.valueOf(futureDate));
                }
                else{
                    futureDate= LocalDate.now().plusMonths(12);
                    pst2.setDate(4, java.sql.Date.valueOf(futureDate));
                }
                pst2.executeUpdate();
            }
        }catch(SQLException ex){
                java.util.logging.Logger.getLogger(Saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saving().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
