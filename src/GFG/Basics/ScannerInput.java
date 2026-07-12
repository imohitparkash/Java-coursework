package GFG.Basics;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("you print String "+name);
        int x= sc.nextInt();
        System.out.println("you print int "+x);
        float pi= sc.nextFloat();
        System.out.println("you print float "+pi);
    }
}
