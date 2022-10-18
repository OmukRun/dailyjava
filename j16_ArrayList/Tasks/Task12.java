package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        int sayiArr[]=new int [6];
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <sayiArr.length; i++) {
            System.out.print(i+1+". elemanı agam giresin : ");
            sayiArr[i]=scanner.nextInt();
        }
        System.out.println("tekElemanlar(sayiArr) = " + tekElemanlar(sayiArr));

    }//main sonu

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {
        ArrayList<Integer> tekSayilar=new ArrayList<Integer>();//tek sayıların atanacağı boş list
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==1)
            tekSayilar.add(sayiArr[i]);
        }return tekSayilar;

    }

}
