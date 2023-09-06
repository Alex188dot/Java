package Base;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        int n1, n2;
        n1 = 3;
        n2 = 2;
        String n3 = "2";

        // Sum
        System.out.println(n1 + n2);
        // Coercion
        System.out.println(n1 + n3);
        // Subtraction
        System.out.println(n1 - n2);
        // Multiplication
        System.out.println(n1 * n2);
        // Division
        // Se non dichiari double non fa neanche approssimazione ma dopo la virgola via
        double n4 = 3;
        double result = n4/n2;
        System.out.println(result);
        // Module
        System.out.println("Resto 3 diviso 2: " + n1 % n2);

        // Comparison operators

        // >, >=, ==, <=, !=
        System.out.println(n1 == n2);

        //Math
        System.out.println(Math.sqrt(64));
        System.out.println(Math.max(4, 10));
        System.out.println(Math.max(n1, n2));
        System.out.println(Math.min(n1, n2));
        System.out.println(Math.abs(-3));
        System.out.println(Math.random() * 11);
        int numRandom = (int)(Math.random() * 11);
        System.out.println(numRandom);
        int base = 2;
        int esponente = 3;
        System.out.println(Math.pow(base, esponente));
    /*
        // Chiedere un numero da tastiera e restituire la radice quadrata
        Scanner inp = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = inp.nextInt();
        System.out.println("La radice quadrata di " + numero + " è: " + (Math.sqrt(numero)));

        // Chiedere altri 2 numeri e restituire il valore massimo

        System.out.println("Inserisci il primo numero: ");
        int first = inp.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int second = inp.nextInt();
        System.out.println("Il numero maggiore inserito è: " + Math.max(first, second));
        */
        int i = 3;
        i++;
        System.out.println("Valore di i dopo l'incremento: " + i);
        // Per stampare il decremento o l'incremento direttamente nel print
        // fai --i o ++i, quindi mettili prima gli operatori
        System.out.println("Stampo i con decremento: " + --i);

        // 1) Scrivere un programma che chiede due numeri decimali e fa la somma
        Scanner inp = new Scanner(System.in);

        System.out.println("Inserisci il primo numero decimale: ");
        double firstDec = inp.nextDouble();

        System.out.println("Inserisci il secondo numero decimale: ");
        double secondDec = inp.nextDouble();

        double tot = firstDec + secondDec;

        System.out.println("Totale: " + tot);


        // 2) Scrivere un programma che chiede base ed esponente e effettua il calcolo potenza

        System.out.println("Inserisci la base: ");
        int base1 = inp.nextInt();

        System.out.println("Inserisci l'esponente: ");
        int esp1 = inp.nextInt();

        System.out.println("La potenza di " + base1 + " con esponente " + esp1 + " è: " + Math.pow(base1, esp1));

        // 3) Scrivi un programma che chiede 3 numeri interi presi da tastiera e calcola il minimo
        System.out.println("Inserisci il primo numero: ");
        int num1 = inp.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int num2 = inp.nextInt();

        System.out.println("Inserisci il terzo numero: ");
        int num3 = inp.nextInt();

        int minore1 = Math.min(num1, num2);
        int minore2 = Math.min(minore1, num3);

        System.out.println("Il numero minore dei tre è: " + minore2);

    }
}
