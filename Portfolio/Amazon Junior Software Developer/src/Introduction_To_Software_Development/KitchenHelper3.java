package Introduction_To_Software_Development;

public class KitchenHelper3 {
        public static double calculateIngredientQuantity(double servings, double originalQuantity)
        {
            // Your code here!
            // Calculate the adjusted ingredient quantity


            double adjustedQuantity = servings * originalQuantity;



            // replace 0.0 with the adjusted quantity
            return adjustedQuantity;
        }



        public static int spiceUpDish (int spiceLevel)
        {
            // Your code here!
            // Print a message suggesting spices based on the spiceLevel
            switch (spiceLevel) {
                case 1:
                    System.out.println("Try a poblano!");
                    break;
                case 2:
                    System.out.println("How about a jalapeno?");
                    break;
                case 3:
                    System.out.println("Cooking up some serrano!");
                    break;
                case 4:
                    System.out.println("Now we're getting hot for cayenne!!");
                    break;
                case 5:
                    System.out.println("Breathe fire baby, habanero!!!");
                    break;
                default:
                    System.out.println("Invalid entry only 1 - 5 is acceptable.");
            }

            return spiceLevel;


        }



        public static void greetGuest(String name, String timeOfDay) {

            // Your code here!
            // Print a personalized greeting based on arguments
            // For example, Hi Bob, Good Afternoon!
            if (timeOfDay.equals("Morning")) {
                System.out.println("Hello, " + name + ". Good " + timeOfDay);
            } else if (timeOfDay.equals("Afternoon")) {
                System.out.println("Hi, " + name + ", what an " + timeOfDay + "!");
            } else {
                System.out.println(name + " it's " + timeOfDay + "... go to bed already!");
            }
        }




        public static void main(String[] args) {
            // calling the methods with different arguments

            // Replace these arguments with your own values
            double newQuantity = calculateIngredientQuantity(3, 5.5);
            spiceUpDish(2);
            greetGuest("guest", "time");
        }
    }

