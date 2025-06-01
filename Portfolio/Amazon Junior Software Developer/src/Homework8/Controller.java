package Homework8;

import java.util.*;
import java.io.*;
import Homework8.Admin;
import Homework8.Course;
import Homework8.FileInfoReader;
import Homework8.Professor;
import Homework8.Student;

    /**
     * Controller class containing the main method to run the student management system.
     * Handles user input, authentication, and basic menu navigation.
     */
public class Controller {
        private static List<Course> courseList;
        private static List<Student> students;
        private static List<Professor> professors;
        private static List<Admin> admins;
        private static Scanner sc = new Scanner(System.in);

        /**
         * Entry point for the student management system.
         * Loads all user and course data, then displays the login menu.
         */
        public static void main(String[] args) throws IOException {
            courseList = FileInfoReader.readCourses("courseInfo.txt");
            students = FileInfoReader.readStudents("studentInfo.txt");
            professors = FileInfoReader.readProfessors("profInfo.txt");
            admins = FileInfoReader.readAdmins("adminInfo.txt");

            while (true) {
                System.out.println("Login as (1) Student, (2) Professor, (3) Admin, or (0) Quit:");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        loginStudent();
                    break;
                    case 2:
                        loginProfessor();
                    break;
                    case 3:
                        loginAdmin();
                    break;
                    case 0: {
                        System.out.println("Goodbye.");
                        return;
                    }
                    default:
                        System.out.println("Invalid option.");
                }
            }
        }

        /**
         * Authenticates student login and displays their menu.
         */
        private static void loginStudent() {
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();
            for (Student s : students) {
                if (s.getUsername().equals(user) && s.getPassword().equals(pass)) {
                    System.out.println("Welcome, " + s.getName());
                    studentMenu(s);
                    return;
                }
            }
            System.out.println("Invalid login.");
        }


        private static void studentMenu(Student student) {
            while (true) {
                System.out.println("\nStudent Menu:");
                System.out.println("1. View All Courses");
                System.out.println("2. Add Course");
                System.out.println("3. Drop Course");
                System.out.println("4. View My Schedule");
                System.out.println("5. View Grades");
                System.out.println("0. Logout");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        courseList.forEach(System.out::println);
                        break;
                    case 2:
                    {
                        System.out.print("Enter course ID to add: ");
                        String courseId = sc.nextLine();
                        Course course = findCourseById(courseId);
                        if (course == null) {
                            System.out.println("Course not found.");
                        } else if (student.getEnrolledCourses().containsKey(courseId)) {
                            System.out.println("You're already enrolled in this course.");
                        } else {
                            student.enroll(courseId);
                            course.addStudent(student);
                            System.out.println("Course added.");
                        }
                    }
                    break;
                    case 3: {
                        System.out.print("Enter course ID to drop: ");
                        String courseId = sc.nextLine();
                        if (!student.getEnrolledCourses().containsKey(courseId)) {
                            System.out.println("You are not enrolled in that course.");
                        } else {
                            student.drop(courseId);
                            Course course = findCourseById(courseId);
                            if (course != null) course.removeStudent(student);
                            System.out.println("Course dropped.");
                        }
                    }
                    break;
                    case 4:
                    {
                        System.out.println("Your Schedule:");
                        student.getEnrolledCourses().keySet().forEach(cid -> {
                            Course c = findCourseById(cid);
                            if (c != null) System.out.println(c);
                        });
                    }
                    break;
                    case 5:
                    {
                        System.out.println("Your Grades:");
                        student.getEnrolledCourses().forEach((cid, grade) ->
                                System.out.println(cid + ": " + (grade.isEmpty() ? "In Progress" : grade)));
                    }
                    break;
                    case 0:
                    {
                        System.out.println("Logging out...");
                        return;
                    }
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }

        private static Course findCourseById(String id) {
            for (Course c : courseList) {
                if (c.getId().equalsIgnoreCase(id)) return c;
            }
            return null;
        }

        /**
         * Authenticates professor login and displays their menu.
         */
        private static void loginProfessor() {
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();
            for (Professor p : professors) {
                if (p.getUsername().equals(user) && p.getPassword().equals(pass)) {
                    System.out.println("Welcome, Prof. " + p.getName());
                    professorMenu(p);
                    return;
                }
            }
            System.out.println("Invalid login.");
        }

        private static void professorMenu(Professor p) {
            while (true) {
                System.out.println("\nProfessor Menu:");
                System.out.println("1. View My Courses");
                System.out.println("2. View Students in Course");
                System.out.println("0. Logout");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        p.getCourseIds().forEach(id -> {
                            Course c = findCourseById(id);
                            if (c != null) System.out.println(c);
                        });
                        break;
                    case 2:
                        System.out.print("Enter Course ID: ");
                        String id = sc.nextLine();
                        Course c = findCourseById(id);
                        if (c != null && p.getCourseIds().contains(id)) {
                            System.out.println("Enrolled students:");
                            c.getEnrolledStudents().forEach(s -> System.out.println(s.getName()));
                        } else {
                            System.out.println("Course not found or not assigned to you.");
                        }
                        break;
                    case 0:
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }


        /**
         * Authenticates admin login and displays their menu.
         */
        private static void loginAdmin() {
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();
            for (Admin a : admins) {
                if (a.getUsername().equals(user) && a.getPassword().equals(pass)) {
                    System.out.println("Welcome, Admin " + a.getName());
                    adminMenu(a);
                    return;
                }
            }
            System.out.println("Invalid login.");
        }

        private static void adminMenu(Admin admin) {
            while (true) {
                System.out.println("\nAdmin Menu:");
                System.out.println("1. View All Students");
                System.out.println("2. View All Professors");
                System.out.println("3. View All Courses");
                System.out.println("4. Assign Course to Professor");
                System.out.println("0. Logout");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        students.forEach(s -> System.out.println(s.getName() + " - " + s.getUsername()));
                        break;
                    case 2:
                        professors.forEach(p -> System.out.println(p.getName() + " - " + p.getUsername()));
                        break;
                    case 3:
                        courseList.forEach(System.out::println);
                        break;
                    case 4:
                        System.out.print("Enter Professor username: ");
                        String profUsername = sc.nextLine();
                        Professor target = null;
                        for (Professor p : professors) {
                            if (p.getUsername().equals(profUsername)) {
                                target = p;
                                break;
                            }
                        }
                        if (target == null) {
                            System.out.println("Professor not found.");
                            break;
                        }
                        System.out.print("Enter Course ID to assign: ");
                        String cid = sc.nextLine();
                        Course course = findCourseById(cid);
                        if (course == null) {
                            System.out.println("Course not found.");
                        } else {
                            target.addCourse(cid);
                            System.out.println("Assigned " + cid + " to " + target.getName());
                        }
                        break;
                    case 0:
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }

    }
