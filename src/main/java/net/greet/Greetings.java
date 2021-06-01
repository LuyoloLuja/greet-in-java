package net.greet;

public interface Greetings {
    void greetUser(String username, String language);
    void greetedUsers();
    int counterForAllUsers();
    int counterForOneUser(String username);
    void clearAllUsers();
    void clearOneUser(String username);
    void exitProgram();
    void help();
}
