package decorator;

/**
 * 具体的构件(ConcreteComponent)
 */
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("apple phone is calling...");
    }

    @Override
    public void message() {
        System.out.println("apple phone is sending message...");
    }
}
