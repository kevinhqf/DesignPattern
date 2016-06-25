package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 */
public abstract class PhoneSubject {
    // 观察者的列表
    protected List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     */
    public void attach(Observer observer)
    {
        list.add(observer);
        System.out.println("Observer attached");
    }

    /**
     * 删除观察者模式
     */
    public void detach(Observer observer)
    {
        list.remove(observer);
        System.out.println("Observer detached");
    }
    public abstract void notifyObservers();
}
