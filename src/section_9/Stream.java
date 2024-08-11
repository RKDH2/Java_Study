package section_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> fruitBox = Arrays.asList("apple", "banana", "lemon", "orange", "strawberry");
        List<String> result_1 = new ArrayList<>();

        // 길이가 5보다 큰 과일의 이름을 필터링하고 대문자로 변환
        for (String fruit : fruitBox) {
            if (fruit.length() > 5) {
                result_1.add(fruit.toUpperCase());
            }
        }

        // 스트림을 사용한 방식
        List<String> result_2 = fruitBox.stream()
                .filter(fruit -> fruit.length() > 5) // 중간 연산 (지연 연산)
                .map(String::toUpperCase) // 중간 연산 (지연 연산)
                .toList(); // 최종 연산 (중간 연산 실행)

        // 병렬 스트림으로 변환
        List<String> result_3 = fruitBox.parallelStream()
                    .filter(fruit -> fruit.length() > 5) // 중간 연산 (지연 연산)
                    .map(String::toUpperCase) // 대문자로 변환
                    .toList(); // 리스트 반환

        // 병렬 스트림으로 변환
        List<String> result_4 = fruitBox.stream()
                    .parallel()
                    .filter(fruit -> fruit.length() > 5) // 필터링
                    .map(String::toUpperCase) // 대문자로 변환
                    .toList(); // 리스트 반환

        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
    }
}
