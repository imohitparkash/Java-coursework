package Arrayprogram;

public class MaxMin {
    public static void main(String[] args){
        int arr[]={5,3,9,11,7};
        int max =arr[0],i;
        for (i=1;i<arr.length;i++){
            if (max<arr[i])
            {
            max = arr[i];
            }
        }
        System.out.println("maximum: ");
    }
}
