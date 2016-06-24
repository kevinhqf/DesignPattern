package proxy;

/**
 * 测试类
 */
public class Client {
    public static void main(String []args)
    {
        HttpProxy proxy=new HttpProxy();
        proxy.getPhoto();//通过代理对象引用真实对象
    }
}
