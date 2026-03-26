package generic.ch03;

/**
 *
 *  <T extends 클래스 >를 사용하면 현재 코드에서 material 을 상속받은 자식 클래스만
 *
 */


public class GenericExtendsPrinter <T extends Material>{

    T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
