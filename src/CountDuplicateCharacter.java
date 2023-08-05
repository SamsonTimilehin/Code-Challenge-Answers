import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacter {

    public static void main(String[] args) {

        Map<Character, Integer> answer = countDuplicateCharacters("\uD83D\uDC95\uD83D\uDC4Dttr");
        System.out.println(answer);

        //Code Point ----- Surrogate Pair ----💕"\uD83D\uDC95"......👍"\uD83D\uDC4D"
        String str = String.valueOf(Character.toChars(128149));
        System.out.println(str);

        System.out.println(countDuplicateCharacterUsingCodePoint("\uD83D\uDC95\uD83D\uDC4D\uD83D\uDC95"));
    }
    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
         for(char ch: str.toCharArray()) {
             result.compute(ch, (k,v)-> v == null ? 1 : v+1);
         }
        return result;
    }

    public static Map<String, Integer> countDuplicateCharacterUsingCodePoint(String str){

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp) == 2) { // 2 means a surrogate pair
                i++;
            }
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
