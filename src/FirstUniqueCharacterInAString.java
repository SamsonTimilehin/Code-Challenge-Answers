public class FirstUniqueCharacterInAString {


    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("lodeleetcode"));

    }

    public static int firstUniqueCharacter(String s) {
        int[] charArray = new int[256];

        if (s == null || s.isEmpty()) return -1;

        for (int i = 0, l = s.length(); i < l; i++) charArray[s.charAt(i)]++;

        for (int i = 0, l = s.length(); i < l; i++) {
            if (charArray[s.charAt(i)] == 1) return i;
        }

        return -1;
    }
}
