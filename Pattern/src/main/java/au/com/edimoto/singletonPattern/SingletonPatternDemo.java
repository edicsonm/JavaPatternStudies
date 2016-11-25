package au.com.edimoto.singletonPattern;

/**
 * Created by torree on 25/11/2016.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }
}
