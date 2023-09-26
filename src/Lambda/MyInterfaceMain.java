package Lambda;

public class MyInterfaceMain {

    public static void main(String[] args) {

        MyInterface ref;
        ref = (n) -> 5000 / n;
        System.out.println("Number value " + ref.getNumber(2));
    }
}
