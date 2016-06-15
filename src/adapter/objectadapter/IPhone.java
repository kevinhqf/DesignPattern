package adapter.objectadapter;

/**
 * 苹果手机设备
 */
public class IPhone {
    private Lightning lightning;
    public IPhone(){}
    public IPhone(Lightning lightning) {
        this.lightning = lightning;
    }
    public void charge(){
        System.out.println("IPhone Charge start!");
        lightning.chargeWithLightning();
        System.out.println("IPhone Charge finish!");
    }

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }
}
