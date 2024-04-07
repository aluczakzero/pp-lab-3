import geometry.Rectangle;


public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(2, 2);

       System.out.println("Pole prostokąta: " + rectangle.calculateArea());
       System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}