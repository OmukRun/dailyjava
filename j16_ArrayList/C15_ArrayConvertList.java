package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        String arrJavaCan[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String> listJavaTar= Arrays.asList(arrJavaCan);
        System.out.println("listJavaTar = " + listJavaTar);//[Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());//4
        //listJavaTar.add("sefilCan Haluk");//Array'a eleman eklennmez

        ArrayList<String> listJavaTar2= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar2.add("SefilCan Haluk");
        System.out.println("listJavaTar2 = " + listJavaTar2);//[]
    }
}
