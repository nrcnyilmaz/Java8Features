package functionalinterface;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author Nurcan Yilmaz
 */
public class SupplierExample {

    // Supplier Functional Interface is not take parameter and return type of T
    public static void main(String[] args) {

        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now(ZoneId.systemDefault());
        System.out.println("CURRENT TIME = " + dateTimeSupplier.get());

        IntSupplier maxSupplier = () -> Integer.MAX_VALUE;
        System.out.println("Integer MAX VALUE = " + maxSupplier.getAsInt());
    }
}
