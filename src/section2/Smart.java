package section2;

public class Smart {
    public String name;
    public int storage;
    // year 변수 선언
    public int year;

    // 생성자
    Smart(String name, int storage, int year) {
        this.name = name;
        this.storage = storage;
        // year 변수 값 할당
        this.year = year;
    }

    // 생성자 추가
    Smart(int year){
        this.year = year;
    };

    // 메소드
    void info() {
        System.out.println("스마트 폰의 기종은 " + name + "이고, 저장공간은 " + storage + "GB 입니다.");
    }

    // 오버라이딩할 메서드 구현
    void newInfo() {
        System.out.println(year + "년도에 출시하는 스마트폰의 이름은 무엇인가요?");
    }
}