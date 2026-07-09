package Arrayprogram;

import java.util.Arrays;

public class FrequencyofEachElement {
    public static void main(String[] args) {
        int arr[]={4,3,2,4,4,2,7,8,4,8};
         //2, 2, 3, 4, 4, 4, 4, 7, 8, 8
        Arrays.sort(arr);
        int i,c=1;
        for (i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                c++;
            }
            if (arr[i]!=arr[i+1]){
                if (c>1){
                System.out.println(arr[i]+" : "+c);}
                c=1;
            }
        }
        if (c>1){
        System.out.println(arr[i]+" : "+c);}
    }
}
