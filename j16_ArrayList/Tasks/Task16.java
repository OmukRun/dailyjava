package j16_ArrayList.Tasks;

public class Task16 {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        int toplam=0;
        for (int i = 0; i <cumle.length(); i++) {
            if (cumle.charAt(i) != ' ') {
                toplam++;
            }
        }
        System.out.println(toplam);

        //1.yol
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println( str.replace(" ", "").length()); //58
        //2.yol
        String [] arr = str.replace(" ", "").split("");
        System.out.println(arr.length); //58
    }
}
