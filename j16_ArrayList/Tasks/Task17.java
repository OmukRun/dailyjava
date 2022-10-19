package j16_ArrayList.Tasks;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        String a="Apex,nesne yonelimli bir programlama dilidir";
        a = a.replace(",","").replace(" ","");
        System.out.println(a);
        String[] arr = a.split("");
        System.out.println(Arrays.toString(arr));

        String sesliharfler[]={"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliharfler));

        int count=0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<sesliharfler.length; j++){
                if (arr[i].equalsIgnoreCase(sesliharfler[j])){
                    count++;
                }
            }
        }
        System.out.println("count = " + count);

    }
}
