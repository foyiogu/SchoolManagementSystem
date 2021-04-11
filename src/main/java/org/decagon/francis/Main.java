package org.decagon.francis;

/**
 *
 *
 */
public class Main
{
    public static void main( String[] args ) {
        Student student1 = new Student("Armin",Gender.MALE);
        Student student2 = new Student("Mikasa", Gender.FEMALE);
        student1.addNewCourses("Physics");
        student1.addNewCourses("Mathematics");
        student1.addNewCourses("English");
        student2.addNewCourses("Chemistry");
        student2.addNewCourses("Economics");



        Staff staff1 = new Staff("Levi",Gender.MALE,"Physics");
        Staff staff2 = new Staff("Erwin",Gender.MALE,"Economics");

        Staff cleaner = new Staff("Sasha",Gender.FEMALE);

        System.out.println(student1.takeCourse(staff1,"Physics"));

        staff2.sendToPrincipal(student2);

        Applicant applicant1 = new Applicant("Francis",Gender.MALE,19);
        Applicant applicant2 = new Applicant("Cynthia",Gender.FEMALE,15);

        Principal principal = new Principal("Sophia");

        principal.admitApplicant(applicant1, 82);
        principal.admitApplicant(applicant2, 46);

    }
}
