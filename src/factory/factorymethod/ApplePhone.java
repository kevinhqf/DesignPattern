package factory.factorymethod;

/**
 * 具体产品类 Apple Phone
 */
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Apple Phone calling........");
    }
}
