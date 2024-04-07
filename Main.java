import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point test_point = new Point(1.0, 2.0);
        
        Circle circle = new Circle(test_point, 5);
        
        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}