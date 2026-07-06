import java.util.Scanner;

public class Loops {
    public static void main (String[] args){
      /* //  int num=5;
     // int f=1;
      //nt i;;
      //for (i=num;i>0;i++);
      //{
       //   f=f*1;
       // }
        //System.out.println(f);
        //int num = 2;
        //for (int i = 1; i <= 10; i++) {
          //  System.out.println(num + " x " + i + " = " + (num * i));
        //}
        //int num =12345;
        //int t=num;
        //int r;
        //int sum=0;
        //while(t>0){
          //  r=t%10;
            //sum= sum *10+r;
            //t=t/10;
        //}
        //System.out.println(num);
        //System.out.println(sum);
        //if (sum==num){
          //  System.out.println("palindrome");

       // }
        //else {
          //  System.out.println("not a palindrome");
        //}
        int a=0,b=1;
        System.out.println(a+""+b+"");
        for(int i=0;i<10;i++){
            int c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;
        }
    for (int i=1;i<5;i++){
        for (int j=1;j<=i;j++){
            System.out.println(j);
        }
        System.out.println();
    }
        int i,j=64;
        for (i=0;i<=100;i++){
            for (j=2;j<i;j++){
                if(i%j==0){
                    System.out.println("not prime");
                    break;
                }
            }
            if (i==j){
                System.out.println("is prime");
            }
        }
        int i,num;
        int sum=0;
        for (num=1;num<=5;num++){
            int f=1;
            for (i=num;i>0;i--)
            {
               f=f*1;
            }
            System.out.println("factorial of " +num+ " is " +f);
            sum=sum+f;
            System.out.println(sum);
        }*/
        Scanner sc=new Scanner(System.in);
        int num=153,sum=0;
        while (num>0)
        {
            int r = num%10;
            sum=sum+r*r*r;
            num=num/10;

        }
        System.out.println(sum);
    }
}
