/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import java.io.*;
import java.net.*;

/**
 * http://speedy.sh/kbvj3/ConquestDark-V1.0.zip
 * @author Runnetty
 */
public class FileDownloader 
{
    private static boolean c_Folder;
    private static String Name = System.getProperty("user.name");
    
    public static void update()
    {
       gen_Folders("\\saves"); // generate Saves Folder
       gen_Folders("\\bin"); //Puts .jar here
       gen_Folders("\\config");
    }
    
    public static void gen_Folders(String f_lockation)
    {
        c_Folder = (new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid"+f_lockation)).mkdirs(); 
    }
    
}
