package OOPS;
class abc{
    void fun(int x,float y,String str){
        System.out.println("hello : "+x+" "+y+" "+str);
    }
}

public class test2 {
    public static void main(String[] args) {
        //new abc().fun();
        abc obj=new abc();
        obj.fun(10,4.5f, "bye");
    }
}
