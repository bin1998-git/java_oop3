package io.ch17_1;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {

        // 1. 정수를 담은 리스트
        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(10);
        intlist.add(20);
        intlist.add(30);
        System.out.println("정수 리스트 : " + intlist);

        // 2. 실수를 담는 리스트
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.2);
        doubleList.add(30.2);
        doubleList.add(20.2);
        System.out.println("실수 리스트 : " + doubleList);


        // 3. 불리언 담는 리스트
        ArrayList<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        System.out.println(booleanList);

        // 사용자 정의 객체를 담는 리스트
        ArrayList<Book2> book2 = new ArrayList<>();
        book2.add(new Book2("자바책"));
        book2.add(new Book2("RDMS책"));

        // boo2.get(0) ---> 주소값.title
        System.out.println(book2.get(0).title);
        System.out.println(book2.get(1).title);


        try {
            System.out.println(book2.get(2).title);
        } catch (Exception e) {
            e.printStackTrace(); // sout...
        }

        System.out.println("프로그램 정상 종료");


    } // end of main

} // end of class

class Book2 {

    String title;

    public Book2(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "[title=" + title + "]";
    }
}