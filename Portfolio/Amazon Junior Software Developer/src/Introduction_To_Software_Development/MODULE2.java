package Introduction_To_Software_Development; // declare package

import java.util.Scanner; // import scanner class

public class MODULE2 { // BEGIN CLASS
    public static void main(String[] args) { // begin main method

        String name1 = "santa";
        String name2 = "Santa";

        if (name1.equalsIgnoreCase(name2)){
            System.out.println("name1 and name2 are equal? " + name1.equalsIgnoreCase(name2));
        } // end if


        // chained condition
        int moneyInPocket = 150;

        if (moneyInPocket < 150) {
            System.out.println("You have 150 dollars, you should make more money!");
        } // end if
          else {
            if (moneyInPocket > 150) {
                System.out.println("It looks like you made some money!");
            } else {
                System.out.println("It looks like you have $" + moneyInPocket + " in your pocket!");
            } // end else
        }// end else

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the 1st number: "); // 1st user prompt
        int num1 = keyboard.nextInt();

        System.out.println("Enter the 2nd number: "); // 2nd user prompt
        int num2 = keyboard.nextInt();

        System.out.println("Enter an operator: ");
        if (keyboard.hasNextLine()) {
            keyboard.nextLine();
        } // end if statement

        int result = 0;

        String operator = keyboard.nextLine();

        switch (operator) {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
            case "*": result = num1 * num2;
                break;
            case "/": result = num1 / num2;
                break;
            default: System.out.println("You must enter a valid operator!");
                break;
        }
        System.out.println("The result is: " + result);

        Scanner keyboard1 = new Scanner(System.in);
        String subChoice = """
                *********** SUB MENU FOR MONDAY *******
                1.) Yes, I had my breakfast.
                2.) No, I would like breakfast.
                ***************************************
                """;

        int dayOfTheWeek;
        dayOfTheWeek = 1;


        /*


        System.

         ********** MENU *****************
         These are the choices for week of the day. \n Please enter only values from 1-7:
         1. MONDAY
         2. TUESDAY
         3. WEDNESDAY
         4. THURSDAY
         5. FRIDAY
         6. SATURDAY
         7. SUNDAY
         ***********************************

         **/

        String menu = """
                ************ Menu ************
                These are the choices for week of the day.
                1. Monday
                2. Tuesday
                3. Wednesday
                4. Thursday
                5. Friday
                6. Saturday
                7. Sunday
                ******************************
                """;
        System.out.println(menu);


        System.out.println();
        System.out.println("Please enter a number 1-7: ");
        dayOfTheWeek = keyboard1.nextInt();


        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                int toniChoice;
                do {
                    Scanner toniInput = new Scanner(System.in);
                    System.out.println("Choose a number from the menu:\n " +
                            subChoice);

                    toniChoice = toniInput.nextInt();

                    switch (toniChoice) {
                        case 1:
                            System.out.println("Good, now you have a catchup meeting at 9 am.");
                            break;
                        case 2:
                            System.out.println("Let's divert to highway 52 and have a burger at the drive in.");
                            break;
                        default:
                            System.out.println("Invalid choice, it must be a 1 or 2.");
                            break;
                    }

                } while (toniChoice != 1 && toniChoice != 2);
                break;
            case 2:
                System.out.println("Tuesday: It's almost hump day.....");
                break;
            case 3:
                System.out.println("Wednesday: It's finally hump day....");
                break;
            case 4:
                System.out.println("Thursday: One day until Friday!");
                break;
            case 5:
                System.out.println("Friday: It's FRIYAY!!! Party all night!? Or keep it controlled?");
                break;
            case 6:
                System.out.println("Saturday: How are you feeling?");
                break;
            case 7:
                System.out.println("Sunday: Another day of rest but back to work tomorrow.....");
                break;
            default:
                System.out.println("You must enter a valid number, 1 - 7 only.");
                break;
        }


} // end main method
}// end class




