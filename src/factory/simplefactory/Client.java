package factory.simplefactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        AndroidPhone android = (AndroidPhone) PhoneFactory.createPhone("android");
        ApplePhone apple = (ApplePhone) PhoneFactory.createPhone("apple");
        android.call();
        apple.call();
    }
}
