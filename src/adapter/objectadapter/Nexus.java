package adapter.objectadapter;

/**
 * android 手机设备
 */
public class Nexus {
    private MicroUSB microUSB;
    public Nexus(){}
    public Nexus(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    public void charge(){
        System.out.println("Nexus Charge start!");
        microUSB.chargeWithMicroUSB();
        System.out.println("Nexus Charge finish!");
    }

    public void setMicroUSB(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }
}
