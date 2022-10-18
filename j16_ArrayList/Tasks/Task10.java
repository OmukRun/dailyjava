package j16_ArrayList.Tasks;

import java.util.ArrayList;/* TASK :

 * Input olarak verilen listteki isimlerden
 * icinde 'a' harfi bulunanlari silen bir code create ediniz.
 *
 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
 * OUTPUT : [Veli,Omer]
 */
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> listisim=new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOlmayanlistisim=new ArrayList<>();
        for (int i = 0; i < listisim.size(); i++){
        if (!listisim.get(i).toLowerCase().contains("a")){
            aOlmayanlistisim.add(listisim.get(i));
        }
    }
        System.out.println("aOlmayanlistisim = " + aOlmayanlistisim);
        listisim.clear();
        listisim.addAll(aOlmayanlistisim);
        System.out.println("listisim = " + listisim);
    }
}
