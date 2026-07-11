package GFG.Basics;

public class TypeConversion {
    public static void main(String[] args) {
        //implicit conversion or widening
        int x=100;
        long y=x;
        float z=y;
        System.out.println(x+" "+y+" "+z);
        //explicit casting or narrowing
        double d=65.4;
        int i=(int) d;
        char c=(char) i;
        System.out.println(i);
        System.out.println(c);
    }
}
