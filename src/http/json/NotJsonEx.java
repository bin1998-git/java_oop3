package http.json;

public class NotJsonEx {

    public static void main(String[] args) {
        // HTTP 통신으로 json 형식 데이터를 받았다고 가정.
        // json 형식은 자바에서 문자열로 취급 됨.
        String json = "{\"name\": \"철수\", \"age\": 25 }";

        // 위 json 형식에 문자열을 우리 프로그램 내에서 사용을 하려면 파싱을 처리를 해야함

        // 1단계 : 불필요한 기호 제거 (replace 사용)
        // 중괄호와 큰 따음표 아무것도 없는 상태("")로 만들어 본다
        String step1 = json.replace("{", "").replace("}", "");
        System.out.println(step1);

        // 2단계 : 항목별로 자르기(split 사용)
        String[] parts = step1.split(",");
        System.out.println("size : " + parts.length);
        System.out.println(parts[0]);
        System.out.println(parts[1]);

        // 3단계 : 데이터 추출 및 할당
        // 첫번째 조각에서 "name" : "철수" 기준에서 철수라는 값을 추출 ( : ) 기준 추출
        String nameVal = (parts[0].split(":"))[1];
        System.out.println(nameVal);

        // 두번째 조각에서 "age" : 25 에서 25추출
        String ageVal = (parts[1].split(":"))[1];
        System.out.println(ageVal);
        int ageValue = Integer.parseInt(ageVal.trim());
        System.out.println(ageValue);

        // 4단계 : 자바 프로그램에서 이해하는 데이터 타입 -> 객체로 변환
        // 객체 생성
        User user = new User(nameVal, ageValue);
        System.out.println(user.toString().trim());

    }
} //end of class

    class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

