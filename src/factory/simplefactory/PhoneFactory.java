package factory.simplefactory;

/**
 * 手机工厂类
 */
public class PhoneFactory {

    /**
     * 根据参数返回不同的实例对象
     * @param type 手机类型
     * @return 具体的手机对象
     */
    public static Phone createPhone(String type) {

        switch (type) {
            case "android":
                return new AndroidPhone();
            case "apple":
                return new ApplePhone();
        }
        return null;
    }
}
