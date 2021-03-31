package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 */

public class Principal extends Person {

    public Principal(String name) {

        //Constructor for the Principal class and setting the gender of the principal to female
        super(name,Gender.FEMALE);
    }

    /**
     * Method for Admitting an applicant based on age and exam score
     * @param applicant
     *
     */

    public String admitApplicant(Applicant applicant, int examScore){

        int applicantAge = applicant.getApplicantAge();

        if ((applicantAge >= 17 && applicantAge <= 20)&& ((examScore>= 70)&& (examScore<= 100))){

            applicant.setAdmissionStatus(AdmissionStatus.ADMITTED);
            applicant.setApplicantExamScore(examScore);
            System.out.println("Applicant's age is " + applicantAge + "\nApplicant's exam score is " + examScore );
            System.out.println(applicant.getName() + "'s Admission Status : " + applicant.getAdmissionStatus());
            return applicant.getName() + " has been admitted to the school";

        }else {

            applicant.setAdmissionStatus(AdmissionStatus.REJECTED);
            applicant.setApplicantExamScore(examScore);
            System.out.println("Applicant's age is " + applicantAge + "\nApplicant's exam score is " + examScore);
            System.out.println(applicant.getName() + "'s Admission Status : " + applicant.getAdmissionStatus());
            return applicant.getName() + " has not been admitted to the school";
        }
    }

    /**
     * Method for expelling aa student
     * @param student
     *
     */

    public String expelStudent(Student student){

        if (student.isSentToPrincipal()){

            student.setExpelled(true);
           return student.getName() + " has been expelled";

        }else {

            return student.getName()+ " has not been expelled" ;
        }
    }
}
