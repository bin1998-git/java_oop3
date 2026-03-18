package io.ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

    public static void main(String[] args) {
        // abc.png 파일 읽어서
        // abc2.png 파일 만들기



        try (
                FileInputStream fis = new FileInputStream("abc.png");       // 읽기
                FileOutputStream fos = new FileOutputStream("abc2.png")     // 쓰기
        ) {

            byte[] buffer = new byte[1024]; // 한번에 1024 바이트씩 읽을 버퍼
            int length;

            while (( length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length); // 읽은 만큼만 씀
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}
