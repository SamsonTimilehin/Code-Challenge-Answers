import java.util.stream.IntStream;

public class IntStreamInterface {

    public static void main(String[] args) {

        displayUsingIntStream();
    }

    public static void displayUsingIntStream(){

        IntStream.of(2,4,6,8,9).mapToObj(num -> num / 2).forEach(System.out::println);
    }
}
