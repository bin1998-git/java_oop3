package io.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyFileInputStream3 {

    public static void main(String[] args) throws FileNotFoundException {

        // 주의 a.txt 파일에서 바이트 단위로 데이터를 읽어서 콘솔에 출력할 에정
        // 한글이 있다면 깨짐이 발생


        try (FileInputStream in = new FileInputStream("a.txt")) {
            // 파일에서 더이상 읽을 데이터가 없으면 -1을 반환
            int readData; // 한 바이트씩 데이터를 읽을 메모리 공간 선언

            while ( (readData = in.read()) != -1 ) {
                System.out.print((char) readData);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // try 불록이 끝나면 in.close() 가 자동으로 호출 됨(실수를 방지)
        // try-with-resource 구문을 사용한다.





    } // end of main
}
