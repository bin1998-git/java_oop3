package http.parsing;

import lombok.Data;

@Data
public class Address2 {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo2 geo2;
}
