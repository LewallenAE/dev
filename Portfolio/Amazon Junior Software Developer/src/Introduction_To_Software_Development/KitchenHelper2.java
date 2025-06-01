package Introduction_To_Software_Development;

public class KitchenHelper2 {

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
        // calling the method
        // Replace these arguments with your own values

        greetGuest("Harry", "Afternoon");
    }
}
