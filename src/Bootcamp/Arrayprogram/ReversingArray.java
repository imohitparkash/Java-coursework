package Bootcamp.Arrayprogram;
import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
       int[] arr={3,2,5,7};

        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));


       /* for (int a = 0; a < arr.length / 2; a++) {
            int temp = arr[a];
            arr[a] = arr[arr.length - 1 - a];
            arr[arr.length - 1 - a] = temp;
        }
        System.out.println(Arrays.toString(arr));
*/
        }

    }


