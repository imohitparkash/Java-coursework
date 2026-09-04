package GFG.Basics;

import java.util.Scanner;

public class EvenPositionedCharacters {
    // code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
