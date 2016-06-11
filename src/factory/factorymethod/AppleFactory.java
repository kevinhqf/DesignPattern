package factory.factorymethod;

/**
 * 具体工厂类 Apple Factory
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
