package Bootcamp.OOPS;

public class FactorialSeriesSum {
    int factorial(int x)
    {
        int i,f=1;
        for(i=1;i<=x;i++){
            f=f*i;

        }
        return f;
    }

    public static void main(String[] args) {
        int i;
        float sum = 0;
        FactorialSeriesSum obj=new FactorialSeriesSum();
        for (i=1;i<=5;i++){
        int fact = obj.factorial(i);
        sum =sum +(float)i/fact;
        System.out.println("factorial: "+ fact);}
        System.out.println("sum : "+sum);
    }
}
