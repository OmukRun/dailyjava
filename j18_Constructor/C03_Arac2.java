package j18_Constructor;

public class C03_Arac2 {
    String marka;
    String model;
    int km=100;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();
        arac1.ikinciEl = true;
        arac1.marka = "jaguar";
        arac1.km=505000;
        arac1.model = "t360";
        arac1.motorHcm=1.6;
        arac1.yıl=2030;
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHcm);



    }
}
