package Arrayprogram;

public class testArray {
    public static void main (String[] args){
        int arr[]={11,22,33,44,55};
        System.out.println(arr.length);
        int i;
        for (i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        for (i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
