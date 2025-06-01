package Introduction_To_Software_Development;

public class SportsCar extends CarSubclass{

    int turboBoost;


    public SportsCar(int numberOfDoors, String fuelType, String make, String model, String color) {
        super(numberOfDoors, fuelType, make, model, color);
        this.turboBoost = 0;
        System.out.printf("""
            Sports car created:
            Make: %s
            Model: %s
            Color: %s
            Turbo boost: %d
            """.formatted(make, model, color, turboBoost));
    }

    public void activateTurboBoost(){
        super.accelerate();
        this.turboBoost += 50;
        super.speed += turboBoost;
        System.out.println("Turbo boost activated! Speed increased by 50.");
    }

}
