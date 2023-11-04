package day18_oopconcept02;

public class C02Mammal extends C01Animal{
    public String type;
    public int height;
    public C02Mammal() {
        super();
        System.out.println("M No Parameters");
    }
    public C02Mammal(String type) {
        super();
        System.out.println("String type Parametr");
        this.type=type;
    }
    public C02Mammal(String type,int height) {
        super();
        System.out.println("String type,int height Parametrs");
        this.type=type;
        this.height =height;
    }
}
