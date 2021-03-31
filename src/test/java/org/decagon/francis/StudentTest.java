package org.decagon.francis;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student = new Student("Killua", Gender.MALE);

    /**
     * Testing for taking course
     */

    @Test
    public void takeCourseTest(){
        Staff teacher = new Staff("Levi", Gender.MALE, "maths");
        student.addNewCourses("maths");
        assertEquals(student.getName() + " is currently taking " + teacher.getCourseTaughtByStaff() + " taught by " + teacher.getName() + " in the classroom",student.takeCourse(teacher,"maths"));
    }
}
