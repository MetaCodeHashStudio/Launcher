/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Runnetty
 */
public class AppFileHandler {
    
    private static String Username = "Nickname";
    private static String Password = "Password";
    private static PrintStream out = null;
    private static boolean success;
    
    public static void SaveLogon(){
            // Save logon info in a file.
        //First create the folders to use
        String Name = System.getProperty("user.name"); 
        success = (new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid")).mkdirs();
        if (!success) {
            // Directory creation failed
        }
        
        try {
            File newTextFile = new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid\\logon.yah");
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(Username+":"+Password);
            fw.close();   
        }
        catch (IOException iox) { 
            iox.printStackTrace();
        } 
           finally {
            if (out != null) out.close();
            }
    }

}
