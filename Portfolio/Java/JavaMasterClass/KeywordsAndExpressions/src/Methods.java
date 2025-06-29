public class Methods {

    public static void main(String[] args) {

        calculateScore();
        System.out.println(calculateScore1(true, 100, 50, 20));

        } // end main

        // This is hardcoded
    public static void calculateScore() {  // void method that doesn't return anything


        boolean gameOver = false;
        int score = 800;
        int levelComplete = 10;
        int bonus = 200;

        int finalScore = score;

        if (gameOver) {
            System.out.println("GAME OVER");
        } else if (!gameOver && score < 1_000) {
            finalScore += (levelComplete * bonus);
            System.out.println("Your score is: " + finalScore);
        }
    }
        // This is reusable

        public static String calculateScore1(boolean gameOver1, int score1, int levelComplete1, int bonus1) {  // void method that doesn't return anything


            if (!gameOver1) {
                return "GAME OVER";
            }
                int finalScore1 = score1 + (levelComplete1 * bonus1);
                return "Your score is: " + finalScore1;
            }



            // We must pass the correct arguments boolean, int, int, int

    }



