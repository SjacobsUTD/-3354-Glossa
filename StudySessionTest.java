/*
CS 3354.001
Glossa
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudySessionTest {
    
    public StudySessionTest() {}

    //test the answerAttempt method
    @Test
    public void testAnswerAttempt() {
        StudySession session = new StudySession();
        //full credit test
        assertEquals(10, session.answerAttempt("test", "test"));
        //partial credit test
        assertEquals(5, session.answerAttempt("tkst", "test"));
        //no credit test
        assertEquals(0, session.answerAttempt("cats", "test"));
    }
}
