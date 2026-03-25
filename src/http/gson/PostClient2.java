package http.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class PostClient2 {
    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/posts";
        HttpURLConnection connection;


        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseHttpCode = connection.getResponseCode();
            System.out.println("통신 성공 : " + responseHttpCode);

            try (BufferedReader reader =
                         new BufferedReader(
                                 new InputStreamReader(connection.getInputStream()))) {
                StringBuffer body = new StringBuffer();
                String line;
                while ((line = reader.readLine()) != null) {
                    body.append(line);
                }
                String jsonString = body.toString();
                System.out.println("Json 응답 : " + jsonString);

                Gson gson = new Gson();
                TypeToken<List<Post>> typeToken = new TypeToken<>() {};
                List<Post> posts = gson.fromJson(jsonString, typeToken.getType());
                System.out.println(posts.size());

                System.out.println("---------------");

                for (int i = 0; i < 3; i++) {
                    System.out.println(posts.get(i));
                }

            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

