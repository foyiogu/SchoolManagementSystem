package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 */

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    //Fields for the Student Class

    private List<String> coursesTakenByStudent;
    private boolean isSentToPrincipal;
    private boolean isExpelled;

// Constructor for the Student Class

    public Student(String pupilName, Gender pupilGender) {
        super(pupilName, pupilGender);
        this.coursesTakenByStudent = new ArrayList<>();
        this.isSentToPrincipal = false;
        this.isExpelled = false;
    }

// Getters and Setters Start
    public boolean isSentToPrincipal() {

        return isSentToPrincipal;
    }

    public void setSentToPrincipal(boolean sentToPrincipal) {
        isSentToPrincipal = sentToPrincipal;
    }

    public void setExpelled(boolean expelled) {

        isExpelled = expelled;
    }

    public List<String> getCoursesTakenByStudent() {

        return coursesTakenByStudent;
    }

    public boolean isExpelled() {
        return isExpelled;
    }
// Getters and Setters end

 //Methods
    /**
     * Method to add new courses to the list of courses
     * @param courseTaken
     */
    public String addNewCourses(String courseTaken) {

        coursesTakenByStudent.add(courseTaken);
        return courseTaken + " has been added for " + this.getName();
    }

    /**
     * Method to make a student taking a course
     * @param courseTeacher
     * @param courseName
     * @return string of the instruction
     */
    public String takeCourse(Staff courseTeacher, String courseName) {

        String instruction = "";
        for (int i = 0; i < this.coursesTakenByStudent.size(); i++) {
            if (!(this.isExpelled()) && courseName.equals(this.coursesTakenByStudent.get(i)) && courseName.equals(courseTeacher.getCourseTaughtByStaff())) {
                instruction = this.getName() + " is currently taking " + courseTeacher.getCourseTaughtByStaff() + " taught by " + courseTeacher.getName() + " in the classroom";
            }else {
                instruction = this.getName() + " can not take " + courseName;
            }
        }
        return instruction;
    }

    /**
     * Method to print out all courses taken by a particular student
     * it is a void method and prints out a list.
     */
    public void printCoursesTakenByStudents() {

        System.out.println("Courses taken by " + this.getName());
        for (int i = 0; i < this.coursesTakenByStudent.size(); i++) {
            if (this.isExpelled()){
                System.out.println( this.getName() + " has been expelled");
            }
            System.out.println((i + 1) + " -> " + this.coursesTakenByStudent.get(i));
        }
    }

}
