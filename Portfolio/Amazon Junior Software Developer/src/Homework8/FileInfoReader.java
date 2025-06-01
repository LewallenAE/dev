package Homework8;

import java.io.*;
import java.util.*;

public class FileInfoReader {

    /**
     * Reads and parses the course information file.
     * @param filename Path to the courseInfo.txt file.
     * @return List of Course objects.
     * @throws IOException If the file cannot be read.
     */
    public static List<Course> readCourses(String filename) throws IOException {
        List<Course> courses = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            courses.add(new Course(
                    parts[0].trim(), parts[1].trim(), parts[2].trim(),
                    parts[3].trim(), parts[4].trim(), parts[5].trim(),
                    Integer.parseInt(parts[6].trim())
            ));
        }
        br.close();
        return courses;
    }

    /**
     * Reads and parses the student information file.
     * @param filename Path to the studentInfo.txt file.
     * @return List of Student objects.
     * @throws IOException If the file cannot be read.
     */
    public static List<Student> readStudents(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            Student s = new Student(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim());
            if (parts.length > 4) {
                String[] courses = parts[4].split(",");
                for (String c : courses) {
                    String[] cg = c.trim().split(":");
                    s.setGrade(cg[0].trim(), cg[1].trim());
                }
            }
            students.add(s);
        }
        br.close();
        return students;
    }

    /**
     * Reads and parses the professor information file.
     * @param filename Path to the profInfo.txt file.
     * @return List of Professor objects.
     * @throws IOException If the file cannot be read.
     */
    public static List<Professor> readProfessors(String filename) throws IOException {
        List<Professor> profs = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            profs.add(new Professor(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim()));
        }
        br.close();
        return profs;
    }

    /**
     * Reads and parses the admin information file.
     * @param filename Path to the adminInfo.txt file.
     * @return List of Admin objects.
     * @throws IOException If the file cannot be read.
     */
    public static List<Admin> readAdmins(String filename) throws IOException {
        List<Admin> admins = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            admins.add(new Admin(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim()));
        }
        br.close();
        return admins;
    }
}
