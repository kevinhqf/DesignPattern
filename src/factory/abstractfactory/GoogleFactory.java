package factory.abstractfactory;

/**
 * 具体工厂类
 */
public class GoogleFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new ChromeBook();
    }
}
