
package Launcher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
    
       private static Connection con = null;
       private static Statement st = null;
       private static ResultSet rs = null;
       private static PreparedStatement pst = null;
       private static PreparedStatement pst2 = null;
       private static PreparedStatement pst3 = null;

       private static String url = "jdbc:mysql://localhost:3306/yahtzoid_acc";
       private static  String user = "root";
       private static  String password = "root";
       
    public static void startConnection(){
        
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");
         
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {


        } 
        
    }
    
      public static void EndConnection(){
          try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

            }
    
      }
}
