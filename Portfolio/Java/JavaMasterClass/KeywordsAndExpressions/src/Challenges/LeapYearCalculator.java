package Challenges;

public class LeapYearCalculator {


    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(-1));
        System.out.println(isLeapYear(10_000));
        System.out.println(1924 % 4);
        System.out.println(1924 % 100);
        System.out.println(1924 % 400);

    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }


    }
}
