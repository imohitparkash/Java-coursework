package GFG.Basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int ans,n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        ans=0;
        while (n>0){
            n=n/10;
            ans++;
        }
        System.out.println(ans);
    }
}
