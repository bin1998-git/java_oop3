package io.ch17_1;

import java.util.ArrayList;

public class ArrayListEx2 {

    public static void main(String[] args) {
        // 정수 실수 블리언 사용자 정의 객체를 담을 수 있는 arrayList



        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Book> list4 = new ArrayList<>();

        list1.add(10);
        list2.add(10.2);
        list3.add(true);


        Book book = new Book("집가고싶다");
        list4.add(book);



        System.out.println(list1.getFirst());
        System.out.println(list2.getFirst());
        System.out.println(list3.getFirst());
        System.out.println(list4.getFirst().title);


    }

    static class Book {
        String title;

        public Book(String title) {
            this.title = title;
        }
    }
}
