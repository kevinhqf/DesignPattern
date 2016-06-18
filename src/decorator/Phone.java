package decorator;

/**
 * 抽象构件(Component) 抽象手机构件
 */
public interface Phone {
    // 手机构件的业务方法,打电话
    void call();
    // 手机构件的业务方法,发信息
    void message();
}
