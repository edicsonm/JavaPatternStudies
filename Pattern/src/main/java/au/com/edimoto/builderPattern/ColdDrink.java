package au.com.edimoto.builderPattern;

/**
 * Created by torree on 25/11/2016.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
