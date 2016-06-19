package facade;

/**
 * 卡布奇诺咖啡
 */
public class Cappuccino implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("making a Cappuccino Coffee...");
    }
}
