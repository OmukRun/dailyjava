package j18_Constructor;

public class C07_Ogrtm {
    String isim;
    int tecrube;
    int kidem=5;

    public C07_Ogrtm(String isim, int tecrube){
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kidemHesapla(int kidem){
        System.out.println("Agam kıdemin :"+(kidem*2));
        System.out.println("Agam kıdemin :"+(this.kidem*2));
    }





}
