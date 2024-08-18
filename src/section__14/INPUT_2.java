package section__14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class INPUT_2 {
    public static void main(String[] args) {
        // 입력 스트림 타입 선언
        try (BufferedInputStream data = new BufferedInputStream(new FileInputStream("input.txt"))) {
            byte[] buffer = new byte[100]; // 100Byte 버퍼
            int read;
            // 데이터를 읽기
            while ((read = data.read(buffer)) != -1) {
                // 읽은 데이터를 출력
                System.out.print(new String(buffer, 0, read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
