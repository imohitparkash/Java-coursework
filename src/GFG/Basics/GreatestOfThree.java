package GFG.Basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        int ans = 0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       if (a>=b) {
           if (a >= c)
               ans = a;
           else {
               ans = c;
           }
       }
       if (b>=a){
           if (b>=c)
               ans=b;
           else {
               ans=c;
           }
       }
        System.out.println(ans);
    }
}
