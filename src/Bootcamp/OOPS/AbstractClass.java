package Bootcamp.OOPS;
abstract class AA{
    void fun(){
        System.out.println("hello");
    }

    abstract void sun() ;
}

public class AbstractClass extends AA {
    void sun(){
        System.out.println("hie");
    }
    public static void main(String[] args) {
        //abstract class which has both defined and undefined functions
        AA obj=new AbstractClass();
        obj.sun();
        obj.fun();

    }


}
