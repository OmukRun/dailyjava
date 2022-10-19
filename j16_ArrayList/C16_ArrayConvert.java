package j16_ArrayList;

public class C16_ArrayConvert {
    public static void main(String[] args) {
        int sayilar[]={5,11,56,23,14,2};
        int toplam=0;
        for(int x:sayilar){
            toplam+=x;
            x+=10;
        }
        System.out.println("Toplam="+toplam);
    }
}
