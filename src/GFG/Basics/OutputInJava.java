package GFG.Basics;

public class OutputInJava {
    public static void main(String[] args) {
        // println and print examples
        String a="GFG";
        String b="courses";
        int x=3,y=2;
        System.out.println(a);
        System.out.println(x+y);
        System.out.print(a+" ");
        System.out.print(b+"\n");
        //printf and format output examples
        int p=20;
        int q=10;
        System.out.format("the value of p is %d\n",p);
        System.out.printf("the value of q is %d\n",q);
        double pie =Math.PI;
        System.out.println(pie);
        System.out.printf("the value of pi is %.2f\n",pie);
        System.out.printf("%07.2f",pie);
        System.out.printf("p=%d,q=%d",p,q);
    }
}
