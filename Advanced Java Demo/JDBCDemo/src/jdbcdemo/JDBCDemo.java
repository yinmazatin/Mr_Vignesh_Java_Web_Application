package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            Statement stt = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
