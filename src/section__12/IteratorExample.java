package section__12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // 리스트 생성 및 요소 추가
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Iterator 생성
        Iterator<Integer> iterator = list.iterator();
        int count = 0;

        // 요소 순회
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.print(number + " ");

            // 조건에 맞을경우 요소 제거
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("최종 결과" + list);
    }
}
