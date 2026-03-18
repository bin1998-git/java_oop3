package io.ch17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 보조 기반 스트림에 대해 알아보자
 * 기반 스트림이 있어야 사용할 수 있다.
 */
public class ByteBufferedKeyboardConsole2 {
    public static void main(String[] args) {

        // System.in
        // System.out

        try (
                FileInputStream fis = new FileInputStream("abc.png");
                FileOutputStream fos = new FileOutputStream("abc3.png") ) {

            //byte[] buffer = new byte[1024]; // 한번에 1024 바이트씩 읽을 버퍼
            int bytesRead;

            while (( bytesRead = fis.read()) != -1) {
                fos.write(bytesRead); // 읽은 만큼만 씀
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    } // end of main
}
