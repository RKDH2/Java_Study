package section_1;

public class FruitInfo {
    public static void main(String[] args) {
        // 기본 생성자를 사용하여 Fruit 객체 생성
        Fruit apple = new Fruit();

        // Setter 메서드를 사용하여 필드 설정
        apple.setName("Apple");
        apple.setPrice(1000);

        // Getter 메서드를 사용하여 필드 값 가져오기
        System.out.println("Name: " + apple.getName()); // Name: Apple
        System.out.println("Price: " + apple.getPrice()); // Price: 1000

        // 생성자를 사용하여 Fruit 객체 생성
        Fruit banana = new Fruit("Banana", 500);

        // Getter 메서드를 사용하여 필드 값 가져오기
        System.out.println("Name: " + banana.getName()); // Name: Banana
        System.out.println("Price: " + banana.getPrice()); // Price: 500
    }
}
