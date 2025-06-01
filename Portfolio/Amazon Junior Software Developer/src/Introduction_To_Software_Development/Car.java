package Introduction_To_Software_Development;


//import java.util.Scanner; // import the scanner utility class

public class Car extends Vehicle{

    // Constructor

    public Car() { // default constructor
        super("Default Make", "Default Model", "Default Color", 0, 0); // call the super class constructor
    }
    String make; // stores the make of the car
    String model; // stores the model of the car
    String color; // stores the color of the car
    int year; // stores the year of the car
    int speed;


    // Method

    public String getCarDetails() {

        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year + speed;

        /*
        Alternate

        return """
        Make: %s
        Model: %s
        Color: %s
        Year: %d
         """.formatted(make, model, color, year);
         */
    }

    /* public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.make = "Toyota"; // Set instance of car class myFirstCar make to Toyota.
        myFirstCar.model = "Sienna"; // Set instance of car class myFirstCar model to Sienna.
        myFirstCar.color = "White"; // Set instance of car class myFirstCar color to White.
        myFirstCar.year = 2012; // Set instance of car class myFirstCar year to 2012.

        // display the info
        myFirstCar.getCarDetails();

        // Make an array of cars

        // public class[] variable = new public class[number of items you want for array];
        Car[] cars = new Car[5]; // Makes an array that can hold 5 cars.

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < cars.length; index ++) {
            cars[index] = new Car();

            System.out.println("Enter details for your car " + (index +1));

            System.out.println("Make: ");
            cars[index].make = scanner.nextLine();

            System.out.println("Model: ");
            cars[index].model = scanner.nextLine();

            System.out.println("Color: ");
            cars[index].color = scanner.nextLine();

            System.out.println("Year: ");
            cars[index].year = scanner.nextInt();

            scanner.nextLine(); // consume the \n character after nextInt(); (you can't see this it's in the memory).

        }

        System.out.println("Your Car Collection: ");
        for (int index = 0; index < cars.length; index++) {
            String carDetails = cars[index].getCarDetails();
            System.out.println(carDetails);
        }
        scanner.close();
        */
    }
    





