package http.toJson;

import com.google.gson.Gson;
import lombok.Data;

public class ToJsonUser {
    public static void main(String[] args) {

        Geo3 geo3 = new Geo3();
        geo3.setLat("1212");
        geo3.setLng("2222");

        Address3 address3 = new Address3();
        address3.setStreet("ddf");
        address3.setSuite("wlq");
        address3.setCity("busan");
        address3.setZipcode("222-222");
        address3.setGeo3(geo3);



        Company3 company3 = new Company3();
        company3.setName("zudng");
        company3.setCatchPhrase("nbid-dsfasd");
        company3.setBs("ASDfsda-dfd");

        User3 user3 = new User3();
        user3.setId(1);
        user3.setName("티모");
        user3.setEmail("a@@@@dsdf");
        user3.setAddress3(address3);
        user3.setCompany3(company3);
        user3.setPhone("222-222");
        user3.setWebsite("fdsafsdafsdf");


        Gson gson = new Gson();
        String users = gson.toJson(user3);
        System.out.println(users);

        User3 reuser = gson.fromJson(users, User3.class);
        System.out.println(reuser);



    }

} // end of class

@Data
class User3 {
    private int id;
    private String name;
    private String email;
    private Address3 address3;
    private Company3 company3;
    private String phone;
    private String website;


}

@Data
class Address3 {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo3 geo3;
}

@Data
class Geo3 {
    private String lat;
    private String lng;
}

@Data
class Company3 {
    private String name;
    private String catchPhrase;
    private String bs;
}



