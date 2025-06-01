package Introduction_To_Software_Development;

public class CarSubclass extends Car { // begin CarSubclass class

    int numberOfDoors;
    String fuelType;
    String make;
    String model;
    String color;
    int seatPosition;
    int speed;

    public CarSubclass(int numberOfDoors, String fuelType, String make, String model, String color) { // begin CarSubclass constructor
        super();
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.color = color;
        this.seatPosition = 0;
        this.speed = 0;
        System.out.printf("""
            Car created:
            Make: %s
            Model: %s
            Color: %s
            Number of doors: %d
            Fuel type: %s
            """.formatted(make, model, color, numberOfDoors, fuelType));
    } // end CarSubclass constructor

    public void honk() { // begin honk method
        System.out.println("Beep beep!");
    } // end honk method

    public void openTrunk() { // begin openTrunk method
        System.out.println("The trunk is now open!");
    } // end openTrunk method

    public void closeTrunk() { // begin closeTrunk method
        System.out.println("The trunk is now closed!");
    } // end closeTrunk method

    public void accelerate() { // begin accelerate method
        System.out.println("The car is accelerating!");
        this.speed += 20;
    } // end accelerate method

    public void brake() { // begin brake method
        System.out.println("Now braking!");
        while (this.speed >= 0) {
            if (this.speed > 0) {
                this.speed -= 10;
            } else {
                System.out.println("The car is already stopped!");
                break;
            } // end if loop
        } // end while
    } // end brake method

    public void turn(String direction) { // begin turn method
        System.out.println("The car is turning " + direction + "!");
    } // end turn method

    public int getSpeed() { // begin getSpeed method
        return speed;
    } // end getSpeed method

    public void adjustSeat(int adjustment) {
        this.seatPosition += adjustment;

        if (adjustment > 0) {
            System.out.println("The seat is moving forward!");
        } else if (adjustment < 0) {
            System.out.println("The seat is moving backward!");
        } else {
            System.out.println("The seat is not moving!");
        } // end adjustSeat method
    } // end adjustSeat method



    

}
