package section__14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class INPUT_1 {
    public static void main(String[] args) throws IOException {
        // 파일을 읽어올 변수 선언
        int read = 0;
        // 입력 스트림 타입 선언
        InputStream data = null;
        try  {
            // 파일에 접근 (객체 생성)
            data = new FileInputStream("input.txt");
            // 데이터를 읽기
            while (true) {
                // 파일 읽기
                read = data.read();
                // 더 이상 읽을 데이터가 없을 경우 -1 반환
                if(read == -1) {
                    break;
                }
                // 읽은 데이터를 출력
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                // 객체가 아직 사용 중인 상태라면 닫기 (스트림 닫기)
                if (data != null) {
                    data.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
