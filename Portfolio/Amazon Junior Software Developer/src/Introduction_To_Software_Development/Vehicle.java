package Introduction_To_Software_Development;


public class Vehicle { // begin Vehicle class.

    String make;
    String model;
    String color;
    int year;
    int speed;


    public Vehicle(String make, String model, String color, int year, int speed) { // begin Vehicle constructor
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
        // System.out.println("Vehicle created: " + make + " " + model + " " + color + " " + year);
        System.out.printf("""
            Vehicle created:
            Make: %s
            Model: %s
            Color: %s
            Year: %d
            """.formatted(make, model, color, year));
    } // end Vehicle constructor

    public void accelerate() { // begin accelerate method
        System.out.println("The vehicle is accelerating!");
        this.speed += 15;
    } // end accelerate method

    public void brake() { // begin brake method
        System.out.println("Now braking!");
        while (this.speed >= 0) {
        if (this.speed > 0) {
            this.speed -= 5;
        } else {
            System.out.println("The vehicle is already stopped!");
            break;
        }  // end if loop
    } // end while
    } // end brake method

    public void turn(String direction) {
        System.out.println("The vehicle is turning " + direction + "!");
    } // end turn method

    public int getSpeed() {
        return speed;
    }

} // end Vehicle class

