package GFG.Basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println("Enter a move: ");
        Scanner sc=new Scanner(System.in);
        Character move=sc.next().charAt(0);
        switch (move){
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                   y++;
                   break;
            case 'D':
                y--;
                break;
            default:
                System.out.println("invalid");
        }
    }
}
