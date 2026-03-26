//package http.api;
//
//import com.google.gson.Gson;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ResponseClient {
//
//    public static void main(String[] args) {
//
//
//
//        Items items1 = new Items();
//        items1.setClearVal(73);
//        items1.setSn(160);
//        items1.setDistrictName("충북");
//        items1.setDataDate("2025-22-22");
//        items1.setIssueVal(166);
//        items1.setIssueTime("11:11");
//        items1.setClearDate("222-22-=22");
//        items1.setMoveName("부산지역");
//        items1.setClearTime("17:23");
//        items1.setIssueGbn("주의");
//        items1.setItemCode("odn12");
//
//        Items items2 = new Items();
//        items2.setClearVal(72);
//        items2.setSn(120);
//        items2.setDistrictName("충북");
//        items2.setDataDate("2025-22-22");
//        items2.setIssueVal(166);
//        items2.setIssueTime("11:11");
//        items2.setClearDate("222-22-=22");
//        items2.setMoveName("부산지역");
//        items2.setClearTime("17:23");
//        items2.setIssueGbn("주의");
//        items2.setItemCode("odn12");
//
//
//
//
//        List<Items> items = new ArrayList<>();
//        items.add(items1);
//        items.add(items2);
//
//        Body body = new Body();
//        body.setTotalCount(58);
//        body.setItems(items);
//        body.setPageNo(1);
//        body.setNumOfRows(2);
//
//        Header header = new Header();
//        header.setResultMsg("sdfsda");
//        header.setResultCode(22);
//
//        Response response = new Response();
//        response.setBody(body);
//        response.setHeader(header);
//
//        My my = new My();
//        my.setResponse(response);
//
//
//        Gson gson = new Gson();
//        String myString = gson.toJson(response);
//        System.out.println(myString);
//
//    }
//}
