package Bootcamp.Arrayprogram;

public class BubbleSort {
    public static void main(String[] args)
    {
       int arr[]={4,8,5,7},i,j;
       for (i=0;i<arr.length-1;i++){
           for (j=0;j< arr.length;j++){
               if (arr[j]>arr[j+1])
               {
                int t =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
               }

           }
       }
        System.out.println("after sorting: ");
       for (i=0;i< arr.length;i++){
           System.out.println(arr[i]+" ");
       }
    }
}
