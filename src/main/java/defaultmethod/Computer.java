package defaultmethod;

/**
 * @author Nurcan Yilmaz
 */
public class Computer implements Wifi, Bluetooth {

    @Override
    public void bluetoothSetting() {
        System.out.println("Bluetooth setting are done.");
    }

    @Override
    public void wifiSetting() {
        System.out.println("Wifi setting are done.");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Default method in Computer");

        //you can use interfaces' default methods
//        Wifi.super.defaultMethod();
//        Bluetooth.super.defaultMethod();
    }
}
