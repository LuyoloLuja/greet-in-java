package test;

import net.greet.Greet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    public void shouldBeAbleToShowGreetMessageInEnglish() {
        Greet greet = new Greet();

        assertEquals(greet.greetUser("Luyolo", "ENGLISH"), "Hello Luyolo!");
    }
    @Test
    public void shouldBeAbleToShowGreetMessageInIsiXhosa() {
        Greet greet = new Greet();

        assertEquals(greet.greetUser("Luyolo", "ISIXHOSA"), "Molo Luyolo!");
    }
    @Test
    public void shouldBeAbleToShowGreetMessageInAfrikaans() {
        Greet greet = new Greet();

        assertEquals(greet.greetUser("Luyolo", "AFRIKAANS"), "More Luyolo!");
    }

    @Test
    public void shouldBeAbleToDisplayAllGreetedUsers() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");

        assertEquals(greet.greetedUsers(), "Luyolo : 1");
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
    @Test
    public void shouldIgnoreCaseForNames() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("LUYOLO", "ENGLISH");
        greet.greetUser("LuYoLo", "ENGLISH");

        assertEquals(greet.counterForAllUsers(), 1);
    }

    @Test
    public void shouldShowHowManyTimesEachUserWasGreeted() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Salizwa", "AFRIKAANS");
        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Simthe", "ISIXHOSA");

        assertEquals(greet.counterForOneUser("Luyolo"), "Luyolo : 3");
        assertEquals(greet.counterForOneUser("Salizwa"), "Salizwa : 3");
        assertEquals(greet.counterForOneUser("Simthe"), "Simthe : 3");
    }

    @Test
    public void shouldBeAbleToClearGreetedUsers() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Salizwa", "AFRIKAANS");

        greet.clearAllUsers();

        assertEquals(greet.counterForAllUsers(), 0);
    }
    @Test
    public void shouldBeAbleToClearOneUserCounter() {
        Greet greet = new Greet();

        greet.greetUser("Luyolo", "ENGLISH");
        greet.greetUser("Luyolo", "ENGLISH");

        greet.clearOneUser("Luyolo");

        assertEquals(greet.counterForOneUser("Luyolo"), "Luyolo : 1");
    }
    @Test
    public void shouldBeAbleToClearOneUser() {
        Greet greet = new Greet();

        greet.greetUser("Simthe", "ISIXHOSA");
        greet.greetUser("Simthe", "ISIXHOSA");

        greet.clearOneUser("Simthe");
        greet.clearOneUser("Simthe");

        assertEquals(greet.counterForOneUser("Simthe"), "Simthe : 0");
    }
}
