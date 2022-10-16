
//Rule 07. Exceptional Behavior (ERR)
//ERR02-J. Prevent exceptions while logging data

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class R07_ERR02_J {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.err.println(e);
            // Recover from exception
        }
    }


}
