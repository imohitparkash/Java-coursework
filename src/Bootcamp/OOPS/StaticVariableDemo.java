package Bootcamp.OOPS;

public class StaticVariableDemo {
    static int num;
    void fun(){
        num =10;
    }
    void show() {
        System.out.println(num);
    }
    public static void main(String[] args) {
        StaticVariableDemo obj1 =new StaticVariableDemo();
        StaticVariableDemo obj2 =new StaticVariableDemo();
        obj1.fun();
        obj2.show();
    }
}
