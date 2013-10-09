/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import com.rushteamc.yahtzee.GUI.MainMenu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Runnetty
 */
public class AppFileHandler {
    
    public static String Username;
    public static String Password;
    public static String saveState;
    private static PrintStream out = null;
    private static boolean success;
    
    public static void SaveLogon(){
            // Save logon info in a file.
        //First create the folders to use
        String Name = System.getProperty("user.name"); 
        success = (new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid")).mkdirs();
        if (!success) {
            System.out.println("Shit! couldnt create folders!");
        }
        
        try {
            File newTextFile = new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid\\logon.yah");
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(saveState + ":" + Username + ":" + Password);
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
