package Launcher;

import static Launcher.Files.getFilesFromServer;
import static Launcher.Files.sep;
import static Launcher.Start.window;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Update {

    public static String hash = "http://metacodestudio.com/dist/checksum.php";
    public static String jar = "http://metacodestudio.com/dist/bin/Yahtzoid.jar";
    private static String a = "1";
    private static String b = "2";
    
    
    public static String binFolder() throws URISyntaxException {
        return Files.getWorkingPaths() + Files.sep + "bin";
    }

    public static String mainFolder() throws URISyntaxException {
        return Files.getWorkingPaths();
    }

    public static void update() throws MalformedURLException, IOException, URISyntaxException, InterruptedException {

        Start.window.insertText("\n\n - - - - - - - - - - - - - - - - - - - - - - - - - - UPDATING - - - - - - - - - - - - - - - - - - - - - - - - - -");
        Start.window.insertText("\n| - Connecting...");
        Start.window.insertText("\n| - Connected!");

        Files.generateFolder(Files.sep + "bin");

        Start.window.insertText("\n - - - - - - - - - - - - - - - - - - - - - - - - DOWNLOADING - - - - - - - - - - - - - - - - - - - - - - - -");

        Start.window.insertText("\n| - " + jar + "\n| - - - TO: " + binFolder());
        Files.getFilesFromServer(jar, binFolder() + Files.sep + "Yahtzoid.jar");
        Start.window.insertText("\n| - " + hash + "\n| - - - TO: " + binFolder());
        Files.getFilesFromServer(hash, binFolder() + Files.sep + "clientVersion");
        Start.window.insertText("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");

        window.beginUpdate = false;
        window.doneUpdate = true;
        window.updateWindowOnUpdateCheck();
    }
    
    public static boolean CheckVersion() throws IOException, URISyntaxException, InterruptedException {

        try {
            a = Files.readChecksum(Update.binFolder() + sep + "clientVersion");
            getFilesFromServer(Update.hash, Update.binFolder() + sep + "serverVersion");
            b = Files.readChecksum(Update.binFolder() + sep + "serverVersion");

        } catch (IOException ex) {
            System.out.println("----------------------------------");
            System.out.println("| - Could not find Version file!");
            System.out.println("----------------------------------");
        }

        if ("1".equals(a) && "2".equals(b)) {
            System.out.println("| - FIRST TIME SETTUP:\n| - FORCING UPDATE");

        }

        if (a.contains(b)) {
            System.out.println("| - UP TO DATE");
            return true;
        } else {
            System.out.println("| - UPDATE AVAILABLE");
            return false;
        }
    }
}