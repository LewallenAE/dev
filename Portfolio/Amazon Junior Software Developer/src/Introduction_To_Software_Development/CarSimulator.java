/*
package Introduction_To_Software_Development;

import java.util.Scanner; // import scanner class.

public class CarSimulator {

    public static void main(String[] args) {







                boolean isEngineOn = false;
                String gear = "p";
                String menu = """
                ---------- Menu ----------
                1. Turn on / off the engine.
                2. Change gear (P, D, R).
                3. Accelerate.
                4. Brake.
                5. Exit.
                """;
                String brake = " ";
                int speed = 0;
                int choice = 0;


                Scanner input = new Scanner(System.in);
                // TODO 1: Declare the necessary variables for the car's state and add scanner object


                // TODO 2: Display the current state of the car (engine state, gear, speed)

                while (choice != 5) {
                System.out.println("---------- Car Dashboard ---------");
                System.out.println("Engine is " + (isEngineOn ? "ON" : "OFF"));
                System.out.println("Speed: " + speed);
                System.out.println("Gear: " + gear);

                System.out.println(menu);

                // 1. Turn on/off the engine
                // 2. Change gear (P, D, R)
                // 3. Accelerate
                // 4. Brake
                // 5. Exit

                // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
                System.out.print("Enter your choice from the menu: ");
                choice = input.nextInt();


                switch (choice) {
                    case 1:
                        isEngineOn = !isEngineOn;
                        System.out.println("You have turned the engine " + (isEngineOn ? "ON" : "OFF"));
                        break;
                    case 2:
                        System.out.print("Enter gear (P,D, R): ");
                        gear = input.next().toUpperCase();
                        break;
                    case 3:
                        if (isEngineOn && !gear.equals("P")) {
                            speed += 10;
                        } else {
                            System.out.println("Cannot accelerate while engine is off or in park!");
                        }
                        break;
                    case 4:
                        if (isEngineOn && !gear.equals("P")) {
                            if (speed > 0) {
                                System.out.println("Do you want to brake? Y/N");
                                input.nextLine();
                                brake = input.nextLine().toLowerCase();

                                if (brake.equals("y")) {
                                    speed = Math.max(0, speed - 5);
                                }
                            }
                        }
                            System.out.println("Do you want to break? Y / N.");
                            brake = input.nextLine();
                        } else if (isEngineOn && !gear.equals("P") && speed == 0) {
                            System.out.println("You aren't moving, braking is not needed!");

                        } else if (brake.toLowerCase().equals("y")) {
                            speed -= 5;
                        } else if (brake.toLowerCase().equals("n")) {
                            System.out.print("Okay, you don't want to brake.");
                        }
                        break;
                    case 5:
                        System.out.println("Okay, quitting program!");
                        break;

                }
            }

            // TODO 5: Implement a switch statement to handle the different menu choices


            // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!


        }


    } // end main
} // end class


*/
