package http.toJson;

import com.google.gson.Gson;

import http.gson.Post;
import lombok.Data;

public class ToJsonEx {
    public static void main(String[] args) {
    // 자바 객체 생성 --> 텍스트 형식이 json 변환
        Post2 post  = new Post2();
        post.setUserId(1);
        post.setId(10);
        post.setTitle("자바 공부");
        post.setBody("json 파싱 연습");

        Gson gson = new Gson();
        String jsonPost = gson.toJson(post);
        System.out.println(jsonPost);


        // json 포스트 역방향
       Post rePost = gson.fromJson(jsonPost, Post.class);
        System.out.println(rePost);
    }



}

@Data
    class Post2 {
    private int userId;
    private int id;
    private String title;
    private String body;
}


