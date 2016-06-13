package factory.abstractfactory;

/**
 * 具体工厂类,创建一族产品,这里是手机和笔记本电脑
 */
public class AppleFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
