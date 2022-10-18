package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_ReplaceAll_fill {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 24,23,14,19,60,1,55,27,1,38));
        System.out.println("list = " + list);

        Collections.replaceAll(list,1,20);
        System.out.println("list = " + list);

        Collections.fill(list,33);
        System.out.println("list = " + list);
    }
}
