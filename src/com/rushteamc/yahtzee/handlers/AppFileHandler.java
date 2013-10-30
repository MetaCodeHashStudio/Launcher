
package com.rushteamc.yahtzee.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class AppFileHandler {
    
    public static String Username;
    public static String Password;
    public static String saveState;
    private static PrintStream out = null;
    private static boolean success;
    
    public static void SaveLogon(){
        // Save logon info in a file.
        //First create the folders to use
        FileDownloader.gen_Folders(FileDownloader.sep + "config");
        
        String Name = System.getProperty("user.name");
        try {
            File logonCFG = new File(FileDownloader.path+FileDownloader.sep+"config"+FileDownloader.sep+"logon");
            FileWriter fw = new FileWriter(logonCFG);
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
