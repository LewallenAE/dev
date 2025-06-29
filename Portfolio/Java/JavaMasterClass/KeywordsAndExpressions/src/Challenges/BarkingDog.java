package Challenges;

public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,0));
        System.out.println(shouldWakeUp(false,0));
        System.out.println(shouldWakeUp(true,15));
        System.out.println(shouldWakeUp(false,15));

    }

    public static boolean shouldWakeUp( boolean barking, int hourOfDay) {

       if (!barking || hourOfDay < 0|| hourOfDay > 23) {
           return false;
       } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
           return true;
        } else {
           return false;
       }
    }
}
