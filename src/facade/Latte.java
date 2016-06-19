package facade;

/**
 * 拿铁咖啡
 */
public class Latte implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("making a Latte Coffee...");
    }
}
