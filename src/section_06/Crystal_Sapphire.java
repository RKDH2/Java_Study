package section_06;

public class Crystal_Sapphire {
    int price = 30000;

    public void Sapphire_Crystal_Method() {
        String name = "사파이어";

        // 메서드 내에서 지역 클래스 정의
        class Sapphire_Crystal_Info {
            final int count = 10;

            public void Count() {
                // 메서드 내에서 인스턴스 변수와 지역 변수 사용
                System.out.println(name);
                System.out.println(count);
            }
        }
        // 지역 클래스의 인스턴스 생성
        Sapphire_Crystal_Info sapphire_crystal_info = new Sapphire_Crystal_Info();
        // 지역 클래스의 메서드를 호출
        sapphire_crystal_info.Count();
    }
}
