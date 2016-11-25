package au.com.edimoto.builderPattern;

/**
 * Created by torree on 25/11/2016.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}
