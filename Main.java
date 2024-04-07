import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {

        Point test_point = new Point(0, 0);
        
        // Tworzenie obiektu klasy ColoredCircle i inicjowanie wartościami
        ColoredCircle coloredCircle = new ColoredCircle(test_point, 5, "blue");
        
        // Wyświetlanie właściwości koła
        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek kolorowego koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień kolorowego koła: " + coloredCircle.getRadius());
        System.out.println("Kolor kolorowego koła: " + coloredCircle.getColor());
        System.out.println("Obwód kolorowego koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole kolorowego powierzchni koła: " + coloredCircle.getArea());
    }
}