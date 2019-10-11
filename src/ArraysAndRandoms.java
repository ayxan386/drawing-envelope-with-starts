import java.util.Random;

public class ArraysAndRandoms {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = -r.nextInt(10);
        }
        for (int i=0;i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
