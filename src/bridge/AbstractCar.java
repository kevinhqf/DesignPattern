package bridge;

/**
 * 抽象类(Abstraction)
 */
public abstract class AbstractCar {
    //持有实现类接口的一个实例
    Transmission gear;
    abstract void run();
    public void setGear(Transmission gear) {
        this.gear = gear;
    }
}
