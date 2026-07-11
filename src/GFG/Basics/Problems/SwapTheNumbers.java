package GFG.Basics.Problems;
//problem:-Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a. Just write the code to swap values of a and b at the specified place.
public class SwapTheNumbers {
    public static void main(String[] args) {
        // code here
        int a=5;
        int b=6;
        a=a+b;//5+3=8 a=8
        b=a-b;//8-3=5 b=5
        a=a-b;

        System.out.println(a + " " + b);
    }
}
