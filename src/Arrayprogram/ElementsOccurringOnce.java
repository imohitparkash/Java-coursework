package Arrayprogram;

public class ElementsOccurringOnce
{
    public static void main(String[] args) {
        int arr[]={4,5,2,4,4,4,2,6,4,2,7,4};
        int i,j;
        for (i=0;i< arr.length;i++)
        {
            int c=0;
            for (j=0;j< arr.length;j++)
            {
                if (arr[i]== arr[j])
                {
                    c++;
                }
            }
            if (c==1)
            {
                System.out.println(arr[i]+" : " +c);
            }
        }
    }
}
