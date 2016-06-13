package factory.abstractfactory;

/**
 *具体产品 AndroidPhone
 */
public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is android phone calling.....");
    }
}
