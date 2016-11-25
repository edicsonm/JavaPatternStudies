package au.com.edimoto.prototypePattern;

/**
 * Created by torree on 25/11/2016.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
