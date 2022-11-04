/*
CS 3354.001 
Samuel Jacobs
Arayan Patel
Test example file for Glossa language application
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GlossaTest {

    /**
     * Test of multiply method, of class Multiply.
     */
    @Test
    public void testGame() {
        //1A testing equals case
        System.out.println("testGame initial");
        int turn = 0; // check if the game initially has the users turn as false
        Game instance = new Game(); // create new game Object
        int highscore = 0; //creat
        String gameType = UserInput;
        assertNotNull("Testing if game object is not null", null, instance);
        assertEquals("Checking if UserName matches", userNameTest, "User");
    }

    @Test
    public void testUser() {
        //1A testing equals case
        System.out.println("testUser  ");
        User instance = new User(); // create new game Object
        String userNameTest = "User";
        String userPassWordTest = "Password";
        String languageTest[
        1] = "English";
        assertNotNull("Testing if game object is not null", null, instance);
        assertEquals("Checking if UserName matches", userNameTest, "User");
        assertEquals("Checking if Password matches", userPassWordTest, "Password");
        assertNotNull("Testing if LanguageTest is not null", null, LanguageTest[1]);
    }

    @Test
    public void TeststudySesssion() {
        //1A testing equals case
        System.out.println("testUser  ");
        StudySession instance = new StudySession(); // create new game Object
        instance.Deck = newDeck("English Study");
        String answer = "Password";
        int accuracyScore = 9;
        assertEqual("Checking accuracy", 9, accuracyScore);

    }

    @Test
    public void testCard() {
        Card test1 = new Card();

        // checking if the attributes and methods have the correct data.
        assertEquals("Here is the the test for correctRatio", 30, correctRatio);
        assertEquals("Here is the the test for last studied", "10", test1.lastStudied);
    }

    @Test
    public void testGame() {
        //1A testing equals case
        System.out.println("testGame initial");
        int turn = 0; // check if the game initially has the users turn as false
        Game instance = new Game(); // create new game Object
        int highscore = 0;
        String gameType = UserInput;
        assertNotNull("Testing if game object is not null", null, instance);

    }
}
