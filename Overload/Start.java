import it.develhope.Overload.*;

public class Start {
    public static void main(String... args) {
        System.out.println("---- SHAPES IN GEOMETRY ----");

        Shape shape = new Shape ();
        Shape Circle = new Shape(0.5);
        Shape Square = new Shape(4,15.9,8);
        Shape Rectangle = new Shape( 4, 16,  4.9, 8.7);
        Shape Triangle = new Shape (3,4.4, 1.2, 1.2);

        System.out.println("----------------------------");
        System.out.println("THE DETAILS: ");


        System.out.println (shape.getShapeDetails());
        System.out.println (Circle.getShapeDetails());
        System.out.println(Square.getShapeDetails());
        System.out.println(Rectangle.getShapeDetails());
        System.out.println(Triangle.getShapeDetails());
        System.out.println("----------------------------");
    }
}