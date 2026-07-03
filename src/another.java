import java.util.*;
public class another {
    public static void main(String[] args){
        char ch;
        System.out.println("enter character");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'A':
                System.out.println("case A");
                break;
            case 2:
                System.out.println("case b");
                break;
            default:
             System.out.println("default");

        }
    }
}
