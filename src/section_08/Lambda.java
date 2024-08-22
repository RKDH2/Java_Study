package section_08;

interface Add {
    int add(int x, int y);
    int add_2(int x, int y);
}

interface Sub {
    int sub(int x, int y);
}

// 함수형 인터페이스 명시
@FunctionalInterface
interface Mul {
    int mul(int x, int y);
    // int mul_2(int x, int y); // 하나에 메서드밖에 가지지 못함
}