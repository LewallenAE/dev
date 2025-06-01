package IntroToIntelliJ;

public class TernaryOperator {

    public static void main(String[] args) {

        /**
         *
         * The Ternary operator is officially called the Conditional Operator by Oracle.
         *
         *
         * operand1 ? operand 2 : operand3  <== the structure
         *
         *  Test operand1 if true (?) then return operand2 otherwise (:) return operand3
         *
         *  Thus operand1 ? operand2 : operand3
         *
         */

        int age = 40;

        boolean isForty = age == 40 ? true : false;
        if (isForty) {
            System.out.println("You are: " + age);
        } else {
            System.out.println("Sorry you are not 40, you are: " + age);
        }

        int age1 = 72;
        String discountStatus = age1 < 13 || age1 > 65 ? "Discount" : "No Discount";
        System.out.println("The person's discount status: " + discountStatus);

        int age2 = 55;
        String votingStatus = age2 >= 18 && age2 <= 75 ? "Eligible" : "Not Eligible";
        System.out.println("The person's voting status is: " + votingStatus);

        int age3 = 17;
        String ageGroup = age3 < 13 ? "Child" :
                age3 < 20 ? "Teen" :
                        age3 < 65 ? "Adult" :
                                "Senior";
        System.out.println("The person's age group is: " + ageGroup);

    } // end main
}
