package GFG.Basics;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
       /* if (n%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }*/
        if (n>0){
            System.out.print("Positive");
            if (n%2==0)
                System.out.print("even\n");
            else System.out.print("odd\n");
        } else if (n<0) {
            System.out.println("Negative");
            if (n%2==0)
                System.out.print("even\n");
            else System.out.println("odd\n");
        }
        else System.out.println("zero");

    }

}






