public class swap {
    public static void main(String[] args){
        int arr[]={3,7,5,2,9,6},i;
        int odd[]=new int[arr.length];
        int even[]=new int[arr.length];
        int m=0,n=0;
        for (i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even[n]=arr[i];
                n++;
            }
            else {
                odd[m]=arr[i];
                m++;
            }
        }
        System.out.println("odd");
        for (i=0;i<m;i++)
        {
            System.out.print(odd[i]+" ");
        }

        System.out.println("even");
        for (i=0;i<n;i++)
        {
            System.out.print(even[i]+" ");
        }
    }
}
