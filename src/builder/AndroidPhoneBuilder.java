package builder;

/**
 * 具体的产品对象,实现产品各个部件的装配
 *
 */
public class AndroidPhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("Qualcomm");
        //System.out.println("the phone is using Qualcomm's CPU.");
    }

    @Override
    public void buildOS() {
        phone.setOs("Android");
        //System.out.println("the phone is using Android OS.");
    }

    @Override
    public void buildBrand() {
        phone.setBrand("Google");
       // System.out.println("the phone's brand is Google.");
    }
}
