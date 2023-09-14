package Base;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileMgtExercise {
    public static void main(String[] args) throws IOException {

        File file = new File("address_book.txt"); // This is to open the file

        /* Exercise: Address Book. Ask the user to insert Name, Last name and Tax ID tp be inserted in the address book.
        Include a feature for which the user can search for other users by name, last name or tax ID.
         */

        ArrayList<Integer> nums = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do  {
            System.out.println("\n--------------------------------\nChoose:\n1) Insert a new user;\n2) Find a user;\n3) Exit");
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                FileReader reader = new FileReader(file);
                Scanner FileScanner = new Scanner(reader);
                System.out.println("Please insert the first name, last name and tax ID of the user you want to add (lower case)");
                String phrase = in.nextLine();
                while (FileScanner.hasNextLine()) {
                    String data = FileScanner.nextLine();
                    if (data.contains(phrase)) {
                        System.out.println("User already in the system!");
                        nums.add(1);
                    } else {
                        nums.add(0);
                    }
                }
                if (nums.contains(1)) {
                    nums.clear();
                    continue;
                } else {
                    phraseSaver(phrase, file);
                    System.out.println("User added successfully!");
                    nums.clear();
                }
            } else if (choice == 2) {
                System.out.println("Search: ");
                String phrase = in.nextLine();
                phraseReader(phrase, file);
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

    public static void phraseReader(String str, File file) {
        //Reading a file by reading a single character at a time
        try {
            FileReader reader = new FileReader(file);
            Scanner FileScanner = new Scanner(reader);
            while(FileScanner.hasNextLine()) {
                String data = FileScanner.nextLine();
                if(data.contains(str)) {
                    System.out.println(data); // This will return the data
                } else {
                    System.out.println("User not found");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
