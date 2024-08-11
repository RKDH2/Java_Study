package section_7;

import java.util.Arrays;
import java.util.List;

public class Unlimited {
    public static void listItem(List<?> list) {
        // 최상위 타입인 오브젝트(Object) 타입
        for (Object listItem : list) {
            System.out.println(listItem);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<String> strings = Arrays.asList("케이크", "쿠키", "머핀");

        listItem(integers);
        listItem(strings);
    }
}
