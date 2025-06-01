package Homework8;
import java.util.*;


    /**
     * Represents a professor user who can view and manage their courses.
     */
    public class Professor extends User {

        private List<String> courseIds;

        public Professor(String name, String id, String username, String password) {
            super(id, name, username, password);
            this.courseIds = new ArrayList<>();
        }

        /**
         * Adds a course to the professor's teaching list.
         */
        public void addCourse(String courseId) {
            courseIds.add(courseId);
        }

        public List<String> getCourseIds() {
            return courseIds;
        }

        @Override
        public void showMenu() {
            System.out.println("Professor Menu - View Courses | View Students | Back");
        }
}
