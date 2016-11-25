package au.com.edimoto.abstractFactoryPattern;

/**
 * Created by torree on 25/11/2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
