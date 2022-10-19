package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        for (int i = 0; i < sayiList.size(); i++) {
            System.out.print(sayiList.get(i)+" ");
        }
        for (Integer a: sayiList) {
            System.out.print(a+ " ");
        }
        System.out.println();
        for (Integer a: sayiList.subList(3,sayiList.size())) {
            if (a%2==1){
                System.out.print(a+ " ");
            }
        }
        System.out.println();
        int toplam=0;
        for(int a:sayiList.subList(2,6)){
            toplam+=a;
        }
        System.out.println(toplam);
        }


    }

