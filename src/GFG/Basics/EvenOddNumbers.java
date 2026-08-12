package GFG.Basics;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==1)
            System.out.println("number is odd");
        else
            System.out.println("number is even");
    }
}
