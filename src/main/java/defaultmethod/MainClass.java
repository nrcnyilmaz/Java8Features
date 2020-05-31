package defaultmethod;

/**
 * @author Nurcan Yilmaz
 */
public class MainClass {

    public static void main(String[] args) {
        Television television = new Television();
        television.bluetoothSetting();
        television.defaultMethod();

        Computer computer = new Computer();
        computer.bluetoothSetting();
        computer.wifiSetting();
        computer.defaultMethod();
    }
}
