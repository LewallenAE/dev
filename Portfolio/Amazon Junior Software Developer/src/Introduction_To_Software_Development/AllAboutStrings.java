package Introduction_To_Software_Development;

public class AllAboutStrings {

    public static void main(String[] args){

        String fruit = "pineapple";
        String fruit2 = "Pineapple";

        System.out.println("Pineapple has " + fruit.length() + " letters.");
        System.out.println("The fifth letter is: " + fruit.charAt(4));
        System.out.println("We can also print them all by iterating over its letters.");

                for (int i = 0; i < fruit.length(); i ++){
                    System.out.println("Letter " + (i +1) + ": " + fruit.charAt(i));
                }

        System.out.println("Or we can just print a substring");
        System.out.println("Here is a substring: " + fruit.substring(3, 6));

        System.out.println("Fruit in uppercase: " + fruit.toUpperCase());
        System.out.println("Fruit in lowercase: " + fruit.toLowerCase());

        System.out.println("fruit equals fruit2? " + fruit.equals(fruit2));
        System.out.println("fruit does not equal fruit2? " + (!fruit.equals(fruit2)));


        String text = "Adventure";
        // TODO: Check the length using length() and print the length
        // TODO: Get the character at position 3 and print the character
        // TODO: Get a part of the String from position 1 to 4 and print the string
        System.out.println("Length: " + text.length());
        System.out.println("The third character is: " + text.charAt(2));
        System.out.println("The first through fourth characters are: " + text.substring(0,4));

        String anotherText= "Adventure";
        // TODO: Compare text with anotherText using equals() and print the output
        // TODO: Change to uppercase using toUpperCase() and print the converted string
        // TODO: Change to lowercase using toLowerCase() and print the converted string
        // TODO: Check if it contains "vent" using contains() and print the output
        // TODO: Replace 'e' with 'a' and print the output
        System.out.println("text and anotherText are equal?" + text.equals(anotherText));
        System.out.println("Changing to uppercase: " + anotherText.toUpperCase());
        System.out.println("Changing to lowercase: " + anotherText.toLowerCase());
        System.out.println("anotherText contains vent? " + anotherText.contains("vent"));
        System.out.println("Replacing e with a: " + anotherText.replace('e', 'a'));

      /*  //TODO: Your code goes here
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";
        String userName = (firstName + lastName).toLowerCase();

        System.out.println("1.) " + firstName);
        System.out.println("2.) " + lastName);
        System.out.println("3.) " + email);
        System.out.println("4.) " + userName);
        System.out.println("5.) " + email.replace("example.com", "gmail.com"));
        System.out.println("6.) " + email.indexOf('@'));
        */

        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialise the length of shortened book title
        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0,19);// TODO: Write the code to shorten the bookTitle to 20 characters
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = bookTitle.contains(searchWord); //TODO: Write the code snippet to check if searchWord is present in bookTitle.
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        String javaFun = "Java programming is fun and educational.";
        String javaFun2 = javaFun.replace("educational", "awesome");
        System.out.println("Original string length is: " + javaFun.length());
        System.out.println("New string length is: " + javaFun2.length());
        System.out.println("Is the word fun in javaFun? " + javaFun.contains("fun"));
        System.out.println("Limiting the string to 17 characters: " + javaFun.substring(0,17));


        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        for (int i = 0; i < superheroes.length; i++) {
            System.out.println("Superhero Names:" + i + " " + superheroes[i]);
        } // end for

        // Print the introduction years
        for (int j = 0; j < introductionYears.length; j ++) {
            System.out.println("Introduction Years: " + introductionYears[j]);
        } // end for

        // Get hero names at certain positions

        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        System.out.println();
        superheroes[2] = "Thor";
        System.out.println("Modified superhero name at position 3: " + superheroes[2]);
        System.out.println("Original introduction year at position 3: " + introductionYears[2]);
        introductionYears[2] = 1999;
        System.out.println("Modified introduction year at position 3: " + introductionYears[2]);
        System.out.println(superheroes.length);
        System.out.println(introductionYears.length);



        //TODO 1: Declare and initialize variable for First Name
        /*
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int tickets = 8;
        double ticketPrice = 10.57;
        double totalTicketPrice = tickets * ticketPrice;


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Movie: " + movieTitle);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Price per ticket in USD: " + ticketPrice);


        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        System.out.println("Total price of " + tickets + " tickets: " + totalTicketPrice);
        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case

        String firstNameLastName = firstName + lastName;
        String firstNameLastNameToLower = firstNameLastName.toLowerCase();
        System.out.println(firstNameLastNameToLower);

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieTitleToUpperCase = movieTitle.toUpperCase();


        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output

        System.out.println();
        System.out.println();
        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("Movie: " + movieTitleToUpperCase);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Price per ticket: " + ticketPrice);
        System.out.println("Total price of " + tickets + " tickets: " + totalTicketPrice);
        System.out.println();
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");

        */


        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int tickets = 8;
        double ticketPrice = 10.57;
        double totalTicketPrice = tickets * ticketPrice;

        String firstNameLastName = firstName + lastName;
        String username = firstNameLastName.toLowerCase();

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieTitleToUpperCase = movieTitle.toUpperCase();


        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output


        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println();
        System.out.println("Username: " + username);
        System.out.println("Movie: " + movieTitleToUpperCase);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Price per ticket: " + ticketPrice);
        System.out.println("Total price of " + tickets + " tickets: " + totalTicketPrice);
        System.out.println();
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");




    }
}
