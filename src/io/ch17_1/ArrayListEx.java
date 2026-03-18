package io.ch17_1;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        // ArrayList 는 배열에 불편함을 해결해 주는 클래스 이다.

        ArrayList<String> list = new ArrayList<>(); // 배열처럼 미리 지정할 필요가 없다.

        // 추가 하는 기능
        list.add("사과"); // 내부적으로 [0] 인덱스에 자동 저장
        list.add("바나나"); // 내부적으로 [1] 인덱스에 자동 저장
        list.add("포도"); // 내부적으로 [2] 인덱스에 자동 저장

        // 조회 기능
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        // System.out.println(list.get(100)); --> 오류발생
        System.out.println(list.getFirst()); // 사과
        System.out.println(list.getLast()); // 포도

        // 삭제 기능
//        list.remove("바나나");
//        list.remove("사과");
//        list.remove("포도");
//        list.remove("포도11111111"); // 없는 데이터라면 그냥 무시 -> 예외는 안 던져짐
        //list.removeAll()
          list.clear(); // 전체삭제

        // 편의 기능
        System.out.println("현재 arrayList 의 길이 : " + list.size());
        System.out.println(list.contains("사과"));
        System.out.println(list.isEmpty()); // 공복확인


    }
}
