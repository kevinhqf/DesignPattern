package factory.factorymethod;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Phone android = new AndroidFactory().createPhone();
        android.call();
    }

}
