package org.decagon.francis;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffTest {

     Staff teacher = new Staff("Erwin", Gender.MALE,"maths");
    private Staff cleaner = new Staff("Sasha", Gender.MALE);


        @BeforeEach
        public void setUp(){
            Student student = new Student("Victor",Gender.MALE);
        }

        /**
         * Test for sending a student to the principal
         */

        @Test
        public void sendToPrincipalTest() {
            Student student = new Student("Armin", Gender.MALE);
            assertEquals((student.getName() + " has been sent to the principal"), teacher.sendToPrincipal(student));
        }


}
