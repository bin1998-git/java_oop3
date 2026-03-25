package http.parsing;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class UserClient {

    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/users/1";
        HttpURLConnection connection;




        {
            try {
                URL  url = new URL(urlString);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseHttpCode = connection.getResponseCode();
                System.out.println("통신 성공 : " + responseHttpCode);

                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
                    StringBuffer body = new StringBuffer();
                    String line;
                    while ( (line = reader.readLine()) != null) {
                        body.append(line);
                    }

                    String jsonString = body.toString();
                    System.out.println("json 응답 : " + jsonString);


                    System.out.println("0------------0");
                    Gson gson = new Gson();
                   User user= gson.fromJson(jsonString, User.class);
//                    TypeToken<List<User>> typeToken = new TypeToken<>() {};
//                    List<User> user = gson.fromJson(jsonString,typeToken.getType());
                    System.out.println(user.toString());


                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }

}
