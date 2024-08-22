package section_01;

public class NewYearAge {
    public static void main(String[] args) {
        NewYear.getAge(17); // 클래스 변수에 값을 설정

        int newMyAge = NewYear.newYear(); // 클래스 매서드를 사용
        System.out.println("newMyAge : " + newMyAge); // newMyAge : 18

        int newMyAge2 = NewYear.newYear(); // 클래스 매서드를 사용
        System.out.println("newMyAge2 : " + newMyAge2); // newMyAge2 : 19
    }
}
