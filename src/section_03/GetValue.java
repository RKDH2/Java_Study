package section_03;

enum Weekday {
    // 일주일의 모든 요일에 값을 할당
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);

    // 열거형 상수에 값을 저장하는 변수
    private final int value;

    // 생성자
    Weekday(int value) {
        this.value = value;
    }

    // 원시값을 반환하는 메서드
    public int getValue() {
        return value;
    }
}

public class GetValue {
    public static void main(String[] args) {
        // toDay 변수에 Weekday.FRI 할당
        Weekday toDay = Weekday.FRI;

        // 출력
        System.out.println("오늘은 " + toDay + "입니다.");
        // 메서드 호출
        System.out.println("원시값 : " + toDay.getValue());
    }
}
