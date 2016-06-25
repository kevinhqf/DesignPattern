package observer;

/**
 * 具体目标类
 */
public class IPhone extends PhoneSubject {
    private String state;
    /**
     * 商品的优惠活动
     */
    public void preferential(){
        this.state = "the iPhone is on promotion.";
        notifyObservers();
    }
    /**
     * 当商品状态改变时,调用通知方法
     */
    @Override
    public void notifyObservers() {
        for(Observer o:list){
            o.update(state);//调用观察者的更新方法,进行相应的操作
        }
    }
}
