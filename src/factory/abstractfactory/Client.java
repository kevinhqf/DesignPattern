package factory.abstractfactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Factory factory=new GoogleFactory();
        Phone android = factory.createPhone();
        Laptop chromebook = factory.createLaptop();
        android.call();
        chromebook.work();
    }
}
