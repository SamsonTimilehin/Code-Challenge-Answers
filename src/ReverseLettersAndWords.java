import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseLettersAndWords {

    public static void main(String[] args) {

        String words = "GeTimeaA";
        System.out.println(reverseLettersAndWords(words));
        char [] chars = {'r','e','d'};
        System.out.println(reverseChar(chars));
        System.out.println(Arrays.toString(words.getBytes()));
        char num = 97;
        System.out.println(num);
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("encode " + encodedString);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("decode  "+decodedString);
        System.out.println(divide(10,0));
        System.out.println(romanToInt("MCMXCIV"));

        System.out.println("================ Reverse String without any Library ===================");
        System.out.println(reverseString("Hello World"));
        System.out.println(reverseStringLambdasStringBuilder("Hellop"));
        System.out.println(reverseStringStringBuilder("good"));

    }

    public static String  reverseLettersAndWords(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static char[] reverseChar(char[] s){
        return new StringBuilder(Arrays.toString(s)).reverse().toString().toCharArray();
    }

    public static int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.print("Exception.... ");
            return 0;
        } finally {
            System.out.println("Finally block.... ");
        }
    }

    public static int romanToInt(String s) {

        Map<Character,Integer> dataStore = Map.of(
                'V',5,
                'L',50,
                'D',500,
                'M',1000
       );
        Map<Character,Integer> special = Map.of(
                'I',1,
                'X',10,
                'C',100
        );
        int result = 0;
        char next = 0;
        char value;
        for(int i = 0; i < s.length(); i++){
            value = s.charAt(i);
            int after = i + 1;
            if(after < s.length()){
                next = s.charAt(after);
            }
            if(special.containsKey(value) && dataStore.containsKey(next)){
                i = i + 1;
                result = result + (dataStore.get(next) - special.get(value));
            }else {
                if(special.containsKey(value)){
                    result = result + special.get(value);
                }
               if(dataStore.containsKey(value)){
                   result = result + dataStore.get(value);
               }

            }
        }
        return result;
    }

    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }

    private static String reverseStringLambdasStringBuilder(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    private static String reverseStringStringBuilder(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
