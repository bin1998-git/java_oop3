package io.ch15_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ScoreStorage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 시험 점수 저장소===");
        System.out.println("1 . 점수 저장");
        System.out.println("1 . 결과 분석");

        String choice = sc.nextLine();

        if (choice.equals("1")) {
            saveScore(sc);
        } else if (choice.equals("2")) {
            printScore();
        }

       // saveScore(sc);

    }
    private static void saveScore(Scanner sc) {
        System.out.println("학생 수를 입력하세요 : ");
        // Integer.parseInt -> 문자열 값 --> int 형으로 변환
        try {
            int count = Integer.parseInt(sc.nextLine());

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < count; i++) {
                System.out.println(i + "학생 점수 ");
                String score = sc.nextLine();
                sb.append(score);
                sb.append(" ");
            }

            try (FileOutputStream fos = new FileOutputStream("scores.txt")) {
                fos.write(sb.toString().getBytes());
                System.out.println("저장 완료");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void printScore() {
        System.out.println("--점수 분석 총점/ 평균");
        try (FileInputStream fin = new FileInputStream("scores.txt")) {

            // 파일 전체를 문자열로 읽기
            StringBuffer sb = new StringBuffer();
            int data;
            while ((data = fin.read()) != -1) {
                sb.append((char) data);
            }
            // 공백 기준으로 문자열을 자르는 split  --> 배열 char 반환
            String[] parts = sb.toString().trim().split(" ");
            int total = 0;
            for (String part : parts) {
                System.out.println("점수 : " + part);
                total += Integer.parseInt(part);
            }
            System.out.println("총점 : " + total);
            System.out.println("평균 : " + (double)total / parts.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
