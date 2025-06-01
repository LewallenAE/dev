package Introduction_To_Software_Development;

public class KitchenHelper1 {

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

    public static void main(String[] args) {
        // calling the method
        // Replace this argument with your own value

        spiceUpDish(3);
    }
}
