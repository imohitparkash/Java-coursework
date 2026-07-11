package GFG.Basics;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        int x1=10;
        Integer x2=x1; //Autoboxing
        int x3=x2;   //unboxing
        System.out.println(x1+" "+x2+" "+x3);
        Integer x=400,y=400;
        if (x==y){
            System.out.println("same");
        }else System.out.println("not same");
    }
}
