package sectionBlog;

public class Fruit {
    // 멤버 변수 (인스턴트 변수)
    private String name;
    private int price;

    // 기본 생성자
    public Fruit() {
    }

    // 생성자 (Constructor)
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
