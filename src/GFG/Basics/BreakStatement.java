package GFG.Basics;

public class BreakStatement {
    public static void main(String[] args) {
        int i=5;
        for ( i = 0; i < 5; i++) {
            if(i==3)
                break;
            System.out.println(i);
        }
        System.out.println(i);


        //Nested loop
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                if (k==1)
                break;
                System.out.println(k);

            }
        }
    }
}
