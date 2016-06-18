package decorator;

/**
 * 测试类
 * 在具体装饰类中可以调用到抽象装饰类的方法，同时可以定义新的业务方法
 */
public class Client {

    public static void main(String[] args) {
        Phone phone=new ApplePhone();
        phone.call();
        phone.message();
        System.out.println("--------------------------------------");
        //phone = new FaceTimeDecorator(phone);//第一次装饰,对call()进行装饰
        //phone = new IMessageDecorator(phone);//第二次装饰,对message()进行装饰
        //也可以使用如下方法进行多次装饰
        phone = new IMessageDecorator(new FaceTimeDecorator(phone));
        phone.call();
        phone.message();

    }
}
