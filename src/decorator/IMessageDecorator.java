package decorator;

/**
 * 具体的装饰类(ConcreteComponent)
 * 在具体装饰类中可以调用到抽象装饰类的方法，同时可以定义新的业务方法
 */
public class IMessageDecorator extends PhoneDecorator {
    public IMessageDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void message() {
        super.message();//调用原有的业务方法
        messageWithIMessage();//调用新增的业务方法
    }
    //新增的业务方法,
    public void messageWithIMessage(){
        System.out.println("this message is powered by IMessage...");
    }
}
