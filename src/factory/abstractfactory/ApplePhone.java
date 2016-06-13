package factory.abstractfactory;

/**
 * 具体产品 ApplePhone
 */
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is apple phone calling......");
    }
}
