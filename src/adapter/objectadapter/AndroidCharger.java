package adapter.objectadapter;

/**
 * 具体的实现类: 安卓的充电器
 */
public class AndroidCharger implements MicroUSB {
    @Override
    public void chargeWithMicroUSB() {
        System.out.println("charging with microUSB....");
    }
}
