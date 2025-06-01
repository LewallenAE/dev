package Introduction_To_Software_Development;

public class ShapeOverloading {

    public void draw(){
        System.out.println("Shape constructor with no argument.");
    }

    public void draw(String color) {
        System.out.println("Shape constructor with a string argument, drawing the shape with a color." + color);
    }

}
