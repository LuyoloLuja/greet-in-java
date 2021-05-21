package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();

        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String enteredUsername = nameScanner.nextLine();

        Scanner languageScanner = new Scanner(System.in);
        System.out.print("Please enter a language: ");
        String enteredLanguage = languageScanner.nextLine();

        greet.greetUser(enteredUsername, enteredLanguage);
    }
}
