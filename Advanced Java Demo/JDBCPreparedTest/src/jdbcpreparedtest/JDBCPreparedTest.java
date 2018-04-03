package jdbcpreparedtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCPreparedTest 
{
    public static void main(String[] args) 
    {
        int id=1112,amt = 333333;
        String name="Batch4";
        
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
            //            Statement stt = con.createStatement();
            //            int val = stt.executeUpdate("update bank set name = 'ANother name' where acno = ''");
            //            if(val==0)
            //            {
            //                System.out.println("No rows updated ");
            //            }
            //            else
            //                System.out.println(val+" ROws updated");
            PreparedStatement ps = con.prepareStatement("insert into bank values (?,?,?)");
            ps.setInt(1, id);
            ps.setString(2,name);
            ps.setInt(3, amt);
            
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCPreparedTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPreparedTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
