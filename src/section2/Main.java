package section2;

public class Main {
    public static void main(String[] args) {
        // Smart 클래스를 상속받은 Phone 클래스로 새 객체 생성
        Phone smartPhone = new Phone("RKDH2", 256, 2024);
        // 메소드 사용
        smartPhone.info();
        smartPhone.releaseDate();
        // 오버라이딩된 메서드 호출
        smartPhone.newInfo();

        // Smart 클래스로 새 객체 생성
        Smart smart = new Smart(2025);
        // 오버라이딩이 되지 않은 상태인 메서드
        smart.newInfo();
    }
}