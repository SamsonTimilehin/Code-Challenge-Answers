import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestAndDelete {

    public static void main(String[] args) {
        System.out.println(reverseStringLambdasStringBuilder("Hellop"));
    }
    private static String reverseStringLambdasStringBuilder(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
