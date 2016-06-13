package factory.abstractfactory;

/**
 * 抽象工厂,声明多个工厂方法,用于创建不同类型的产品
 */
public interface Factory {
     Phone createPhone();
     Laptop createLaptop();
}
