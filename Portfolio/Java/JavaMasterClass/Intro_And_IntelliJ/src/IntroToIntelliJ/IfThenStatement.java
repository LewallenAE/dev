package IntroToIntelliJ;

public class IfThenStatement {


    public static void main(String[] args){

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else if (isAlien == true) {
            System.out.println("It's an Alien!");

        }

        int topScore = 85;
        if (topScore == 100) {
            System.out.println();
            System.out.println("You got the top score of: " + topScore + "!");
        } else if (topScore < 100 || topScore > 90){
            System.out.println();
            System.out.println("You got an A!");
            System.out.println();
            System.out.println("""
            What this shows is that Java.
            
            Will run the statement which first satisfies the condition.
            
            Thus as a best practice make sure to put the most STRICT or the condition with the MOST requirements first.
            
            This will ensure that you don't spend a ton of time trying to figure out why an if then / while and other,
            conditional statement blocks aren't working!
            
            Notice that the condition below this says if the topScore is < 100 AND topScore is > 80.
            
            Well top score satisfies this condition but it isn't run, because 85 is strictly < 100, so the OR statement,
            is satisfied, when in reality, since 85 > 80 AND it's < 100 we should be running the code below.
            By the way your score is: %s""".formatted(topScore));
        }
        else if (topScore < 100 && topScore >= 80) {
            System.out.println();
            System.out.println("You got a score of: " + topScore + "!" + " " + "Not the highest score but darn good!");
        } else {
            System.out.println();
            System.out.println("Good job!");
        } // end if block




    } // end main
} // end class
