package GFG.Basics;

public class Method {
    public static void main(String[] args) {
        System.out.println("before call");
        fun();
        System.out.println("after call");
    }
    public static void fun(){
        System.out.println("inside fun");
    }
}
