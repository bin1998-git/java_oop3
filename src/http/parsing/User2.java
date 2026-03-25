package http.parsing;

import lombok.Data;

@Data
public class User2 {
    private int id;
    private String name;
    private String email;
    private Address2 address2;
    private String phone;
    private String website;
    private Company2 company2;

}
