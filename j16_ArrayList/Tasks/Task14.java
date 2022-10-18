package j16_ArrayList.Tasks;

public class Task14 {
    public static void main(String[] args) {
        int dizi[]= {1,2,3,4,5,6,7};
        int toplam=0;
        for(int i=0;i<dizi.length;i++){
            toplam+=dizi[i];
        }
        double ortalama = toplam/dizi.length;
        System.out.println("Ortalama = " +ortalama);
        System.out.println("Ortalamadan büyük olan elemanlarr");
        for(int i=0;i<dizi.length;i++){
            if (dizi[i]>ortalama){
                System.out.print(dizi[i] + " ");
            }
        }
    }
}
