package interfaceresizeable;

import interfaceresizeable.shape.Circle;
import interfaceresizeable.shape.Rectangle;
import interfaceresizeable.shape.Shape;
import interfaceresizeable.shape.Square;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(2);

        System.out.println("Pre-resize: ");
        for (Shape shape: shapes){
            System.out.println(shape);
        }


        System.out.println("After-resize: ");
        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
            System.out.println(shape);
        }







    }
}
