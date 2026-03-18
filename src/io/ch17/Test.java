package io.ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("img.png");
        FileOutputStream fos = new FileOutputStream("img2.png") ) {

            int bytes;

            while ((bytes = fis.read()) != -1) {
                fos.write(bytes);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}