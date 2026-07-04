public class loops1 {
    public static void main(String[] args){
        int num =145,i,sum=0;
        while(num>0){
            int r =num%10;
            int f=1;
            for (i=r;i>0;i--)
            {
                f=f*i;
            }
            System.out.println(f);
            sum=sum+f;
            num=num/10;

        }
        System.out.println(sum);
    }
}
