package j15_Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */


        int arr[] = {1,2,-3,4,-5,-6};
        sayiTers(arr);


    }

    private static void sayiTers(int[] arr) {
        for (int a:arr) {
            a*=-1;
            System.out.print(a+" ");
        }
    }


}
