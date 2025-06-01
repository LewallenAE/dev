public class KeywordsExpressions {

    public static void main(String[] args) {
            double kilometers = (100 * 1.609344);
            System.out.println("100 miles is: " + kilometers + " kilometers.");

            int highScore = 50;

            if (highScore > 25) {
                highScore = 1000 + highScore;
            }
            System.out.println(highScore);

            int health = 100;

            if ((health < 25) && (highScore > 100)) {
                highScore = highScore - 1000;
                System.out.println(highScore);
            }
    }
}
