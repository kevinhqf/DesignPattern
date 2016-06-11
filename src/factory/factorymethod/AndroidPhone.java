package factory.factorymethod;

/**
 *具体产品类 Android Phone
 */
public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Android Phone calling......");
    }
}
