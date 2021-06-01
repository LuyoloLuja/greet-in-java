package net.greet;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();

//      get user language
        Scanner commandScanner = new Scanner(System.in);
        System.out.println("Enter 'help' to get help with using the program.");
        System.out.print("Please enter a command: ");
        String enteredCommand = commandScanner.nextLine();

        while(!enteredCommand.equals("exit")){

            System.out.println(enteredCommand);
            System.out.print("Please enter a command: ");
            enteredCommand = commandScanner.nextLine();

            String[] commandBits = enteredCommand.split(" ");

            String command = "";
            String name = "";
            String language = "";

            if (commandBits.length == 1){
                command = commandBits[0].toLowerCase();
            } else if (commandBits.length == 2) {
                command = commandBits[0].toLowerCase();
                name = commandBits[1];
            } else if (commandBits.length == 3){
                command = commandBits[0].toLowerCase();
                name = commandBits[1];
                language = commandBits[2];
            }

            if (command.equals("greet")) {
                greet.greetUser(name, language);
            } else if(command.equals("greeted")) {
                greet.greetedUsers();
            } else if (command.equals("counter")) {
                greet.counterForAllUsers();
            } else if (command.equals("clear") && !name.equals(" ")) {
                greet.clearOneUser(name);
            } else if (command.equals("help")){
                greet.help();
            } else {
                System.out.println("Please enter a valid command!");
            }
        }

    }
}
