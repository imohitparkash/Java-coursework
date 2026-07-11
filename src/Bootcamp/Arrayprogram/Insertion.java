package Bootcamp.Arrayprogram;

import java.util.Scanner;

public class Insertion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n =sc.nextInt();
        int arr[]= new int[n+1],i;
        System.out.println("enter elements ");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the item to be inserted");
        int item = sc.nextInt();
        System.out.println("enter the position");
        int pos = sc.nextInt();
        for (i= arr.length-1;i>pos;i++)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=item;
        System.out.println("after insertion");
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
