package section__14;

import java.io.FileOutputStream;
import java.io.IOException;

public class OUTPUT_1 {
    public static void main(String[] args) throws IOException {
        // 출력 스트림을 사용하여 파일에 데이터 기록하기
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            // 문자열 데이터
            String data = "Hello, World!!!";
            // 문자열을 바이트 배열로 변환하여 파일에 기록
            fos.write(data.getBytes());
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
