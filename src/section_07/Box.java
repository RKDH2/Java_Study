package section_07;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> list = new ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void remove(T fruit) {
        list.remove(fruit);
    }

    public static void main(String[] args) {
        // 제네릭 매개변수 <> 안에 정수형 타입을 할당
        Box<Integer> integerBox = new Box<>();
        // 제네릭 매개변수 <> 안에 실수형 타입을 할당
        Box<Double> doubleBox = new Box<>();
        // 제네릭 매개변수 <> 안에 문자열 타입을 할당
        Box<String> stringBox = new Box<>();
        // 제네릭 매개변수 <> 안에 클래스 할당 가능
        // Box<newClass> newTypeBox = new Box<newClass>();
    }
}