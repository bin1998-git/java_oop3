package collection.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 메인에서 실행해보기
public class MemberMain {

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();


        System.out.println("=== 회원 관리 시스템 ===");
        System.out.println("번호를 선택하세요");
        System.out.println("-----------------");
        System.out.println("1. 회원 가입");
        System.out.println("2. 회원 조회");
        System.out.println("3. 정보 수정");
        System.out.println("4. 정보 삭제");
        System.out.println("5 .전체 회원 목록");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();


        while (true) {
            if (choice.equals("1")) {
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("이메일 : ");
                String email = sc.nextLine();
                System.out.print("나이 :");
                int age = sc.nextInt();
            } else if (choice.equals("2")) {
                System.out.println("조회 결과: ");
               if (members.contains("1")) {

               }
            }
        }
        
    } // end of main

} // end of class
