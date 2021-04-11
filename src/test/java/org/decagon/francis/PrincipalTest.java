package org.decagon.francis;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrincipalTest {

    private Principal principal = new Principal("Cynthia");
    Applicant applicant;

    @BeforeEach
    public void setUp(){
        applicant = new Applicant("Chigoziri",Gender.MALE,18);
        Student student = new Student("Victor",Gender.MALE);
    }

    /**
     * Test for admitting applicants
     */
    @Test
    public void admitApplicantTest(){
        Applicant applicant1 = new Applicant("Chigoziri",Gender.MALE, 18);
        Applicant applicant2 = new Applicant("Chioma",Gender.FEMALE, 23);


        assertEquals((applicant1.getName() + " has been admitted to the school"),principal.admitApplicant(applicant1, 83));
        assertEquals((applicant2.getName() + " has not been admitted to the school"),principal.admitApplicant(applicant2,71));
    }

    /**
     * Test for expelling students
     */

    @Test
    public void expelStudentTest(){
        Staff teacher = new Staff("Levi",Gender.MALE);
        Student student1 = new Student("Eren",Gender.MALE);
        Student student2 = new Student("Mikasa", Gender.FEMALE);
        teacher.sendToPrincipal(student1);

        assertEquals(student1.getName() + " has been expelled",principal.expelStudent(student1));
        assertEquals(student2.getName()+ " has not been expelled",principal.expelStudent(student2));
    }
}
