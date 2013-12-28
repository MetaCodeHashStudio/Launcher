

/**
 * @author Runnetty aka Mats Harwiss
 * @ MetaCode Studio www.metacodestudio.com
 */
package Launcher;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Files {

    private static boolean createFolder;
    public static String sep = System.getProperty("file.separator");
    private static BufferedInputStream in = null;

    public static String getWorkingPaths() throws URISyntaxException {
        String filePath = new File(Start.class.getProtectionDomain()
                .getCodeSource().getLocation().toURI().getPath()).toString();
        filePath = filePath.substring(0, filePath.length() - 13);
        return filePath;
    }

    public static void generateFolder(String newFolderLocation) throws URISyntaxException {
        createFolder = (new File(getWorkingPaths()+ newFolderLocation)).mkdirs();
    }

    protected static void getFilesFromServer(String fileUrl, String saveLocation) throws IOException, InterruptedException {
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(saveLocation);

            URL url = new URL(fileUrl);
            URLConnection conection = url.openConnection();
            conection.connect();

            byte data[] = new byte[1024];
            int count;
            int total = 0;
            int lenghtOfFile = conection.getContentLength();

            while ((count = in.read(data, 0, 1024)) != -1) {
                total += count;
                onProgressUpdate("" + (int) ((total * 100) / lenghtOfFile));
                fout.write(data, 0, count);
                Thread.sleep(10);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
    
    protected static String readChecksum(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
    
    public static void onProgressUpdate(String... progress) {
        System.out.println(Integer.parseInt(progress[0]));
        Start.window.updateBar(progress);
    }
}
