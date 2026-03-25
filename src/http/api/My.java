package http.api;

import lombok.Data;

import java.util.List;

@Data
public class My {
    private Response response;


}

@Data
class Response{
        private Body body;
        private Header header;
        }

@Data
 class Body {
    private int totalCount;
    private List<Items> items;
    private int pageNo;
    private int numOfRows;
 }

 @Data
 class Items {
    private int clearVal;
    private int sn;
    private String districtName;
    private String dataDate;
    private int issueVal;
    private String issueTime;
    private String clearDate;
    private String issueDate;
    private String moveName;
    private String clearTime;
    private String issueGbn;
    private String itemCode;
 }

 @Data
 class Header {
    private String resultMsg;
    private int resultCode;
 }
