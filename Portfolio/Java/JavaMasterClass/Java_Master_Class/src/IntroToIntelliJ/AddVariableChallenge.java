package IntroToIntelliJ;

public class AddVariableChallenge {

    public static void main(String[] args) {


        double myFirstDouble = 20.00d;
        double mySecondDouble = 90.00d;
        double addedDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        double remainder = addedDouble % 40;
        // boolean isRemainder = (remainder == 0) ? true : false;
        //System.out.println("isRemainder = " + isRemainder);

        boolean isRemainder;


        if (remainder == 0) {

            isRemainder = true;
        } else {
            isRemainder = false;
        }
        System.out.println("isRemainder = " + isRemainder);

        if (isRemainder == true) {
            System.out.println("The remainder is 0");
        } else {
            System.out.println("Got some remainder");
        }

        double x = 110d * 100d;
        double y = x % 40;
        System.out.println("y = " + y);

    } // end main
}
