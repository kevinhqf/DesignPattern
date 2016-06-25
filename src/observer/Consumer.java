package observer;

/**
 * 具体观察者类
 */
public class Consumer  implements Observer{
    private String state;
    @Override
    public void update(String state) {
        //更新状态
        this.state=state;
        System.out.println(state);
    }
}
