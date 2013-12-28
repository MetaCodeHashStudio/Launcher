package Launcher;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import javax.swing.SwingUtilities;

/*
 * @author Mats Harwiss @ MetaCode Studio
 */
public class Start {

    public static Launcher.Window window;

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
