package section_06;

public class Main {
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스 생성
        Character character = new Character();
        // 외부 클래스의 메서드를 호출하여 내부 클래스 사용
        character.Bag();

        // 내부 클래스 직접 생성 및 사용
        Character.Info info = character.new Info();
        System.out.println(info.name);
        System.out.println(info.getPoint());

        // [인스턴스 클래스]
        // 외부 클래스를 객체를 생성하고 인스턴스화
        Crystal_Diamond crystal_diamond = new Crystal_Diamond();
        // 내부 클래스 초기화
        Crystal_Diamond.Diamond_Crystal_Info diamond_crystal_info = crystal_diamond.new Diamond_Crystal_Info();
        diamond_crystal_info.getCrystalName();

        // [정적 클래스]
        // 인스턴스 클래스와 다르게 외부 클래스 객체를 생성하지 않아도 선언이 가능
        Crystal_Ruby.Ruby_Crystal_Info ruby_crystal_info = new Crystal_Ruby.Ruby_Crystal_Info();
        // 인스턴스 멤버 변수에 접근
        System.out.println(ruby_crystal_info.name_en);
        // 정적 멤버 변수에 접근
        System.out.println(Crystal_Ruby.Ruby_Crystal_Info.name);
        // 클래스 -> 정적 클래스 -> 정적 메서드
        Crystal_Ruby.Ruby_Crystal_Info.getCrystalName();

        // [지역 클래스 (로컬 클래스)]
        Crystal_Sapphire crystal_sapphire = new Crystal_Sapphire();
        crystal_sapphire.Sapphire_Crystal_Method();

        // [익명 클래스]
        Object obj = new Object() {
            @Override
            public String toString() {
                return "자바(Java)";
            }
        };
        // 익명 클래스의 toString 메서드
        System.out.println(obj);
    }
}
