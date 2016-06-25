package observer;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args)
    {

        IPhone iPhone=new IPhone();
        Observer consumer = new Consumer();
        iPhone.attach(consumer);
        iPhone.preferential();

    }
}
