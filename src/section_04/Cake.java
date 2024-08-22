package section_04;

// 추상 클래스
abstract class Cake {
    // 인스턴트 필드
    public int price;

    // 생성자
    public Cake(int price) {
        this.price = price;
    }

    // 추상 메서드
    public abstract void topping();

    // 인스턴스 필드를 사용하는 메서드 // 추상 메서드 X
    public void printPrice() {
        System.out.println("케이크의 가격은 " + price + "원 입니다.");
    }
}

// Cake 클래스를 상속받을 Make_1 클래스
class Make_1 extends Cake {
    // 생성자 호출
    public Make_1(int price) {
        super(price);
    }

    // 추상 메서드 구현
    @Override
    public void topping() {
        System.out.println("딸기 추가!");
    }
}

// Cake 클래스를 상속받을 Make_2 클래스
class Make_2 extends Cake {
    // 생성자 호출
    public Make_2(int price) {
        super(price);
    }

    // 추상 메서드 구현
    @Override
    public void topping() {
        System.out.println("바나나 추가!");
    }
}