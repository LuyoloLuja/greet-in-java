package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greet implements Greetings {
    HashMap <String, Integer> greetedUsers = new HashMap<>();

//  method that will take user name and language and put in the HashMap
    public String greetUser(String username, String language) {

        username = ignoreCaseForNames(username);

        if (!greetedUsers.containsKey(username)) {
            greetedUsers.put(username, 1);
        } else if (greetedUsers.containsKey(username)) {
            greetedUsers.put(username, greetedUsers.get(username) + 1);
        }
        return AvailableLanguages.valueOf(language).getAvailableLanguage() + username + "!";
    }

//  method to get all greeted users
    public String greetedUsers() {
        String username = "";
        int userCounter = 0;

        if (greetedUsers.size() > 0) {
            for (Map.Entry<String, Integer> name : greetedUsers.entrySet()) {
                username = name.getKey();
                userCounter = name.getValue();
                System.out.println("Name: " + username + " - Times Greeted: " + userCounter);
            }
        } else {
            System.out.println("No greeted users yet!");
        }
        return username + " : " + userCounter;
    }

    //  method to check how many times each user has been greeted
    public String counterForOneUser(String username) {
        username = ignoreCaseForNames(username);
        int currentUserCounter = 0;

        if (greetedUsers.size() > 0) {
            if (greetedUsers.containsKey(username)) {
                currentUserCounter  = greetedUsers.get(username);
            }
            System.out.println("Name: " + username + " - Times Greeted: " + currentUserCounter);
        } else {
            System.out.println("No greeted users yet!");
        }
        return username + " : " + currentUserCounter;
    }

//  method to check how many users have been greeted
    public int counterForAllUsers() {
        return greetedUsers.size();
    }

//  method to clear delete all users and reset counter
    public void clearAllUsers() {

        if (greetedUsers.size() > 0) {
            greetedUsers.clear();
            System.out.println("Cleared!");
        } else {
            System.out.println("No greeted users yet!");
        }
    }

//  clear method that deletes a user by username and decrement counter for all by 1
    public void clearOneUser(String username) {
        username = ignoreCaseForNames(username);

        if (greetedUsers.size() > 0) {
            if (greetedUsers.get(username) > 0) {
                greetedUsers.remove(username);
                System.out.println("Cleared " + username + "!");
            }
        } else {
            System.out.println("No greeted users yet!");
        }
    }

//    help method to show users how to use the program
    public void help() {
        System.out.println("There are 3 available languages - ENGLISH, ISIXHOSA & AFRIKAANS.");
        System.out.println("Available commands - greet, greeted, count, counter, clear, delete.");
        System.out.println(" ");
        System.out.println("1. To greet someone - greet Username LANGUAGE.");
        System.out.println("2. To see greeted people - greeted.");
        System.out.println("3. To see how many times someone has been greeted - greeted Username.");
        System.out.println("4. To see how people have been greeted - counter.");
        System.out.println("5. To increment the counter of a certain user - clear Username.");
        System.out.println("6. To delete all the people that were greeted - delete.");
        System.out.println("7. To exit the program - exit.");
    }

//  format username to start with uppercase at index 0 and lowercase from index 1
    private String ignoreCaseForNames(String username) {
        username = username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
        return username;
    }
}
