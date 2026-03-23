package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

    public static void main(String[] args) {

        // 학생이름, 점수
        Map<String, Integer> scores = new HashMap<>();

        // 추가(put)
        scores.put("철수" , 90);
        scores.put("영희" , 85);
        scores.put("민준" , 92);

        // 조회(get)
        // 키값으로 접근하면 벨류가 나옴
        System.out.println(scores.get("철수")); // 90
        System.out.println(scores.get("없는값")); // 없는값을 넣었기 때문에 null값을 반환

        // 포함 여부
        System.out.println(scores.containsKey("영희")); // 키 값이 존재함으로 true
        System.out.println(scores.containsValue(85)); // 있는 벨류값 true
        System.out.println(scores.containsValue(10)); // 없는 벨류값이므로 false

        // 삭제
        scores.remove("민준");

        // 크기
        System.out.println(scores.size());


        // put()은 덮어씌우기도 합니다.
        scores.put("철수", 0); // 덮어 쓰기 됨/ 기존값에서 새값으로 덮어씜 90 -> 0
        System.out.println(">>>" + scores.keySet());
        System.out.println(scores);


        // 순서가 존재하지 않으므로
        for (String name : scores.keySet()) {
            System.out.println(name + " : " + scores.get(name) + "점수");
        }



    } // end of main

} // end of class
