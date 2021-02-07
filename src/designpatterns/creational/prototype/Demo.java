package designpatterns.creational.prototype;

import designpatterns.creational.prototype.example.shapes.Shape;
import designpatterns.creational.prototype.example.shapes.Circle;
import designpatterns.creational.prototype.example.shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * You could implement a centralized prototype registry (or factory), 
 * which would contain a set of pre-defined prototype objects. 
 * This way you could retrieve new objects from the factory by passing its name 
 * or other parameters. The factory would search for an appropriate prototype, 
 * clone it and return you a copy.
 */

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);
        
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);
        
        cloneAndCompare(shapes, shapesCopy);
    }
    
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": And they are not identical (boo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
