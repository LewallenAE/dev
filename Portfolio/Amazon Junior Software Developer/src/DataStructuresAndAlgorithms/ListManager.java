package DataStructuresAndAlgorithms;

import java.util.HashMap; // TODO 1
import java.util.Map;
import java.util.Set;

public class ListManager {

    // TODO 2: Create a new hash map named studentsMap
    private Map<String, Student> studentsMap = new HashMap<>();

    // Constructor
    public ListManager(Student[] students) {
        // TODO 3
        for (Student s : students) {
            studentsMap.put(s.lastName, s);
        }
    }

    public void listStudents() {
        // TODO 4 & 5
        if (studentsMap.isEmpty()) {
            System.out.println("There are no students in the list.");
            return;
        }

        // TODO 6: Print all students
        System.out.println("All students in the list:");
        for (Student s : studentsMap.values()) {
            System.out.println(s);
        }
    }

    public void findStudent(String lastName) {
        // TODO 7
        if (!studentsMap.containsKey(lastName)) {
            System.out.println("Student with last name '" + lastName + "' not found.");
            return;
        }

        // TODO 8 & 9
        Student found = studentsMap.get(lastName);
        System.out.println("Student found:");
        System.out.println(found);
    }

    public void updateStudentStatus(String lastName, String newStatus) {
        // TODO 12
        Student s = studentsMap.get(lastName);

        // TODO 13
        if (s != null) {
            s.status = newStatus;
            System.out.println("Updated student:");
            System.out.println(s);
        } else {
            // TODO 14
            System.out.println("Student with last name '" + lastName + "' not found.");
        }
    }

    public void removeStudent(String lastName) {
        // TODO 16
        Student removed = studentsMap.remove(lastName);

        // TODO 17 & 18
        if (removed != null) {
            System.out.println("Student successfully removed:");
            System.out.println(removed);
        } else {
            System.out.println("No student with last name '" + lastName + "' was found to remove.");
        }
    }
}
