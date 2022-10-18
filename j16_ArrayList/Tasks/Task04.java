package j16_ArrayList.Tasks;

public class Task04 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

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
