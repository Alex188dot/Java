package Base;
import java.io.File;
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

        // Exercise: ask the user to insert a phrase which will be memorized in the exercise1.txt file.

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do  {
            System.out.println("Choose:\n1) Insert a phrase;\n2) Exit");
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                System.out.println("Please insert a phrase and I will save it in the exercise1.txt file");
                String phrase = in.nextLine();
                phraseSaver(phrase);
            }
        } while (choice != 2);




    }

    public static void phraseSaver(String phrase) {
        File file = new File("exercise1.txt"); // This is to open the file
        try  {
            FileWriter writer = new FileWriter(file,true);
            writer.write("\n" + phrase);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



}
