package factory.simplefactory;

/**
 * 具体的产品类 Apple Phone
 */
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Apple Phone calling......");
    }
}
