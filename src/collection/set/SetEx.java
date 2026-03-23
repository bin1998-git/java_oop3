package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        // 추가
        set.add("철수");
        set.add("영희");
        set.add("철수"); // 중복발생으로 인한 값 무시
        System.out.println(set);
        System.out.println(set.size());

        // 조회여부
        // set.contains("철수"); // true
        // set.contains("민준"); // false
        System.out.println(set.contains("철수"));
        System.out.println(set.contains("민준"));

        // 삭제
        set.remove("철수");

        // 전체 순회 (for i는  set이 순서가 없어서 불가능하다)
        for (String name : set) {
            System.out.println(name);
        }

    } // end of main

} // end of class
