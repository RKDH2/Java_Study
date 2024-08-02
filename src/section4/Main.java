package section4;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스화할 수 없음
        // Cake cake = new Cake(); // 오류 발생

        // 상속받은 클래스를 통해 인스턴스화
        Make_1 make_1 = new Make_1(2500);
        Make_2 make_2 = new Make_2(1500);

        // 추상 메서드 호출
        make_1.topping();
        make_2.topping();

        // 인스턴트 필드를 사용하는 메서드 호출
        make_1.printPrice();
        make_2.printPrice();
    }
}
