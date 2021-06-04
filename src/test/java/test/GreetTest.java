package test;

import net.greet.Greet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    public void shouldBeAbleToGreetUserInEnglishAndShowCounter() {
        Greet greet = new Greet();
        greet.greetUser("Luyolo", "ENGLISH");

        assertEquals(greet.greetedUsers(), "Luyolo : 1");
    }
    @Test
    public void shouldBeAbleToGreetUserInIsiXhosaAndDisplayCounter() {
        Greet greet = new Greet();
        greet.greetUser("Luyolo", "ISIXHOSA");
        greet.greetUser("Luyolo", "ISIXHOSA");

        assertEquals(greet.greetedUsers(), "Luyolo : 2");
    }
    @Test
    public void shouldBeAbleToGreetUserInAfrikaansAndDisplayCounter() {
        Greet greet = new Greet();
        greet.greetUser("Luyolo", "AFRIKAANS");
        greet.greetUser("Luyolo", "AFRIKAANS");
        greet.greetUser("Luyolo", "AFRIKAANS");

        assertEquals(greet.greetedUsers(), "Luyolo : 3");
    }

    @Test
    public void shouldBeAbleToShowHowManyUsersWereGreeted() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Vuyo", "ENGLISH");
        greet.greetUser("Sese", "ISIXHOSA");

        assertEquals(greet.counterForAllUsers(), 5);
    }
    @Test
    public void shouldNotTakeDuplicates() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Simthe", "ISIXHOSA");

        assertEquals(greet.counterForAllUsers(), 3);
    }

}
