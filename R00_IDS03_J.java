
import  java.util.logging.Logger;
import java.util.regex.Pattern;


//Rule 00. Input Validation and Data Sanitization (IDS)
//IDS03-J. Do not log unsanitized user input

public class R00_IDS03_J {

    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());


    public static void main(String[] args){

        String validUser = "guest";
        String injectionUser = "guest\n" +
                "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                "SEVERE: User login succeeded for: administrator";

        //logIn(validUser);
        logIn(injectionUser);
    }

    public static void logIn(String username){
        boolean loginSuccessful;

        if(username.equals("admin")) loginSuccessful = true;
        else loginSuccessful = false;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
