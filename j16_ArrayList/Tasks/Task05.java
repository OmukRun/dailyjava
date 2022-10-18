package j16_ArrayList.Tasks;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String str = "HeySiri";
        System.out.println(str);
        str = str.replace("Hey","Bye");
        System.out.println(str);
        String[] arr = new String[1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr));

        String str1 = "HeySiri";
        System.out.println(str1);
        String str2 [] = str1.split("y");
        System.out.println(Arrays.toString(str2));
        str2[0]="Bye";
        str1=str2[0]+str2[1];
        System.out.println(str1);

        String[] arr2 = new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));
    }
}
