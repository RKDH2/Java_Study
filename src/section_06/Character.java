package section_06;

// 외부 클래스
public class Character {
    private int point = 10;

    // 내부 클래스
    public class Info {
        String name = "RKDHS";

        int getPoint() {
            return point;
        }
    }

    void Bag() {
        Info info = new Info();

        // 내부 클래스의 멤버 변수에 접근
        System.out.println(info.name);
        // 내부 클래스에 있는 메서드를 호출
        System.out.println(info.getPoint());
    }
}
