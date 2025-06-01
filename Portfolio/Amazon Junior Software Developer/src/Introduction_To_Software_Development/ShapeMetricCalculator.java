package Introduction_To_Software_Development;

public class ShapeMetricCalculator {

    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public static double calculateCircleArea(Circle circle) {
        return circle.radius * circle.radius * Math.PI;
    }
}
