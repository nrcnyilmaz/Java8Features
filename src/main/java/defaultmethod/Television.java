package defaultmethod;

/**
 * @author Nurcan Yilmaz
 */
public class Television implements Bluetooth  {

    @Override
    public void bluetoothSetting() {
        System.out.println("Bluetooth settings are done.");
    }

}
