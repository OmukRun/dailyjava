package j16_ArrayList.Tasks;

public class Task15 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1};

        simetrikMi(arr);
    }

    private static void simetrikMi(int[] arr) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {

                flag =true;

            }
        }

        System.out.println(flag);
    }}