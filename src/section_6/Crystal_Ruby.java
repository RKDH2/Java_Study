package section_6;

public class Crystal_Ruby {
    static int price = 30000;

    // 인스턴스 내부 클래스 선언
    public static class Ruby_Crystal_Info {
        String name_en = "ruby";
        static String name = "루비";

        public static void getCrystalName() {
            // 외부 클래스 인스턴스 멤버 변수 접근 불가
            // System.out.println(count);

            // 외부 클래스 정적 멤버 변수 접근 가능
            System.out.println(price);

            // 내부 클래스도 정적 멤버 변수만 접근 가능
            System.out.println(name);
            // System.out.println(name_en); // static 멤버 변수가 아님
        }
    }
}
