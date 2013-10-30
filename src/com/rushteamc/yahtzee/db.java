
package com.rushteamc.yahtzee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * @author Runnetty
 */

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
       
    public static String addAccName;
    public static String addPassword;
    public static String addEmail;
    public static String addGender;
    public static String addDate;
    public static String salt1 = "aqwserdftghyuikolpø";
    public static String salt2 = "1234567890";
    public static String addLvl = "1";
    public static String addGold = "10";
    public static String addXP = "0";
    
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
    

    
    public static void addAccToDB(){
        
        try {
            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO metaacc (aNickname, aPassword, aEmail, aGender,aDate)\n"
                    + "value('" + addAccName + "', AES_ENCRYPT('" + addPassword + "','"+ salt1+salt2 +"'),'" + addEmail + "', '" + addGender + "', '" + addDate + "');");
            
            pst2 = con.prepareStatement("INSERT INTO yahtzoid (aLvl, aGold,aXP)\n" +
"VALUE("+ addLvl + "," + addGold + "," + addXP + ");");
           
            pst.executeUpdate();
            pst2.executeUpdate();

            
            String addAccName= null;
            String addPassword= null;
            String addEmail= null;
            String addGender = null;
            String addDate = null;
            
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
