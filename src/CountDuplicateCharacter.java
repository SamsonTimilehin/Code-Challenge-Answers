import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacter {

    public static void main(String[] args) {

        Map<Character, Integer> answer = countDuplicateCharacters("witty$#@$");
        System.out.println(answer);

    }
    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
         for(char ch: str.toCharArray()) {
             result.compute(ch, (k,v)-> v == null ? 1 : v+1);
         }
        return result;
    }

}
