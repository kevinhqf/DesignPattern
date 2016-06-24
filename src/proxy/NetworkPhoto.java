package proxy;

/**
 * 真实角色
 */
public class NetworkPhoto implements Photo {
    @Override
    public void getPhoto() {
        System.out.println("Network Photo is loading");
    }
}
