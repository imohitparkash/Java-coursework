            package Bootcamp.OOPS;


            public class ArmstrongNumberCheck {
                int digit(int num){
                    int c=0;
                    while(num>0){
                        c++;
                        num=num/10;
                    }
                    return c;
                }
                int fun(int num){
                    int c=digit(num);
                    int sum=0;
                    while (num>0){
                        int r =num%10;
                        sum=sum+(int)Math.pow(r,3);
                        num=num/10;
                    }
                    return sum;

                }
                public static void main(String[] args) {
                    int num =12;
                    ArmstrongNumberCheck obj = new ArmstrongNumberCheck();
                    int ans=obj.fun(num);
                    if (ans==num){
                        System.out.println("armstrong");
                    }
                    else {
                        System.out.println("not an armstrong");
                    }
                }
            }
