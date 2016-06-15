package adapter.objectadapter;

/**
 * 具体实现类: 苹果充电器
 */
public class AppleCharger implements Lightning {
    @Override
    public void chargeWithLightning() {
        System.out.println("charging with lightning......");
    }
}
