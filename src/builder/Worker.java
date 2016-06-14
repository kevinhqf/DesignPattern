package builder;

/**
 * 指挥者 使用Builder来构建复杂的对象
 */
public class Worker {
    private PhoneBuilder phoneBuilder;
    //设置具有的PhoneBuilder
    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }
    //使用phoneBuilder构建装配Phone
    public void constructPhone() {
        phoneBuilder.createNewPhone();
        phoneBuilder.buildCPU();
        phoneBuilder.buildOS();
        phoneBuilder.buildBrand();
    }
}
