package http.parsing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String userName;
    private String phone;
    private String website;


    private Address address;
    private Geo geo;
    private Company company;


}

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
 }

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Geo {
    private int lat;
    private int lng;
 }

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Company {
    private String name;
    private String catchPhrase;
    private String bs;
 }
