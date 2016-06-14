package builder;

/**
 * 具体的产品对象,实现产品各个部件的装配
 *
 */
public class ApplePhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("A10");
    }
    @Override
    public void buildOS() {
        phone.setOs("IOS");
    }
    @Override
    public void buildBrand() {
        phone.setBrand("Apple");
    }
}
