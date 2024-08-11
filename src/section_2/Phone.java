package section_2;

// 상위 클래스 Smart에서 상속받는 Phone 클래스
public class Phone extends Smart{
    // 하위 클래스에서 변수 생성
    public int year = 2024;

    Phone(String name, int storage, int year) {
        // super() 메서드를 사용해 상위 클래스에 있는 생성자 호출
        super(name, storage, year);
    }

    // 하위 클래스에서 메서드 정의
    void releaseDate() {
        System.out.println(name + "의 휴대폰 출시일은 " + year + "년 입니다.");
    }

    // 오버라인딩된 메서드
    @Override
    void newInfo(){
        System.out.println(year + "년도에 출시하는 스마트폰의 이름은 " + name + "입니다.");
    }
}