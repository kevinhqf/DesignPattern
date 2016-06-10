package factory.simplefactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Phone android = PhoneFactory.createPhone("android");
        Phone apple =  PhoneFactory.createPhone("apple");
        android.call();
        apple.call();
    }
}
