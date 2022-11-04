/*
CS 3354.001
Glossa
*/
public class StudySession {
    public StudySession() {}
    
    //Returns the accuracy score when user attempts to answer a prompt
    public int answerAttempt(String expected, String attempt) {
        //convert both strings to lowercase
        expected = expected.toLowerCase();
        attempt = attempt.toLowerCase();  
        //if the attempt matches the expected answer exactly, return a score of 10
        if(expected.equals(attempt)) {
            return 10;
        }
        //get the number of characters that differ between the attempt and expected answer
        int length = Math.min(attempt.length(), expected.length());
        int numDifferences = Math.abs(attempt.length() - expected.length());
        for(int i = 0; i < length; i++) {
            if(attempt.charAt(i) != expected.charAt(i)) {
                numDifferences++;
            }
        }
        //if more than half the characters are correct, return a score of 5
        if(numDifferences < expected.length() / 2) {
            return 5;
        }
        //if fewer than half the characters are correct, return a score of 0
        return 0;
    }
}
