package Arrayprogram;

public class RotationRL {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        int t=arr[arr.length-1],i;
        for (i= arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=t;
        System.out.println("after rotation: ");
        for (i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
