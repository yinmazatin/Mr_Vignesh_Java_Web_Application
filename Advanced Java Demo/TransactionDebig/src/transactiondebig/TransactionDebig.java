package transactiondebig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionDebig 
{
    static Connection con=null;
    public static Connection getCon()
    {
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            con.setAutoCommit(false);
            
        } catch (Exception ex) {
            Logger.getLogger(TransactionDebig.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return con;
    }
    public void debit(int acno,int amt, Connection con) throws SQLException
    {
        
        Statement stt = con.createStatement();
        stt.executeUpdate("update bank set balance = balance -'"+amt+"' where acno = '"+acno+"'");
    }
    public void credit(int acno,int amt, Connection con) throws SQLException
    {
        
        Statement stt = con.createStatement();
        stt.executeUpdate("updat bank set balance = balance +'"+amt+"' where acno ='"+acno+"'");
    }
    public static void main(String[] args) 
    {
        TransactionDebig debug = new TransactionDebig();
        int acno1,acno2,amt;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter acno and amt to be debited : ");
        acno1 = s.nextInt();
        amt = s.nextInt();
        System.out.println("Enter acno of the credit account : ");
        acno2 = s.nextInt();
        con = getCon();
        
        try 
        {
            
            debug.debit(acno1, amt, con);
            debug.credit(acno2, amt, con);
            
            con.commit();
        } catch (SQLException ex) 
        {
            try 
            {
                con.rollback();
                System.out.println("Rolled back Successfully...");
            } catch (SQLException ex1) {
                System.out.println("Unable to rollback");
            }
        }
    }
}
