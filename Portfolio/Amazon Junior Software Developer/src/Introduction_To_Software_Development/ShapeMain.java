package Introduction_To_Software_Development;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4.5, 6.2);
        Rectangle rectangle2 = new Rectangle(5.5, 3.3);
        Circle circle1 = new Circle(4.6);
        Circle circle2 = new Circle(7.9);

        double areaOfRectangle1 = ShapeMetricCalculator.calculateRectangleArea(rectangle1);
        double areaOfRectangle2 = ShapeMetricCalculator.calculateRectangleArea(rectangle2);
        double areaOfCircle1 = ShapeMetricCalculator.calculateCircleArea(circle1);
        double areaOfCircle2 = ShapeMetricCalculator.calculateCircleArea(circle2);

        System.out.println("""
                Area of rectangle 1: %.2f
                Area of rectangle 2: %.2f
                Area of circle 1: %.2f
                Area of circle 2: %.2f
                """.formatted(areaOfRectangle1,areaOfRectangle2, areaOfCircle1, areaOfCircle2));

    }
}

