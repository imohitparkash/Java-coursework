package OOPS;

public class test5 {
    static int num;
    void fun(){
        num =10;
    }
    void show() {
        System.out.println(num);
    }
    public static void main(String[] args) {
        test5 obj1 =new test5();
        test5 obj2 =new test5();
        obj1.fun();
        obj2.show();
    }
}
