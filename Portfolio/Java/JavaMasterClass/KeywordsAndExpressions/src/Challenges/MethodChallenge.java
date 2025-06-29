package Challenges;

public class MethodChallenge {

    public static void main(String[] args) {


        displayHighScorePosition("Anthony", 1_000); displayHighScorePosition("Nick", 500);
        displayHighScorePosition("John", 100); displayHighScorePosition("Richard", 50);

    } // end main

    public static void displayHighScorePosition(String name, int score ) {

        int position = calculateHighScorePosition(score);
        System.out.println(name + ", managed to get into the " + position + " position.");
    } // end displayHighScorePosition Method

    public static int calculateHighScorePosition(int score) {

        if (score >= 1_000) {
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    } // end calculateHighScorePosition Method
}
