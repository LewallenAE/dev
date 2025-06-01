package Homework8;

import java.util.*;

/**
 * Represents a single course in the system.
 */
public class Course {
    private String id, name, instructor, days, startTime, endTime;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String id, String name, String instructor, String days, String startTime, String endTime, int capacity) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getInstructor() { return instructor; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }
    public int getCapacity() { return capacity; }

    /**
     * Adds a student to the course if there's space.
     */
    public void addStudent(Student s) {
        if (!enrolledStudents.contains(s) && enrolledStudents.size() < capacity) {
            enrolledStudents.add(s);
        }
    }

    /**
     * Removes a student from the course.
     */
    public void removeStudent(Student s) {
        enrolledStudents.remove(s);
    }

    /**
     * Checks if this course has a time conflict with another.
     */
    public boolean hasTimeConflict(Course other) {
        return this.days.equals(other.days) && this.startTime.equals(other.startTime);
    }

    @Override
    public String toString() {
        return id + ": " + name + " by " + instructor + " [" + days + " " + startTime + "-" + endTime + "]";
    }

}
