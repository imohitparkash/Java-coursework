package GFG.Basics.Problems;

import java.util.Scanner;

//Given an input num as a string. You need to typecast into an integer and double it.
public class TypeCastAndDoubleIt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int i= Integer.parseInt(num);
        System.out.println(i*2);
    }
}
