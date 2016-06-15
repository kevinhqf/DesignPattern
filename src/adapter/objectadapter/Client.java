package adapter.objectadapter;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        ChargerAdapter adapter=new ChargerAdapter(new AndroidCharger());
        IPhone iPhoe=new IPhone();
        iPhoe.setLightning(adapter);
        iPhoe.charge();
    }
}
