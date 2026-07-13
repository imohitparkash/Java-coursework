package Bootcamp.OOPS;
class xyz{
    void run(){
        System.out.println("hiii");
    }
}
class abc extends xyz{
    void fun(){
        System.out.println("hello");
    }
}
public class inheritance extends abc {
    void sun(){
        System.out.println("hie");
    }
    public static void main(String[] args) {
        inheritance obj=new inheritance();
        obj.fun();
    }
}
