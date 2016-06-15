package adapter.objectadapter;

/**
 * 充电适配器,使用安卓充电器给苹果手机充电
 * 实现目标类的接口(LightningInterface),然后使用组合的方式,在该适配器中定义microUsb;
 * 然后在重写的 chargeWithLightning() 方法中,采用microUsb的方法来实现具体细节;
 */
public class ChargerAdapter implements Lightning {
    private MicroUSB microUSB;

    public ChargerAdapter() {
    }

    public ChargerAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void chargeWithLightning() {
        microUSB.chargeWithMicroUSB();
    }

    public void setMicroUSB(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }
}
