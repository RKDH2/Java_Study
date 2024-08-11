package section_7;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void numbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        numbers(integers);
        numbers(doubles);
    }
}
