/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BankingSystem {

    public static void main(String[] args) {
       Connection con= null;
       String vi="12345678";
       String tam="123456";
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root",vi);
           System.out.println("Connected to database successfully");
           con.close();
           
       }catch(ClassNotFoundException | SQLException e){
           throw new RuntimeException("Cannot connect to database");
       }

    }
    
}
