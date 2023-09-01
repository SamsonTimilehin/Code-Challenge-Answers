public class ReverseLettersAndWords {

    public static void main(String[] args) {

        String words = "Time of the day";
        System.out.println(reverseLettersAndWords(words));
    }

    public static String  reverseLettersAndWords(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
