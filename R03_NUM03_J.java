import java.io.*;

//Rule 03. Numeric Types and Operations (NUM)
//NUM03-J. Use integer types that can fully represent the possible range of unsigned data

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
        DataOutputStream jout = new DataOutputStream(new FileOutputStream("test.txt"));
        jout.writeInt(1898);

        DataInputStream jin = new DataInputStream(new FileInputStream("test.txt"));

        System.out.println(getInteger(jin));

    }

    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }

}

