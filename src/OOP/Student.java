package OOP;

import java.util.Locale;

public class Student {
    private String name;
    private String lastname;
    private String IDNum;

    public Student (String name, String lastname, String IDNum) {
        this.name = name;
        this.lastname = lastname;
        this.IDNum = IDNum;
    }

    public String toString() {
        return ("Name: " + capitalize(name) + " - Lastname: " + capitalize(lastname) + " - ID Num: " + IDNum);
    }

    // Encapsulation is needed to manage all the properties of a class ONLY through getters and setters

    public String getName() {
        return capitalize(name);
    }

    public String getLastname() {
        return capitalize(lastname);
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setName(String name) {
        this.name = cleanString(name);
    }

    public void setLastname(String lastname) {
        this.lastname = cleanString(lastname);
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public static String cleanString(String str) {
        str = str.trim();
        str = str.toLowerCase();
        str = str.replace(",", "");
        str = str.replace(".", "");
        str = str.replace("  ", " ");
        return str;
    }

    public String capitalize(String str) {
       return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


}
