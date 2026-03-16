package io.ch15_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ScoreRecord {
    public static void main(String[] args) throws Exception{
        // 1. 파일에 쓰는 기능

        // 2. 파일에서 읽는 기능
        // 총점 --> 더하는 코드

        Scanner sc = new Scanner(System.in);

        System.out.println("====타자 연습 기록기====");
        System.out.println("1. 점수 저장");
        System.out.println("2. 점수 총점/평균 보기");
        System.out.print("선택 : ");

        String choice = sc.nextLine();

        if (choice.equals("1")) {
            saveScore(sc);
        } else if (choice.equals("2")) {
            scanScore();
        }

        sc.close();


    } // end of main

    private static void scanScore() throws Exception{
        System.out.println("\n==== 저장된 기록 ====");
        try (FileInputStream fis = new FileInputStream("scores.txt")) {
         Scanner sc = new Scanner(fis);

         int [] scores = new int[5];
         int total = 0;
         int index = 0;

         while (sc.hasNext() && index < 5) {
             String val = sc.next();
             scores[index] = Integer.parseInt(val);

             total += scores[index];
             index++;
         }

            System.out.println("저장값 총점 : " + total);



        }


    }

    private static void saveScore(Scanner sc) {
        System.out.println("--점수를 입력하세요--");

        String score = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream("scores.txt", true)) {
            fos.write(score.getBytes());
            fos.write("\n".getBytes());
            System.out.println("점수 저장완료");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
