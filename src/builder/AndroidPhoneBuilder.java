package builder;

/**
 * 具体的产品对象,实现产品各个部件的装配
 *
 */
public class AndroidPhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("Qualcomm");
    }
    @Override
    public void buildOS() {
        phone.setOs("Android");
    }
    @Override
    public void buildBrand() {
        phone.setBrand("Google");
    }
}
