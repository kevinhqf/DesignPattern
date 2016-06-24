package proxy;

/**
 * 代理角色:代理对象与真实对象实现相同的接口,所以它能够在任何时刻都能够代理真实对象
 * 代理角色内部包含有对真实对象的引用,所以可以操作真实对象,同时也可以附加其他的操作
 */
public class HttpProxy implements Photo {
    private NetworkPhoto np;//持有真实对象的引用

    public HttpProxy() {
        this.np = new NetworkPhoto();
    }

    /**
     *附加操作
     */
    private void beforeLoad(){
        System.out.println("doing jobs before load.");
    }
    @Override
    public void getPhoto() {
        beforeLoad();
        np.getPhoto();
        afterLoad();
    }
    /**
     *附加操作
     */
    private void afterLoad(){
        System.out.println("doing jobs after load.");
    }
}
