package decorator;

/**
 * 抽象装饰类(Decorator)
 * 在 PhoneDecorator 中并未真正实现 call() 方法,而只是调用原有 phone 对象的 call() 方法
 * 它没有真正实施装饰,而是提供一个统一的接口,将具体装饰过程交给子类完成.
 */
public class PhoneDecorator implements Phone {
    //持有一个抽象构件实例的引用
    private Phone phone;

    //注入抽象构件类型的对象
    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        //调用原有的业务方法
        this.phone.call();
    }

    @Override
    public void message() {
        this.phone.message();
    }

}
