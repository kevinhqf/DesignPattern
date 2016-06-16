package bridge;

/**
 * 扩充抽象类(RefinedAbstraction)
 */
public class LandRoverCar extends AbstractCar{
    //实现抽象类的接口
    @Override
    void run() {
        //调用实现类接口的业务方法
        gear.gear();
        System.out.println("LandRoverCar is running........");
    }
}
