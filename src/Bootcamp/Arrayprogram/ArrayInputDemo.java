package Bootcamp.Arrayprogram;

import java.util.Scanner;

public class ArrayInputDemo
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size ");
        int n= sc.nextInt();
        int arr[]=new int[n],i;
        for (i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();

        }
        System.out.println("Elements are ");
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
