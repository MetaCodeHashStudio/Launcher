package com.rushteamc.yahtzee;


import java.awt.EventQueue;

/*
 * @author Runnetty
 */
       
public class Start {

    public static com.rushteamc.yahtzee.GUI.LoginCreateWin frame;
    public static com.rushteamc.yahtzee.GUI.CreateAccWin frame2;
    
    public static void main(String[] args)  {
        
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
     
    
    
    
    
    
    
}
