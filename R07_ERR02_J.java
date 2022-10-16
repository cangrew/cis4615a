
//Rule 07. Exceptional Behavior (ERR)
//ERR02-J. Prevent exceptions while logging data

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R07_ERR02_J {
    private static final Logger logger = Logger.getLogger(R07_ERR02_J.class.getName());
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, (Supplier<String>) e);
            // Recover from exception
        }
    }


}
