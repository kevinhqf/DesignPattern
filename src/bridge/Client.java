package bridge;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //通过聚合,实现不同品牌不同变速器的组合
        Transmission auto = new Auto();
        AbstractCar bmw = new BMWCar();
        bmw.setGear(auto);
        bmw.run();

        Transmission manual = new Manual();
        AbstractCar benz = new BenZCar();
        benz.setGear(manual);
        benz.run();

    }
}
