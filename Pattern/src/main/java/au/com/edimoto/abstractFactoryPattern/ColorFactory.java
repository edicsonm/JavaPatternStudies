package au.com.edimoto.abstractFactoryPattern;

/**
 * Created by torree on 25/11/2016.
 */
public class ColorFactory extends  AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
