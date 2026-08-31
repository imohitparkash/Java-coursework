package GFG.Basics;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==3)
                continue;
            System.out.println(i);
        }
    int k=0;
        while(k<3){
            k++;
            System.out.println("before "+k);
            if(k==2)
                continue;
            System.out.println("After "+k);
        }
    }
}
