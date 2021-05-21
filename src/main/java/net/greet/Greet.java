package net.greet;

import java.util.HashMap;

public class Greet implements Greetings {
    HashMap <String, Integer> greetedUsers = new HashMap<>();

//  method that will take user name and language and show counter for one user
    public void greetUser(String username, String language) {
        username = username.substring(0, 1).toUpperCase() + username.substring(1);

        if (!greetedUsers.containsKey(username)) {
            greetedUsers.put(username, 1);
        } else if (greetedUsers.containsKey(username)) {
            greetedUsers.put(username, greetedUsers.get(username) + 1);
        }
/*      TO DO --- Handle Exception When Invalid Language Is Entered
        else if (!language.equals(AvailableLanguages.valueOf(language).getAvailableLanguage())) {
            System.out.println("Please enter an available message");
        }
*/
        System.out.println(AvailableLanguages.valueOf(language).getAvailableLanguage() + username + "!");
    }

//  method to check how many users have been greeted
    public void counterForAllUsers() { }

//  method to check how many times each user has been greeted
    public void counterForOneUser() { }

//  method to clear delete all users and reset counter
    public void clearAllUsers() { }

//  clear method that deletes a user by username and decrement counter for all by 1
    public void clearOneUser() { }

    //  exit method to exit program
    public void exitProgram() { }

//    help method to show users how to use the program
    public void help() {  }
}
