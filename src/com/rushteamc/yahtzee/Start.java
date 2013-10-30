package com.rushteamc.yahtzee;


import java.awt.EventQueue;

/*
 * @author Mats Harwiss @ MetaCode Studio
 */
       
public class Start {

    public static com.rushteamc.yahtzee.GUI.MainMenu frame;
    
    
    public static void main(String[] args)  {
        String sysOs = System.getProperty("os.name");
        String sysArch = System.getProperty("os.arch");
        String sysName = System.getProperty("user.name");
        String sysVer = System.getProperty("os.version");
        String javaVer = System.getProperty("java.version");
        String javaVen = System.getProperty("java.vendor");
        String archModel = System.getProperty("sun.arch.data.model");
        
        System.out.println("| - SYSTEM_USER: - " + sysName +
                "\n| - OPERATING_SYSTEM: - " + sysOs +
                "\n| - SYSTEM_ARCHITECTURE: - " + sysArch +
                "\n| - SYSTEM_VERSION: - " + sysVer +
                "\n| - JAVA_VERSION: - " + javaVer +
                "\n| - JAVA_VENDOR: - " + javaVen +
                "\n| - ARCHITECTURE_MODEL: - " + archModel);
        //db.startConnection();
        
        EventQueue.invokeLater
		(
			new Runnable() 
			{
				public void run()
				{
					try
					{
                                            frame = new com.rushteamc.yahtzee.GUI.MainMenu();
                                            frame.setLocation(600, 400);
                                            frame.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		);
        
        }  
}
