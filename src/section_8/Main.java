package section_8;

public class Main {
    public static void main(String[] args) {
        // 익명 클래스를 사용해 add 인터페이스 구현
        Add addition = new Add() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }

            @Override
            public int add_2(int x, int y) {
                return x + y + 2;
            }
        };

        // 람다식으로 표현
        Sub subtraction = (x, y) -> x - y;

        // 함수형 인터페이스를 람다식으로 구현
        Mul multiplication = (x, y) -> x * y;

        int result_add = addition.add(2,7);
        int result_add_2 = addition.add_2(2,7);

        int result_sub = subtraction.sub(9, 3);

        int result_mul = multiplication.mul(3, 5);

        System.out.println(result_add); // 출력 : 9
        System.out.println(result_add_2); // 출력 : 11
        System.out.println(result_sub); // 출력 : 6
        System.out.println(result_mul); // 출력 : 15
    }
}
