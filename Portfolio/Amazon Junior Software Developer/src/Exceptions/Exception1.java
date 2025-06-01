package Exceptions;

class Item{
    String name;
}

public class Exception1 {

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Name: " + item.name.toUpperCase());
    }
}
