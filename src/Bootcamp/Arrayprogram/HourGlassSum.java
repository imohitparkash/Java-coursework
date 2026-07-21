package Bootcamp.Arrayprogram;

public class HourGlassSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       /* int sum = 0;
        for (int i = 0; i < matrix.length ; i++) {
            sum = sum + matrix[i][i];
            System.out.println(sum);

        }*/
        /*int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][matrix.length - 1 - i];
            System.out.println(sum);
        }*/
       /* int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum1 = sum1 + matrix[i][i];
            sum2 = sum2 + matrix[i][matrix.length - 1 - i];
        }
        System.out.println(sum1 + sum2);*/
        int sum=0;
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum=sum+matrix[i][j];
                System.out.println(sum);
            }
        }


    }
}
