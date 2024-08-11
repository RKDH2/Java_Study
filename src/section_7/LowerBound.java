package section_7;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void numbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);

        // 최상위 타입인 오브젝트(Object) 타입
        for (Object number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        numbers(integers);
        numbers(objects);
    }
}
