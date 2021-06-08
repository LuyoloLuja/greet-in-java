package net.greet;

public interface Greetings {
    String greetUser(String username, String language);
    String greetedUsers();
    String counterForOneUser(String username);
    int counterForAllUsers();
    void clearOneUser(String username);
    void clearAllUsers();
    void help();
}
