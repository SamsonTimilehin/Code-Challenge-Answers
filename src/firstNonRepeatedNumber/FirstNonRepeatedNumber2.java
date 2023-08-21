package firstNonRepeatedNumber;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedNumber2 {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatedCharacter2("7yrr"));
    }

    public static char firstNonRepeatedCharacter2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }
}
