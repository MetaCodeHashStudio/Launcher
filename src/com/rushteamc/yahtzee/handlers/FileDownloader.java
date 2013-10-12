/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * http://speedy.sh/kbvj3/ConquestDark-V1.0.zip
 * @author Runnetty
 */
public class FileDownloader 
{
    private static boolean c_Folder;
    private static String Name = System.getProperty("user.name");
    
    public static void update(String[] a) throws MalformedURLException, IOException
    {
        
        gen_Folders("\\bin"); //Puts .jar here
        gen_Folders("\\saves"); // generate Saves Folder
        for (int i = 0; i < a.length; i++) {
        //download(a[i]);
        }
       //download("damyx.ucoz.org/load/0-0-0-1-20", "C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid\\bin\\Yag.html");
       
       
    }
    
    public static void gen_Folders(String f_lockation)
    {
        c_Folder = (new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid"+f_lockation)).mkdirs(); 
    }
     
}
