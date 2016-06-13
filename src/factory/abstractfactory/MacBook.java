package factory.abstractfactory;

/**
 * 具体产品 MacBook
 */
public class MacBook implements Laptop{
    @Override
    public void work() {
        System.out.println("The macbook is working.......");
    }
}
