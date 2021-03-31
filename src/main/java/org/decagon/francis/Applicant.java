package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 */

public class Applicant extends Person {

    //Fields for the Applicant class

    private int applicantAge;
    private AdmissionStatus admissionStatus;
    private int applicantExamScore;

    //Constructor for the Applicant Class

    public Applicant(String pupilName, Gender pupilGender, int applicantAge) {
        super(pupilName, pupilGender);
        this.applicantAge = applicantAge;
        this.admissionStatus = AdmissionStatus.UNDECIDED;
        this.applicantExamScore=0;
    }

    //Getters and Setters

    public void setApplicantExamScore(int applicantExamScore) {
        this.applicantExamScore = applicantExamScore;
    }

    public void setAdmissionStatus(AdmissionStatus admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public AdmissionStatus getAdmissionStatus() {
        return admissionStatus;
    }

    public int getApplicantExamScore() {
        return applicantExamScore;
    }
}
