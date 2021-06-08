package net.greet;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();

//      get user language
        Scanner commandScanner = new Scanner(System.in);
        System.out.println("Enter 'help' to get an overview of how to use the program.");
        String enteredString;

        Boolean programExecution = true;

        while(programExecution){

            System.out.println(" ");
            System.out.print("Please enter a command: ");
            enteredString = commandScanner.nextLine();
            System.out.println(" ");

            String[] commandBits = enteredString.split(" ");

            String enteredCommand = "";
            String enteredName = "";
            String enteredLanguage = "";

            if (commandBits.length == 1){
                enteredCommand = commandBits[0].toLowerCase();
            } else if (commandBits.length == 2) {
                enteredCommand = commandBits[0].toLowerCase();
                enteredName = commandBits[1];
            } else if (commandBits.length == 3){
                enteredCommand = commandBits[0].toLowerCase();
                enteredName = commandBits[1];
                enteredLanguage = commandBits[2];
            }

            Set<Map.Entry<String, Integer>> availableUsers = greet.greetedUsers.entrySet();

            if (enteredCommand.equals("greet")) {
                System.out.println(greet.greetUser(enteredName, enteredLanguage));
            } else if(enteredCommand.equals("greeted")) {

                if (availableUsers.size() > 0) {
                    greet.greetedUsers();
                } else {
                    System.out.println("No greeted users yet!");
                }
            } else if (enteredCommand.equals("counter")) {
                greet.counterForAllUsers();
            } else if(enteredCommand.equals("count") && !enteredName.equals(" ")) {

                if (availableUsers.size() > 0) {
                    greet.counterForOneUser(enteredName);
                } else {
                    System.out.println("No greeted users yet!");
                }
            } else if (enteredCommand.equals("clear") && !enteredName.equals(" ")) {

                if (availableUsers.size() > 0) {
                    greet.clearOneUser(enteredName);
                } else {
                    System.out.println("No greeted users yet!");
                }
            } else if(enteredCommand.equals("delete")){

                if (availableUsers.size() > 0) {
                    greet.clearAllUsers();
                    System.out.println("Cleared!");
                } else {
                    System.out.println("No greeted users yet!");
                }

            } else if (enteredCommand.equals("help")){
                greet.help();
            } else if (enteredCommand.equals("exit")) {
                programExecution = false;
            } else {
                System.out.println("Please enter a valid command!");
            }
        }
    }
}
