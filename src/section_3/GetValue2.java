package section_3;

enum Fruit {
    // 문자열 값을 할당
    Apple("빨강"),
    Orange("주황"),
    Banana("노랑");

    // 열거형 상수에 값을 저장하는 변수
    private final String value;

    // 생성자
    Fruit(String value) {
        this.value = value;
    }

    // 원시값을 반환하는 메서드
    public String getValue() {
        return value;
    }
}

public class GetValue2 {
    public static void main(String[] args) {
        // fruit 변수에 Fruit.Orange 할당
        Fruit fruit = Fruit.Orange;

        // 출력
        System.out.println("과일 " + fruit);
        System.out.println("원시값 : " + fruit.getValue());
    }
}
