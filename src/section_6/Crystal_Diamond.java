package section_6;

public class Crystal_Diamond {
    // 인스턴스 멤버 변수
    int price = 20000;

    // 인스턴스 내부 클래스 선언
    public class Diamond_Crystal_Info {
        String name = "다이아몬드";

        public void getCrystalName() {
            // 외부 클래스에 접근
            System.out.println(price);

            // 내부 클래스에 멤버 변수
            System.out.println(name);
        }
    }
}
