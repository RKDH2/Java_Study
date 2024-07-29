package section1;

public class NewYear {
    // 클래스 변수 (static 변수)
    private static int age;

    public static void getAge(int ages) {
        // 나이를 설정
        age = ages;
    }

    // 클래스 메서드 (static 메서드)
    public static int newYear() {
        // 클래스 변수의 값을 증가시킨다.
        age++;
        return age;
    }
}
