package decorator;

/**
 * 具体的装饰类(ConcreteComponent)
 * 在具体装饰类中可以调用到抽象装饰类的方法，同时可以定义新的业务方法
 */
public class FaceTimeDecorator extends PhoneDecorator {
    public FaceTimeDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();//调用原有的业务方法
        callWithFaceTime();//调用新增的业务方法
    }


    //新增的业务方法,
    public void callWithFaceTime(){
        System.out.println("this call is powered by FaceTime...");
    }
}
