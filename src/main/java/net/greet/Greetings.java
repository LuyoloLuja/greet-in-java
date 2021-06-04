package net.greet;

public interface Greetings {
    String greetUser(String username, String language);
    String greetedUsers();
    int counterForAllUsers();
    String counterForOneUser(String username);
    void clearAllUsers();
    int clearOneUser(String username);
    void help();
}
