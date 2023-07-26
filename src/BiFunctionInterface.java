import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterface {

    public static void main(String[] args) {

//        Interface BiFunction<T,U,R>
//        T - the type of the first argument to the function
//        U - the type of the second argument to the function
//        R - the type of the result of the function

        System.out.println(addingWithBiFunction());
        System.out.println(multiplyAndThenAndWithBiFunction());
    }

    public static Integer addingWithBiFunction(){

//        R apply(T t, U u)

        BiFunction<Integer,Integer,Integer> add = (x, y) -> x + y;
        return add.apply(45,6);
    }

    public static Integer multiplyAndThenAndWithBiFunction(){

//        default <V> BiFunction<T,U,V> andThen(Function<? super R,? extends V> after)
//        V: It represents the type of the output of the after() function, and of the composed function.

        BiFunction<Integer,Integer,Integer> multiply = (x,y) -> x * y;

        Function<Integer,Integer> add = (z) -> z + 10;

        return multiply.andThen(add).apply(5,6);
    }
}
