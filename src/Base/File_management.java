package Base;
import java.io.File;

public class File_management {
    public static void main(String[] args) {

        File file = new File("File/test.txt"); // This is to open the file
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());




    }
}
