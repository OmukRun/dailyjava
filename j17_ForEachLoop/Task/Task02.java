package j17_ForEachLoop.Task;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        String a[] = {"nazım","gülsüm","dilek","mustafa","erol"};
        String b[] = {"nazım","gülsüm","dilek","mustafa","cüneyt"};
        List<String> ortakIsim = new ArrayList<String>();

        for (String str1:a){
            for (String str2:b){
                if (str2.equalsIgnoreCase(str1)){
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()) {
            System.out.println("Listede ortak isim yok"+ortakIsim);
        }else System.out.println(ortakIsim);
    }
}
