package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

        try {
            calculator1.readNumbersFromFile();
            System.out.println("Sum: " + calculator1.add());
        } catch (FileNotFoundException e) {
            System.err.println("Handled in main: " + e.getMessage());
        }
    }
}

class Calculator {
    int firstNumber;
    int secondNumber;

    int add() {
        return firstNumber + secondNumber;
    }

    // Requirement: Wrap Scanner in try-catch, but still declare throws
    void readNumbersFromFile() throws FileNotFoundException {
        try {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            firstNumber = fileScanner.nextInt();
            secondNumber = fileScanner.nextInt();
        } catch (FileNotFoundException e) {
            System.err.println("Handled in method: " + e.getMessage());
            // Re-throw the exception to satisfy `throws` declaration
            throw e;
        }
    }
}
