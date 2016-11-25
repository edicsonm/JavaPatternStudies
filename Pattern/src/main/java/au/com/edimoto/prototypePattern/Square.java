package au.com.edimoto.prototypePattern;

/**
 * Created by torree on 25/11/2016.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
