package section7;

import java.util.ArrayList;
import java.util.List;

public class Box_2<T, U> {
    List<T> cake = new ArrayList<>();
    List<U> drink = new ArrayList<>();

    public void add_2(T cakeItem, U drinkItem) {
        cake.add(cakeItem);
        drink.add(drinkItem);
    }

    public void remove_2(T cakeItem, U drinkItem) {
        cake.remove(cakeItem);
        drink.remove(drinkItem);
    }

    public static void main(String[] args) {
        // 제네릭 매개변수 타입을 두 개 지정
        Box_2<Integer, String> box_2 = new Box_2<>();
        box_2.add_2(10, "케익");
        box_2.remove_2(20, "음료수");
    }
}