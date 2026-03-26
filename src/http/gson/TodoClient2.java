package http.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TodoClient2 {

    public static void main(String[] args) {
        // 통신할 주소 :    https://jsonplaceholder.typicode.com/todos/1
        // 다건조회 -> JSON Array [{ }.{ },{ }...] 형태로 응답

        String urlString = "https://jsonplaceholder.typicode.com/todos";
        HttpURLConnection connection;

        try {

            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            // HTTP 요청 메세지 만들어서 --> 연결 요청
            connection.setRequestMethod("GET");
            // 내가 설정하지 않더라도 기본적인 설정이 구축 되어있음

            // 바로 연결요청
            int responseHttpCode = connection.getResponseCode(); // 통신
            System.out.println("통신 성공 여부 : " + responseHttpCode);

            // 응답 본문 추출
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                StringBuffer responseBody = new StringBuffer();
                String line;
                while ((line = reader.readLine()) != null) {
                    responseBody.append(line);
                }
                // StringBuffer 데이터 타입 --> 문자열로 형변환 ( toString() ) 호출 또는 (+ "")
                String jsonString = responseBody.toString();
                System.out.println("JSON Array 응답 : " + responseBody);
                // 자바 프로그램 사용하려면 JSON 형식 텍스트를 파싱 처리해야함

                // JSON Array 파싱
                // TypeToken : List<Todo> 처럼 제네릭 타입을 파싱할 떄 사용
                Gson gson = new Gson();
                TypeToken<List<Todo>> typeToken = new TypeToken<>() {}; // {} 필수
                List<Todo> todoList = gson.fromJson(jsonString, typeToken.getType());

                System.out.println("전체 갯수 : " + todoList.size() + "개");
                // 200 개 중에 앞에있는 3개만 출력
                for (int i = 0; i < todoList.size(); i++) {
                    System.out.println(todoList.get(i));
                }

            }


        } catch (Exception e) {
            System.out.println("통신 실패 : " + e.getMessage());
        }


    } // end of main

} // end of class