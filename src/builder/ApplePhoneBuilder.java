package builder;

/**
 * 具体的产品对象,实现产品各个部件的装配
 *
 */
public class ApplePhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("A10");
        //System.out.println("the phone is using A10 CPU.");
    }

    @Override
    public void buildOS() {
        phone.setOs("IOS");
        //System.out.println("the phone is using IOS.");
    }

    @Override
    public void buildBrand() {
        phone.setBrand("Apple");
       // System.out.println("the phone's brand is Apple.");
    }
}
