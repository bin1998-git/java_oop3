package io.ch16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileStreamUserInput {

    public static void main(String[] args) {
        writeUserInputToFile("user_input.txt");
        readFromFile("user_input.txt");

    } // end of main

    public static void writeUserInputToFile(String fileName) {
        /**
         * 키보드 입력 -> InputStreamReader(System.in) (바이트 -> 문자 변환)
         * 파일에 쓰기 -> FileWriter(fileName)         (문자 기반 파일 출력)
         */

        try (
                InputStreamReader reader = new InputStreamReader(System.in);
                FileWriter writer = new FileWriter(fileName, true)) {
            System.out.println("텍스트를 입력하세요 (종료: Ctrl + D)");
            // 1. 사용자가 입력한 값을 받자 - 키보드 에서
            int charCode;
            while ((charCode = reader.read()) != -1) {
                // [] <-- 임시 메모리 공간
                writer.write(charCode);
                // 문자 하나 받을 때 마다 즉시 파일에 저장
                writer.flush();
            }

            System.out.println(fileName + " 에 텍스트를 모두 작성 함");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // 직접 코드 작성해보기
    // 파일에서 텍스트를 읽는 메서드를 직접 구현

    public static void readFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {

            PrintWriter writer = new PrintWriter(System.out , true);
            int code;
            while ((code = reader.read()) != -1) {
                writer.print((char) code);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}