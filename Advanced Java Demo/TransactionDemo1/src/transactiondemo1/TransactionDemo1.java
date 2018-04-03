package transactiondemo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionDemo1 
{
    public static void main(String[] args) 
    {
        Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","");
            con.setAutoCommit(false);
            Statement stt = con.createStatement();
            stt.executeUpdate("insert into mytbl (id,name) values ('1288','Varun')");
            stt.executeUpdate("insert into mytbl (id,name) vlues ('1298','Arun')");
            
            con.commit();
            
            ResultSet rs = stt.executeQuery("select * from mytbl");
            while(rs.next())
            {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
            }
            System.out.println("Insertion Complete...");
        } catch (ClassNotFoundException ex) 
        {
            
        } catch (SQLException ex) 
        {
            try 
            {
                con.rollback();
                System.out.println("Rolled back successfully...");
            } catch (SQLException ex1) {
                Logger.getLogger(TransactionDemo1.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        try 
        {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Connection closed...");
        }
    }
}