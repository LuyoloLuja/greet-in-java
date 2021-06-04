package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greet implements Greetings {
    HashMap <String, Integer> greetedUsers = new HashMap<>();

//  method that will take user name and language and put in the HashMap
    public String greetUser(String username, String language) {

        username = getLowerCaseString(username);

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

        for (Map.Entry<String, Integer> name : greetedUsers.entrySet()) {
            username = name.getKey();
            userCounter = name.getValue();
            System.out.println("Name: " + username + " --- Times Greeted: " + userCounter);
        }
        return username + " : " + userCounter;
    }

    //  method to check how many times each user has been greeted
    public String counterForOneUser(String username) {
        username = getLowerCaseString(username);
        int currentUserCounter = 0;

        if (greetedUsers.containsKey(username)) {
            currentUserCounter  = greetedUsers.get(username);
        }
        System.out.println("Name: " + username + " --- Times Greeted: " + currentUserCounter);
        return username + " : " + currentUserCounter;
    }

    //  method to check how many users have been greeted
    public int counterForAllUsers() {
        return greetedUsers.size();
    }

//  method to clear delete all users and reset counter
    public void clearAllUsers() {
        greetedUsers.clear();
    }

//  clear method that deletes a user by username and decrement counter for all by 1
    public int clearOneUser(String username) {
        username = getLowerCaseString(username);
        int currentUser = 0;

        if (greetedUsers.get(username) > 0) {
            currentUser = greetedUsers.get(username);
            currentUser--;

            greetedUsers.put(username, currentUser);

            if (currentUser > 0) {
                System.out.println("Counter decremented for " + username + "!");
                System.out.println(username + ": " + currentUser);
            } else {
                greetedUsers.remove(username);
                System.out.println("Cleared " + username + "!");
            }
        }
        return currentUser;
    }

//    help method to show users how to use the program
    public void help() {
        System.out.println(" ");
        System.out.println("There are 3 available languages - ENGLISH, ISIXHOSA & AFRIKAANS.");
        System.out.println(" ");
        System.out.println("To greet someone use the greet command: e.g greet Username LANGUAGE.");
        System.out.println("To see greeted user names: greeted.");
        System.out.println("To see how many times a certain user has been greeted: greeted Username");
        System.out.println("To get the number of users that are greeted: counter.");
        System.out.println("To delete all the users that were greeted: delete.");
        System.out.println("To increment the counter of a certain user: clear Username.");
        System.out.println("To exit the program: exit.");
    }

//  format username to start with uppercase at index 0 and lowercase from index 1
    private String getLowerCaseString(String username) {
        username = username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
        return username;
    }
}
