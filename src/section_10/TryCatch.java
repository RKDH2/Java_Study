package section_10;

class Finally {
    int value;

    void add(int value) {
        this.value = value;
        System.out.println("add " + value);
    }

    void sub(int value) {
        if(value < 10) {
            throw new IllegalArgumentException("값이 10보다 낮습니다." + value);
        }
        this.value = value;
        System.out.println("sub " + value);
    }
    void finalMethod(int value) {
        this.value = value;
        System.out.println("finally 발생! " + value);
    }

}

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[5]); // 배열의 범위를 벗어남
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과"); // 예외가 발생하기 때문에 이 코드를 실행
            System.out.println(e.getMessage());
        }

        Finally fi = new Finally();

        try {
            fi.add(10);
            fi.sub(2);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fi.finalMethod(30);
        }
    }
}
