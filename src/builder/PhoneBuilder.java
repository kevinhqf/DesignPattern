package builder;

/**
 * 抽象的建造者类
 * 用于指定创建复杂产品的各个部件接口
 */
public abstract class PhoneBuilder {
    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void createNewPhone() {
        phone = new Phone();
    }
    //用于创建手机对象的接口
    public abstract void buildCPU();
    public abstract void buildOS();
    public abstract void buildBrand();
}
