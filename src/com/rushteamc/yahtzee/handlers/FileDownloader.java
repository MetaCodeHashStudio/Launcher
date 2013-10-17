/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


/**
 * http://speedy.sh/kbvj3/ConquestDark-V1.0.zip
 * @author Runnetty
 */
public class FileDownloader 
{
    private static boolean c_Folder;
    private static String Name = System.getProperty("user.name");
    public static ArrayList<String> files = new ArrayList<>();
    public static String allFiles;
    
    public static void update(String[] downloadFiles) throws MalformedURLException, IOException
    {
        gen_Folders("\\bin"); //Puts .jar here
        gen_Folders("\\saves"); // generate Saves Folder 
        Download(downloadFiles);
        
    }
    
    
    private static void Download(String[] downloadFiles) throws MalformedURLException, FileNotFoundException, IOException
    {

        String jar = "https://dl.dropboxusercontent.com/u/57469303/Yahtzoid/Yahtzoid.jar";
       //String version = "https://dl.dropboxusercontent.com/u/57469303/Yahtzoid/Version.ver";
       getFilesFromServer(jar);
        
    }
    
    
    public static void gen_Folders(String f_lockation)
    {
        c_Folder = (new File("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid"+f_lockation)).mkdirs(); 
    }
    
     public static void getFilesFromServer(String fileUrl) throws IOException //Gets all names and puts in string called AllPlayers.
    { 
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try
        {
            in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream("C:\\Users\\" + Name + "\\AppData\\Roaming\\.yahtzoid\\bin\\Yahtzoid.jar");
            byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1)
            { 
                fout.write(data, 0, count);
            }
        }
        finally
        {
            if (in != null)
                in.close();
            if (fout != null)
                fout.close();
        }

    }
    
    
     
}
