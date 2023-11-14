public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
    public static int factorial(int i){

        int k = 1;
        for(int j = k; j <= i; j++){
            k *= j;
        }
        return k;
    }
}
