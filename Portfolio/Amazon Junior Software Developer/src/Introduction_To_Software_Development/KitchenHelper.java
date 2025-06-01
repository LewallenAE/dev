package Introduction_To_Software_Development;

public class KitchenHelper {

    // Write the method signature here
    public static double calculateIngredientQuantity(double servings, double originalQuantity)
    {
        // Your code here!
        // Calculate the adjusted ingredient quantity


        double adjustedQuantity = servings * originalQuantity;



        // replace 0.0 with the adjusted quantity
        return adjustedQuantity;
    }

    public static void main(String[] args) {
        // Calling the method
        // Replace the arguments with your own values

        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

    }
}
