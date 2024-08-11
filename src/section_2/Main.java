package section_2;

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

        // 다형성
        Smart smart2 = new Phone("RKDH22", 512, 2025);
        smart2.info(); // Smart 클래스의 메서드 호출
        smart2.newInfo(); // Phone 클래스에서 오버라이딩된 메서드 호출
        // smart2.releaseDate(); // 오류 발생 Smart 타입의 변수로는 Phone 클래스에서 정의된 메서드를 호출할 수 없음
    }
}