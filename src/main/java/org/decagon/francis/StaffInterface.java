package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 *
 * Staff Interface for the staff class
 */

public interface StaffInterface {
    String sendToPrincipal(Student student);
    String teachCourse(String courseName);
    String cleanSchool();
}
