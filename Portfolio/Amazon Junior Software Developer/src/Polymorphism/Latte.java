package Polymorphism;

public class Latte extends Coffee{

    private String milkType;
    private String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.printf("""
                        You latte has %s milk and %s flavor. 
                        Your total bill is $%.2f.
                        """, milkType, syrupFlavor, price);
                       
    }
        

        


    }


