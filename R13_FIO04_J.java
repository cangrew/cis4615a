
//Rule 13. Input Output (FIO)
//FIO04-J. Release resources when they are no longer needed

import java.io.*;

public class R13_FIO04_J {

    public static void main(String[] args) {

    }
    public int processFile(String fileName)
            throws IOException, FileNotFoundException {
        try {
            final FileInputStream stream = new FileInputStream(fileName);
            try {
                final BufferedReader bufRead =
                        new BufferedReader(new InputStreamReader(stream));

                String line;
                while ((line = bufRead.readLine()) != null) {
                    // Process line
                }
            } finally {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e) {
                        // Forward to handler
                    }
                }
            }
        } catch (IOException e) {
            // Forward to handler
        }
        return 1;
    }
}
