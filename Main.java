import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;


public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];

        circles[0] = new Circle(new Point(2, 4), 5);
        circles[1] = new ColoredCircle(new Point(1, 1), 2, "red");

        
        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole koła: " + area);

            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}