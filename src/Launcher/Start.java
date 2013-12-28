

/**
 * @author Runnetty aka Mats Harwiss
 * @ MetaCode Studio www.metacodestudio.com
 */
    // TODO:
    //      - Only Download from metacodestudio.com
    //      - Make it find all files at url locations folder + subfolders.
    //      - Then download them all.
    //      - Check for Launcher update using Launcher checksum. 
    //      - Check for LUD update using LUD checksum
    //      - Connect to Database and allow logon with Account and password.
    //      - RSS feed on main screen in own tab.
    //      - Link to register page under logon.
    //      - Pretty-fy Launcher window.
////////////////////////////////////////////////////////////////////////////////
package Launcher;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import javax.swing.SwingUtilities;

public class Start {

    public static Launcher.Window window;
    public static String version = "Launcher - 0.7.0 Stable";

    public static void main(String[] args) throws InterruptedException, InvocationTargetException, MalformedURLException, IOException, URISyntaxException {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                try {
                    Files.getWorkingPaths();
                    window = new Launcher.Window();
                    window.setLocation(600, 400);
                    window.setVisible(true);
                    window.updateWindowOnUpdateCheck();

                } catch (Exception e) {}
            }
        });
        synchronized (window) {
            try {
                while (window.getWaitState()) {
                    window.wait(50);
                    if (window.beginUpdate) {
                        try {
                            Update.update();
                        } finally{}
                    }
                }
            }finally{}

        }
    }
}
