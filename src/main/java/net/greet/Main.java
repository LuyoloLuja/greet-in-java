package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();

//      get user input
        Scanner commandScanner = new Scanner(System.in);
        System.out.println(" ");
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

//          if statements to set command, name & language according to the index of the string
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

//          if statements to set the commands to go with their appropriate methods
            if (enteredCommand.equals("greet")) {
                System.out.println(greet.greetUser(enteredName, enteredLanguage));
            } else if(enteredCommand.equals("greeted")) {
                greet.greetedUsers();
            } else if (enteredCommand.equals("counter")) {
                System.out.println("Number of users greeted: " + greet.counterForAllUsers());
            } else if(enteredCommand.equals("count") && !enteredName.equals(" ")) {
                greet.counterForOneUser(enteredName);
            } else if (enteredCommand.equals("clear") && !enteredName.equals(" ")) {
                greet.clearOneUser(enteredName);
            } else if(enteredCommand.equals("delete")){
                greet.clearAllUsers();
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
