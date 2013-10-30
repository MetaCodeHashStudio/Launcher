package com.rushteamc.yahtzee;


import java.awt.EventQueue;

/*
 * @author Runnetty
 */
       
public class Start {

    public static com.rushteamc.yahtzee.GUI.LoginCreateWin frame;
    public static com.rushteamc.yahtzee.GUI.CreateAccWin frame2;
    public static com.rushteamc.yahtzee.GUI.MainMenu frame3;
    
    public static void main(String[] args)  {
        String sysOs = System.getProperty("os.name");
        String sysArch = System.getProperty("os.arch");
        String sysName = System.getProperty("user.name");
        System.out.println(sysName +" is using Os: "+sysOs + "\nWith a " + sysArch + " Architecture");
        db.startConnection();
        //db.addAccToDB();
        EventQueue.invokeLater
		(
			new Runnable() 
			{
				public void run()
				{
					try
					{
						frame = new com.rushteamc.yahtzee.GUI.LoginCreateWin();
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
    
        public static void goToCreateAcc() // Called by the event handler of PlayerNumbers. Starts PlayerNames check.
	{
		EventQueue.invokeLater
		(
			new Runnable() 
			{
				public void run()
				{
					try
					{
						frame2 = new com.rushteamc.yahtzee.GUI.CreateAccWin();
                                                frame2.setLocation(600, 400);
                                                frame2.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		);
		
	}
     
        public static void goToLogon() // Called by the event handler of PlayerNumbers. Starts PlayerNames check.
	{
		EventQueue.invokeLater
		(
			new Runnable() 
			{
				public void run()
				{
					try
					{
						frame3 = new com.rushteamc.yahtzee.GUI.MainMenu();
                                                frame3.setLocation(600, 400);
                                                frame3.setVisible(true);
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
