package facade;

/**
 * 外观角色 Starbucks咖啡店
 */
public class Starbucks {
    //子系统1
    private Water water = new Water();
    //子系统2
    private Cup cup = new Cup();
    //子系统3
    private Coffee coffee;


    public void makeLatte() {
        water.boil();
        coffee = new Latte();
        cup.fillWithCoffee(coffee);
    }

    public void makeCappuccino() {
        water.boil();
        coffee = new Cappuccino();
        cup.fillWithCoffee(coffee);
    }

    public void makeMocha() {
        water.boil();
        coffee = new Mocha();
        cup.fillWithCoffee(coffee);
    }
}
