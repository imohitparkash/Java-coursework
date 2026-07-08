package Arrayprogram;

public class Deletion {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        int pos =1,i;
        for (i=pos;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("after deletion ");
        for (i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
