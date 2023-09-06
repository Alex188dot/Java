package Base;

import java.util.Scanner;

public class Variabili {
    public static void main(String[] args) {
        int eta;
        eta = 44;
        System.out.println(eta);
        eta = 36;
        System.out.println(eta);
        int anno = 2023;
        System.out.println(anno);
        String nome = "Alessio";
        System.out.println(nome);
        System.out.println("Concatenazione: ");
        System.out.println(eta + anno);
        System.out.println("Piacere mi chiamo " + nome + " e ho " + eta + " anni");
        char carattere = 'A';
        System.out.println(carattere);
        boolean vero = true;
        System.out.println(vero);
        double virgola = 3.5;
        System.out.println(virgola);
        float virgolaFloat = 3.5f;
        System.out.println(virgolaFloat);

        // Chiedere di inserire il nome, poi il cognome e poi l'età e fai stampare tutto su una riga
        /*
        Scanner inp = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String name = inp.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        String lastname = inp.nextLine();
        System.out.println("Inserisci la tua età: ");
        String age = inp.nextLine();
        System.out.println("Nome: " + name + ", Cognome: " + lastname + ", Età: " + age);
        */

        // Constants
        // ALL IN CAPS
        // Cannot change
        // Need to declare and initialize at the same time
        // Before the type you need to insert the keyword final


        final double PIGRECO = 3.14;
        System.out.println(PIGRECO);



    }
}
