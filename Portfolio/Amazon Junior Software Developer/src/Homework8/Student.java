package Homework8;

import java.util.*;

    /**
     * Represents a student user with course enrollment and grade tracking.
     */
    public class Student extends User {
        private Map<String, String> enrolledCourses; // courseID -> grade

        public Student(String id, String name, String username, String password) {
            super(id, name, username, password);
            this.enrolledCourses = new HashMap<>();
        }

        /**
         * Enrolls the student in a course.
         */
        public void enroll(String courseId) {
            enrolledCourses.putIfAbsent(courseId, "");
        }

        /**
         * Removes the student from a course.
         */
        public void drop(String courseId) {
            enrolledCourses.remove(courseId);
        }

        public Map<String, String> getEnrolledCourses() {
            return enrolledCourses;
        }

        /**
         * Sets the grade for a course.
         */
        public void setGrade(String courseId, String grade) {
            enrolledCourses.put(courseId, grade);
        }

        @Override
        public void showMenu() {
            System.out.println("Student Menu - View/Add/Drop Courses | View Grades | Back");
        }
}
