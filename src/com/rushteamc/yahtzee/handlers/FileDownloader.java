/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rushteamc.yahtzee.handlers;

import com.rushteamc.yahtzee.GUI.MainMenu;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * http://speedy.sh/kbvj3/ConquestDark-V1.0.zip
 * @author Runnetty
 */
public class FileDownloader 
{
    private static boolean c_Folder;

    public static String sep = System.getProperty("file.separator");
    public static String path = System.getProperty("user.home") + sep +"Appdata"+sep+"Roaming"+sep+ ".yahtzoid" + sep;
    private static BufferedInputStream in = null;
    public static int fob;
 

    
    public static void update() throws MalformedURLException, IOException
    {
        gen_Folders(sep+"bin"); //Puts .jar here
        gen_Folders(sep+"saves"); // generate Saves Folder
        String jar = "http://metacodestudio.com/dist/bin/Yahtzoid.jar";
        getFilesFromServer(jar,sep+"bin"+sep+"Yahtzoid.jar");
        
    }
    
    public static boolean CheckVersion()
    {
        String a = "1";
        String b = "2";
        try {
          a = readChecksum(path+"bin"+sep+"checksum");
          
          String hash = "http://metacodestudio.com/dist/checksum.php";
          getFilesFromServer(hash,sep+"bin"+sep+"checksum");
          b = readChecksum(path+"bin"+sep+"checksum");
          
        } catch (IOException ex) {
            Logger.getLogger(FileDownloader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(a+"\n"+b);
        if(a.contains(b))
        {
            System.out.println("true");
           return true; 
           
        }else
        {
            System.out.println("false");
            return false;
        }
        
    }
       
    public static void gen_Folders(String f_lockation)
    {
        c_Folder = (new File(path+f_lockation)).mkdirs(); 
    }
    
    public static void getFilesFromServer(String fileUrl, String saveLocation) throws IOException //Gets all names and puts in string called AllPlayers.
    { 
        
        FileOutputStream fout = null;
        try
        {
            in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(path + saveLocation);
            byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1)
            { 
                fob=count;
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
     
    private static  String readChecksum( String file ) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
 

        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
        }

        return stringBuilder.toString();
    }
}
