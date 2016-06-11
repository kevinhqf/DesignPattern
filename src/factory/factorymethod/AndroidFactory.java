package factory.factorymethod;

/**
 * 具体工厂类 Android Factory
 */
public class AndroidFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}
