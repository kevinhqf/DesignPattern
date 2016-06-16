package bridge;

/**
 * 具体实现类,自动档
 */
public class Auto extends Transmission {
    @Override
    void gear() {
        System.out.println("Auto transmission.");
    }
}
