import java.io.File;

//Rule 02. Expressions (EXP)
//EXP00-J. Do not ignore values returned by methods

public class R02_XP00_J {

    public static void main(String[] args) {
        deleteFile();
    }

    public static void deleteFile(){

        File someFile = new File("someFileName.txt");
        if(someFile.exists()) System.out.println("File exists");
        else System.out.println("File does not exist");
        //Do something with someFile
        if(!someFile.delete()){
            //Handle failure to delete the file
        }
    }
}
