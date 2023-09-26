package Lambda;

public class GenericMain {

    public static void main(String[] args) {

        GenericInterface<String> genericInterface = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Reverse guys to " + genericInterface.func("guys"));
    }
}
