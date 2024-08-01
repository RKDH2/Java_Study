package section3;

enum Day {
    // 일주일의 모든 요일 나열
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class WeekDay {
    public static void main(String[] args) {
        // day 변수에 Day.FRI 할당
        Day day = Day.FRI;

        // 스위치문으로 day값에 따른 메시지를 출력
        switch (day) {
            case MON:
                System.out.println("주말은 끝! 월요일 시작");
                break;
            case TUE:
            case WED:
            case THU:
                System.out.println("열심히 평일을 보내는 중...");
                break;
            case FRI:
                System.out.println("불타는 금요일!");
            case SAT:
            case SUN:
                System.out.println("주말이 시작됐다!");
                break;
        }
    }
}
