package DataStructuresAndAlgorithms;

public class Module1 {

    public static void main(String[] args) {
     /*   String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        String[ ] monthsOfYear = new String [ ]
                {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"};
        for (int i = 0; i < monthsOfYear.length; i++) {
            System.out.println(i);
        }
            for (String months : monthsOfYear){
                System.out.println(months);
        }*/

        // Initialize an array for 30 seats
        int[] seats = new int[30];
// Assign values: 1 for balcony, 2 for premium seats , 3 for standard seats
        for (int i = 0; i < seats.length; i++) {
// First 5 seats are balcony
            if (i < 5) {
                seats[i] = 1;
            } else if (i < 15) {
                seats[i] = 2; // Next 10 seats are premium seats
            } else {
                seats[i] = 3; // Remaining seats are standard seats
            }
        }
    }
}


