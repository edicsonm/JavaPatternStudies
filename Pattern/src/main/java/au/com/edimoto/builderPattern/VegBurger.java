package au.com.edimoto.builderPattern;

/**
 * Created by torree on 25/11/2016.
 */
public class VegBurger extends Burger{
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
