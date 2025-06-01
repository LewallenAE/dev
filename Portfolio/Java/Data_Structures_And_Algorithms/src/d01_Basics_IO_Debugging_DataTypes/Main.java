package d01_Basics_IO_Debugging_DataTypes; // declare the package

import java.util.Scanner; // import the scanner for user input


public class Main { // declare the class

    // the main method is the entry point of your entire program
    public static void main(String[] args) { // you can type psvm + tab to autogen this

        // input from user, you must put import java.util.Scanner; at the top

        // System.out.println(); this is the way to print something to the console.

        //Scanner input = new Scanner(System.in);
        //System.out.println(input.nextInt());
        //System.out.println(input.nextLine()); // always use this after a nextInt

        /*
        use forward slash and asterisk for multiline comment or java doc

        Primitive Data Types

        int integer = 5;
        long largeInteger = 929339932L;  use capital L for best practice
        char character = 'd';   Best practice is to use single quote (apostrophe pair) for char
        float decimalNumber = 99.84f;  must use f with float
        double largeDecimalNumber = 99.82882392320039d; you don't have to use d with double
        boolean isTrue = false or true; it will only take these two values

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: "); // sout + tab will auto gen this
        int rollNo = input.nextInt();
        System.out.println("Your roll number is: " + rollNo);

        // If we want this to be a double


        System.out.println("Enter a decimal: ");
        double rollDouble = input.nextDouble();
        System.out.println("Your rolled decimal is: " + rollDouble);

        // Now we cannot use commas like 7,000,000 but we can do 7_000_000
        int largeNumber = 7_000_000;
        System.out.println("The number is: " + largeNumber);

        // For any input notice that
        /*
        string is input.nextString();
        double is input.nextDouble();
        boolean is input.nextBoolean();
        float is input.nextFloat();

        etc.
         */

    } // end main mark the end of the main method
} // end class   mark the end of the class
