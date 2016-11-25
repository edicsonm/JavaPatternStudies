package au.com.edimoto.prototypePattern;

/**
 * Created by torree on 25/11/2016.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
