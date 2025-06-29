public class Harnessing_Code_Blocks_And_If_Else_Statements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            boolean gameOver1 = true;
            int score1 = 25_000;
            int levelCompleted1 = 8;
            int bonus1 = 200;

            int finalScore1 = score1;

            if (gameOver1 == true) {
                finalScore1 += (levelCompleted1 * bonus1);
                System.out.println("Your final score was: " + finalScore1);
            }

        }
    }

}