package facade;

/**
 * 摩卡咖啡
 */
public class Mocha implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("making a Mocha Coffee...");
    }
}
