package io.ch17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy2 {

    public static void main(String[] args) {
        // abc.png 파일 읽어서
        // abc2.png 파일 만들기
        // 추가: 복사한 시간이 얼마 걸렸는지 1000분에 1초로 표시해보기

        String sourceFile = "img.png";
        String destFile = "C:\\_work_java\\img3.png";
        long startTime = System.currentTimeMillis();

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("파일 복사 완료");
            System.out.println("소요 시간: " + (endTime - startTime) + "ms");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}