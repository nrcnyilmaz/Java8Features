package defaultmethod;

/**
 * @author Nurcan Yilmaz
 */
public interface Wifi {

    void wifiSetting();

    default void defaultMethod(){
        System.out.println("Default method in wifi");
    }
}
