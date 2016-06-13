package factory.abstractfactory;

/**
 * 具体产品 ChromeBook
 */
public class ChromeBook implements Laptop {
    @Override
    public void work() {
        System.out.println("The chromebook is working....");
    }
}
