package bridge;

/**
 * 具体实现类,手动档
 */
public class Manual extends Transmission {
    @Override
    void gear() {
        System.out.println("Manual transmission.");
    }
}
