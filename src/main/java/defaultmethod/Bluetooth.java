package defaultmethod;

/**
 * @author Nurcan Yilmaz
 */
public interface Bluetooth {

    void bluetoothSetting();

    default void defaultMethod(){
        System.out.println("Default method in bluetooth");
    }
}
