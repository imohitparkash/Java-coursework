package Basics;

public class IfStatement {
    public static void main(String[] args) {
        int age=20;
        int income=200000;
        int creditScore=815;
        if (age>18){
            if (income>150000){
                if(creditScore>750){
                    System.out.println("you are eligible for loan");
                }
            }
            else {
                System.out.println("you are not eligible");
            }
        }


    }
}
