package facade;

/**
 *子系统2
 */
public class Cup {
    //将具体的Coffee倒入杯子里
    public void fillWithCoffee(Coffee coffee){
        coffee.makeCoffee();
        System.out.println("the coffee is ready!");
    }
}
