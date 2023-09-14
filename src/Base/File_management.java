package Base;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_management {
    public static void main(String[] args) throws IOException {

        /*
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());



        // Write on a file
        // FileWriter writer = new FileWriter(file); This writes/overwrites what is in the file
        // By adding true after file, it will append what the new content after the current content and NOT overwrite the content
        try  {
            FileWriter writer = new FileWriter(file,true);
            writer.write("Hi");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        */

        File file = new File("exercise1.txt"); // This is to open the file

        // Another method to read a file

        try {
            FileReader reader = new FileReader(file);
            Scanner FileScanner = new Scanner(reader);
            while (FileScanner.hasNextLine()) {
                System.out.println(FileScanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Exercise: ask the user to insert a phrase which will be memorized in the exercise1.txt file.

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do  {
            System.out.println("\n--------------------------------\nChoose:\n1) Insert a phrase;\n2) To read the file;\n3) Exit");
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                System.out.println("Please insert a phrase and I will save it in the exercise1.txt file");
                String phrase = in.nextLine();
                phraseSaver(phrase, file);
            } else if (choice == 2) {
                phraseReader(file);
            }
        } while (choice != 3);


    }

    public static void phraseSaver(String phrase, File file) {
        try  {
            FileWriter writer = new FileWriter(file,true);
            writer.write("\n" + phrase);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void phraseReader(File file) {
            //Reading a file by reading a single character at a time
            try {
            FileReader reader = new FileReader(file); // Open the file in Read only mode
            int data = reader.read();// Reads the content of the file and saves it in the entire data variable
                // The read function returns the Ascii encoding of the characters. The character to indicate
                // end of file is -1
            System.out.println(data); // Prints the Ascii code of the first character
            System.out.println((char)data); // Converts the Ascii encoding of the first character to char
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read(); // Reads the next char
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }



}
