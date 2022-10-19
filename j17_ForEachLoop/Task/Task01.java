package j17_ForEachLoop.Task;

public class Task01 {
    public static void main(String[] args) {
        int arr [][] ={{2,3},{4},{5,6,7}};
        int kere =1;
        for (int[] deger : arr) {
            for (int deger1:deger) {
                kere*=deger1;
            }
        }
        System.out.println(kere);
    }
}
