package net.greet;

public interface Greetings {
    void greetUser(String username, String language);
    void counterForAllUsers();
    void counterForOneUser();
    void clearAllUsers();
    void clearOneUser();
    void exitProgram();
    void help();
}
