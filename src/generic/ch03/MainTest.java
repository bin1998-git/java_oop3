package generic.ch03;

import generic.ch02.GenericPrinter;
import generic.ch02.Water;

public class MainTest {

    public static void main(String[] args) {
        Water water1 = new Water();
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        // GenericExtendsPrinter <-- 제네릭 클래스로 설계되어 있어서 <> 사용 가능
        // GenericPrinter <Water> = new GenericPrinter();
        // 오류 발생 - Water 타입은 Material의 자식이 아니라서 사용 x
        GenericExtendsPrinter<Plastic> printer = new GenericExtendsPrinter<>();
        printer.setMaterial(plastic1);
        printer.getMaterial().showInfo();
    }
}
