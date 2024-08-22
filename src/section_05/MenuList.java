package section_05;

public interface MenuList {
    // 상수는 public static final을 명시하지 않아도 자동으로 작성된다.
    int MENU_PRICE_TOTAL = 25000;

    // abstract 생략 가능 // 인터페이스에서 선언된 모든 메서드는 추상 메서드로 간주 (둘 다 가능)
    void Steak();
    void Dessert();
    void Drink();
}

class SelectMenu implements MenuList {
    private int TOTAL;
    private int MAX_TOTAL = MENU_PRICE_TOTAL;

    @Override
    public void Steak() {
        TOTAL += 15000;
        System.out.println("스테이크 추가 : " + TOTAL);
    }

    @Override
    public void Dessert() {
        TOTAL += 7000;
        System.out.println("디저트 추가 : " + TOTAL);
    }

    @Override
    public void Drink() {
        TOTAL += 3000;
        System.out.println("음료수 추가 : " + TOTAL);
    }

    public void Total() {
        System.out.println("선택한 음식의 총 가격은 " + MAX_TOTAL + "원 입니다.");
    }
}

