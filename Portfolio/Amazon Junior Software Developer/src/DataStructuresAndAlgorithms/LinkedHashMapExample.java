package DataStructuresAndAlgorithms;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();


        // Adding entries to the LinkedHashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);
        System.out.println("Student Scores: " + studentScores);


        // Declare Bob's score and print it.
        int score = studentScores.get("Bob");
        System.out.println("Bob's score: " + score);


        // Remove Charlie
        studentScores.remove("Charlie");
        System.out.println("After removing Charlie: " + studentScores);


        // Check if Alice is in the HashMap
        boolean hasAlice = studentScores.containsKey("Alice");
        System.out.println("Is Alice in the list? " + hasAlice);

        // Display All Scores
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s Score: " + entry.getValue());
        }

        // Add David
        studentScores.putIfAbsent("David", 92);
        System.out.println("After adding David: " + studentScores);

        // Displaying the final scores
        System.out.println("\nFinal Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
