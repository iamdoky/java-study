package theJava8.one;

import java.util.Arrays;
import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply = (i) -> i * 2;
        Function<Integer, Integer> plusMultiply = plus10.compose(multiply);

        System.out.println(plusMultiply.apply(2));

        String[] names = {"iam", "doky", "wisdom"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}
