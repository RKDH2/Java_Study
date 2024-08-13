package section__11;

import java.util.LinkedList;

class Node {
    Node next; // 다음 노드를 가르키는 포인터
    Node prev; // 이전 노드를 가르키는 포인터
    int data; // 노드가 저장하고 있는 데이터
}


public class Fruits{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 앞에 데이터를 추가
        list.add("apple");
        // 맨 앞에 데이터를 추가
        list.addFirst("banana");
        // 맨 뒤에 데이터를 추가
        list.addLast("cherry");
        // 지정한 인덱스에 데이터를 추가
        list.add(2, "orange");

        // 앞에 데이터를 삭제
        list.remove();
        // 맨 앞에 데이터를 삭제
        list.removeFirst();
        // 맨 뒤에 데이터를 삭제
        list.removeLast();
        // 지정한 인덱스에 데이터를 삭제
        list.remove(2);

        // 저장된 위치를 반환 (리스트 앞에서 부터 탐색)
        list.indexOf("orange");
        // 저장된 위치를 반환 (리스트 뒤에서 부터 탐색)
        list.indexOf("cherry");

        // 지정한 인덱스에 지정한 데이터로 변경
        list.set(2, "grape");

        // 요소 가져오기
        list.getFirst();
        list.get(0);
    }
}