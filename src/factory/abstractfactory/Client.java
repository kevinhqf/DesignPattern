package factory.abstractfactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Phone android = new GoogleFactory().createPhone();
        Laptop macbook = new AppleFactory().createLaptop();
        android.call();
        macbook.work();
    }
}
