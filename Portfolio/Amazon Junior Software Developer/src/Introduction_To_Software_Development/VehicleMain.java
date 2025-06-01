package Introduction_To_Software_Development;

public class VehicleMain {


    public static void main(String[] args) {

        // Car tesla = new Car("Tesla", "Model S", "Red", 4, "Electric");

        // Car gt = new Car("Ford", "GT", "Blue", 2, "Gasoline");

        // tesla.accelerate();
        //System.out.println("Tesla speed: " + tesla.getSpeed());

        // gt.accelerate();
        // System.out.prntln("GT speed: " + gt.getSpeed());

        // gt.activateTurboBoost();
        // System.out.println("GT speed after turbo boost!: " + gt.getSpeed());

        SportsCar ferrari = new SportsCar(2, "Gasoline", "Ferrari", "SF90", "Red");
        ferrari.activateTurboBoost();
        System.out.println("Ferrari " + ferrari.model + " speed after turbo boost! " + ferrari.getSpeed() + " mph." + " Zoooom!" );



    } // end main method

} // end VehicleMain class
