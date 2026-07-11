package GFG.Basics;
class Point{
    int x;
    int y;
}
class Point1{
    int i;
    int j;
}

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=10;
        p1.y=20;
        Point p2=p1;
        p2.x=30;
        //checking default value
        Point1 v1=new Point1();
        System.out.println(v1.i);
        System.out.println(v1.j);


    }
}
