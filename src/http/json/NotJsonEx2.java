package http.json;

public class NotJsonEx2 {

    public static void main(String[] args) {

        String json = "{\n" +
                "\"userId\": 1,\n" +
                "\"id\": 1,\n" +
                "\"title\": \"quidem molestiae enim\"\n" +
                "}";

        String step1 = json.replace("{", "").replace("}", "");
        System.out.println(step1);

        String[] step2 = step1.split(",");
        System.out.println("size : " + step2.length);
        System.out.println(step2[0]);
        System.out.println(step2[1]);
        System.out.println(step2[2]);

        // 3단계 데이터 추출
        String userVal = (step2[0].split(":"))[1];
        int userValue = Integer.parseInt(userVal.trim());
        String idVal = (step2[1].split(":"))[1];
        int idValue = Integer.parseInt(idVal.trim());
        String titleVal = (step2[2].split(":"))[1];
        System.out.println(userValue);
        System.out.println(idValue);
        System.out.println(titleVal);


        Album album = new Album(userValue, idValue, titleVal);
    }


    // 4단계

}

    class Album {
        int userId;
        int id;
        String title;

        public Album(int userId, int id, String title) {
            this.userId = userId;
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return "Album{" +
                    "userId=" + userId +
                    ", id=" + id +
                    ", title=" + title + '\'' +
                    '}';
        }
    }
