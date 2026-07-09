package Arrayprogram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int item =sc.nextInt();
        int beg =0,end=arr.length-1,mid=(beg+end)/2;
        int c=0;
        while (beg<=end){
            if (item ==arr[mid]){
                c=1;
                System.out.println("item found");
                break;
            }
            if (item>arr[mid]){
                beg=mid+1;
            }
            else {
                end =mid-1;
            }
            mid=(beg+end)/2;


        }
        if (c==0){
            System.out.println("not found");
        }
    }
}
