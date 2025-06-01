package Polymorphism;

public class Espresso extends Coffee {

    private int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

   public void printEspressoDetails() {
    System.out.printf("""
        You ordered %d shot%s of %s with a %s roast.
        The price per serving is $%.2f.
        The total price is $%.2f.
        """,
        numberOfShots,
        numberOfShots == 1 ? "" : "s",
        name,
        roast,
        price,
        numberOfShots * price);           
   }

}
