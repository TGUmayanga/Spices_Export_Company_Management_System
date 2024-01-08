

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbcon {
    public static Connection c;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/spices_export_management_system";
            String un = "root";
            String pw = "123456";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/spices_export_management_system?useSSL=false","root","123456");
                      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void IUD(String Query) throws Exception{ // I - insert / U - update / D - delete
        Statement s = c.createStatement();
        s.executeUpdate(Query);
    }
    public static ResultSet SEARCH(String query) throws Exception{
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        return rs;
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}