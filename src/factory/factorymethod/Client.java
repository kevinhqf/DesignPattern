package factory.factorymethod;

/**
 * Created by kevin on 6/11/16.
 */
public class Client {
    public static void main(String[] args) {
        Phone android = new AndroidFactory().createPhone();
        android.call();
    }

}
