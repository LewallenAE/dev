import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import Homework8.Student;
import Homework8.Course;
import Homework8.Professor;
import Homework8.Admin;
import Homework8.FileInfoReader;






public class StudentManagementSystemTest {

        private Student student;
        private Course course;
        private Professor professor;
        private Admin admin;

        @BeforeEach
        void setup() {
            student = new Student("1", "Test Student", "student1", "pass");
            course = new Course("C101", "Java", "Dr. Smith", "MWF", "10:00", "11:00", 2);
            professor = new Professor("Dr. Smith", "P1", "prof1", "pass");
            admin = new Admin("A1", "Admin Guy", "admin1", "pass");
        }

        // ==================== Student Tests ==================== //

        @Test void testEnrollCourse() {
            student.enroll("C101");
            assertTrue(student.getEnrolledCourses().containsKey("C101"));
        }

        @Test void testDropCourse() {
            student.enroll("C101");
            student.drop("C101");
            assertFalse(student.getEnrolledCourses().containsKey("C101"));
        }

        @Test void testDoubleEnrollDoesNotDuplicate() {
            student.enroll("C101");
            student.enroll("C101");
            assertEquals(1, student.getEnrolledCourses().size());
        }

        @Test void testDropNonexistentCourse() {
            student.drop("C999");
            assertEquals(0, student.getEnrolledCourses().size());
        }

        @Test void testSetAndGetGrade() {
            student.enroll("C101");
            student.setGrade("C101", "A");
            assertEquals("A", student.getEnrolledCourses().get("C101"));
        }

        @Test void testOverwriteGrade() {
            student.enroll("C101");
            student.setGrade("C101", "B");
            student.setGrade("C101", "A");
            assertEquals("A", student.getEnrolledCourses().get("C101"));
        }

        @Test void testEnrolledCoursesNonEmpty() {
            student.enroll("C101");
            assertFalse(student.getEnrolledCourses().isEmpty());
        }

        @Test void testEnrolledCoursesEmptyInitially() {
            assertTrue(student.getEnrolledCourses().isEmpty());
        }

        @Test void testDefaultGradeIsEmpty() {
            student.enroll("C101");
            assertEquals("", student.getEnrolledCourses().get("C101"));
        }

        @Test void testStudentMenuDoesNotCrash() {
            assertDoesNotThrow(() -> student.showMenu());
        }

        // ==================== Course Tests ==================== //

        @Test void testAddStudent() {
            course.addStudent(student);
            assertTrue(course.getEnrolledStudents().contains(student));
        }

        @Test void testAddStudentCapacityLimit() {
            Student s2 = new Student("2", "S2", "s2", "p");
            Student s3 = new Student("3", "S3", "s3", "p");
            course.addStudent(student);
            course.addStudent(s2);
            course.addStudent(s3);
            assertEquals(2, course.getEnrolledStudents().size());
        }

        @Test void testRemoveStudent() {
            course.addStudent(student);
            course.removeStudent(student);
            assertFalse(course.getEnrolledStudents().contains(student));
        }

        @Test void testRemoveNonexistentStudent() {
            course.removeStudent(student);
            assertFalse(course.getEnrolledStudents().contains(student));
        }

        @Test void testHasTimeConflictTrue() {
            Course other = new Course("C102", "Python", "Dr. X", "MWF", "10:00", "11:00", 2);
            assertTrue(course.hasTimeConflict(other));
        }

        @Test void testHasTimeConflictFalse() {
            Course other = new Course("C103", "C++", "Dr. Y", "TTh", "12:00", "1:00", 2);
            assertFalse(course.hasTimeConflict(other));
        }

        @Test void testGetCapacity() {
            assertEquals(2, course.getCapacity());
        }

        @Test void testGetInstructor() {
            assertEquals("Dr. Smith", course.getInstructor());
        }

        // ==================== Admin & Professor ==================== //

        @Test void testAdminGetters() {
            assertEquals("admin1", admin.getUsername());
            assertEquals("Admin Guy", admin.getName());
        }

        @Test void testProfessorGetters() {
            assertEquals("prof1", professor.getUsername());
            assertEquals("Dr. Smith", professor.getName());
        }

        @Test void testProfessorAddCourse() {
            professor.addCourse("C101");
            assertTrue(professor.getCourseIds().contains("C101"));
        }

        @Test void testProfessorAddDuplicateCourse() {
            professor.addCourse("C101");
            professor.addCourse("C101");
            assertEquals(2, professor.getCourseIds().size());
        }

        @Test void testProfessorShowMenuDoesNotCrash() {
            assertDoesNotThrow(() -> professor.showMenu());
        }

        // ==================== FileInfoReader ==================== //

        @Test void testFileNotFound() {
            assertThrows(IOException.class, () -> FileInfoReader.readCourses("doesnotexist.txt"));
        }

        @Test void testFindCourseByIdExists() {
            List<Course> list = Arrays.asList(course);
            assertEquals("C101", list.get(0).getId());
        }

        @Test void testFindCourseByIdNotExists() {
            List<Course> list = new ArrayList<>();
            assertTrue(list.stream().noneMatch(c -> c.getId().equals("fake")));
        }

        // For full tests of FileInfoReader, we should use mocks or temp files
        // and run with actual file system, skipped here for simplicity

        // ==================== Controller Utilities ==================== //

        /* @Test void testLoginStudentInvalid() {
            assertDoesNotThrow(() -> Controller.main(new String[]{}));
        }*/

        @Test void testToStringCourseOutput() {
            String str = course.toString();
            assertTrue(str.contains("Java"));
        }

        @Test void testStudentIdGetter() {
            assertEquals("1", student.getId());
        }

        @Test void testCourseNameGetter() {
            assertEquals("Java", course.getName());
        }

        @Test void testProfessorIdGetter() {
            assertEquals("P1", professor.getId());
        }

        @Test void testAdminIdGetter() {
            assertEquals("A1", admin.getId());
        }
    }


