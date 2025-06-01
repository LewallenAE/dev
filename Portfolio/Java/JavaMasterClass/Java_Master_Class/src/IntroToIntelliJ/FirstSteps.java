package IntroToIntelliJ;

public class FirstSteps {

    /*  JAVA Keywords
     * https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9
     *
     * primitives
     *
     * byte
     * short
     * int
     * long
     * float
     * double
     * char
     * boolean
     */

    // public is an access modifier
    // class is a keyword to define a class
    // the class name follows the keyword in this case "FirstSteps" seen at the top.
    // FirstSteps is the name of the class that we are using now.
    // void tells Java that this by default doesn't return anything
    // main is the main method
    public static void main(String[] args) {
        int myFirstNumber = 5;

        System.out.println(myFirstNumber);

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;

        System.out.println(myMinShortValue + " " + myMinIntValue);

        byte lilByte = 120;
        short lilShort = 12_000;
        int lilInt = 5;
        long lilLongSum = (50_000L + (10 * (lilByte + lilShort + lilInt)));


        System.out.println(lilLongSum);

        double poundsToKlos = 1 * 0.45359237;
        double pounds = 200d;
        double kiloConversion = pounds * poundsToKlos;
        System.out.println(kiloConversion);
        


    }

}
