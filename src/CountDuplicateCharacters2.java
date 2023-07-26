import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters2 {

    public static void main(String[] args) {

        System.out.println(countDuplicateCharacters2("Exercise"));
    }

    public static Map<Character, Long> countDuplicateCharacters2(String str){

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
