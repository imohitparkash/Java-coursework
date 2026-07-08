package Arrayprogram;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want to search ");
        int item =sc.nextInt(),i;
        for (i=0;i<arr.length;i++)
        {
            if (item==arr[i]){
                System.out.println("mill gya");
                break;
            }

        }
        if (i== arr.length){
            System.out.println("nahi milla");
        }
    }
}
