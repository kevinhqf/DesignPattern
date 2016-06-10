package factory.simplefactory;

/**
 * 一个具体的产品类 Android Phone
 */
public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Android Phone calling.....");
    }
}
