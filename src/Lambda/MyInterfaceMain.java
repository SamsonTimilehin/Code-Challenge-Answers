package Lambda;

import java.time.LocalDate;
import java.util.UUID;

public class MyInterfaceMain {

    public static void main(String[] args) {

        MyInterface ref;
        ref = (n) -> 5000 / n;
        System.out.println("Number value " + ref.getNumber(2));

        String name = UUID.randomUUID().toString();
        System.out.println(name);
        UUID uuid = UUID.fromString(name);
        System.out.println(uuid);

        LocalDate localDate = LocalDate.now();
        LocalDate oneMoreMonth = localDate.plusMonths(1);
        System.out.println(localDate.toString());
        System.out.println(oneMoreMonth);
    }
}
