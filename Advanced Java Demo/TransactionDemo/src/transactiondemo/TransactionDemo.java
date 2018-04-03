package transactiondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionDemo 
{
     
    public static Connection getCon()
    {
        Connection con=null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            con.setAutoCommit(false);
        } catch (Exception ex) {
            Logger.getLogger(TransactionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void debit(int acno, int amt, Connection con) throws SQLException
    {
         Statement stt = con.createStatement();
        stt.executeUpdate("update bank set balance = balance - '"+amt+"' where acno = '"+acno+"'");
    }
    public static void credit(int acno, int amt, Connection con) throws SQLException
    {
        Statement stt = con.createStatement();
        stt.executeUpdate("update bank set balce = balnce + '"+amt+"' where acno = '"+acno+"'");
    }
    public static void main(String[] args) 
    {
        int debAc,creAc,amt;
        Connection con = getCon();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the acno and amt to be debited:");
        debAc = s.nextInt();
        amt = s.nextInt();
        System.out.println("Enter the acno to be credited: ");
        creAc = s.nextInt();
        
        try 
        {
             
             Statement stt = con.createStatement();
             debit(debAc,amt,con);
             credit(creAc,amt,con);
             con.commit();
             System.out.println("Transaction success..");
        } catch (SQLException ex) {
            System.out.println("Transaction failed");
            try 
            {
                con.rollback();
                System.out.println("ROlled back");
            } catch (SQLException ex1) {
                System.out.println("Unable to roll back");
            }
            
        }
    }
}
