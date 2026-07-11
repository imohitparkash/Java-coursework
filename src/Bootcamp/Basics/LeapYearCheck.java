package Bootcamp.Basics;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2001;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("year is leap");
                } else {
                    System.out.println("year is not Leap");
                }
            } else {
                System.out.println("year is leap");
            }
        } else {
            System.out.println("year is not Leap");
        }
    }
}