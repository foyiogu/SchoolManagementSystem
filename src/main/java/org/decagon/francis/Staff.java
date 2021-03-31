package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 */

public class Staff extends Person implements StaffInterface {

    //Fields for the Staff Class

    private StaffDesignation staffDesignation;
    private String courseTaughtByStaff;
    private String staffRole;

    //CONSTRUCTOR FOR ACADEMIC STAFF
    public Staff(String name, Gender gender, String courseTaughtByStaff) {
        super(name, gender);
        this.staffDesignation = StaffDesignation.TEACHER;
        this.courseTaughtByStaff = courseTaughtByStaff;
        this.staffRole = "teacher";
    }

    //CONSTRUCTOR FOR NON ACADEMIC STAFF
    public Staff(String name, Gender gender) {
        super(name, gender);
        this.staffDesignation =StaffDesignation.NONACADEMICSTAFF;
        this.courseTaughtByStaff = null;
        this.staffRole = "Non academic staff";
    }

    //Getters for the Staff Class - Start

    public StaffDesignation getStaffDesignation() {
        return staffDesignation;
    }

    public String getCourseTaughtByStaff() {
        return courseTaughtByStaff;
    }

    public String getStaffRole() {
        return staffRole;
    }

    //Getters for the Staff Class - End

    /**
     * Implemented Method for sending a student to the principal
     * @param student
     * @return
     */

    @Override
    public String sendToPrincipal(Student student) {

        student.setSentToPrincipal(true); //changes the sentToPrincipal status to true
        return student.getName() + " has been sent to the principal";
    }

    /**
     * Implemented Method for teaching a course
     * @param courseName
     * @return
     */

    @Override
    public String teachCourse(String courseName) {

        if((this.staffDesignation == StaffDesignation.TEACHER) && (courseName.equals(this.getCourseTaughtByStaff()))){

            return this.getCourseTaughtByStaff() + " is being taught by "+ this.getName() + " in the Classroom";
        }
        return this.getName() + " does not handle this course";
    }

    /**
     * Implemented Method for cleaning the school. Done by a non academic staff
     * @return
     */
    @Override
    public String cleanSchool() {

        if (staffDesignation == StaffDesignation.NONACADEMICSTAFF){

            return this.getName() + " is taking care of the school";
        }
        else {

            return this.getName() + " is a " + this.getStaffRole();
        }
    }
}
