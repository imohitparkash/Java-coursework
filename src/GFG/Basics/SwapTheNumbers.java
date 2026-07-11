package GFG.Basics;

import java.util.Scanner;

public class SwapTheNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        //first way
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        //second way
        int p=a;
        int q=b;
        p=p+q;
        q=p-q;
        p=p-q;
        System.out.println(p+" "+q);
    }
}
