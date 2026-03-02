package org.example;

public class StudentDoctor extends Doctor {
    private int studyHoursPerWeek;
    private String currentCourse;

    public StudentDoctor(String gender, String name, int age, String contactNumber, String licenseNumber, int workHoursPerWeek, int studyHoursPerWeek, String currentCourse) {
        super(gender, name, age, contactNumber, licenseNumber, workHoursPerWeek);
        this.studyHoursPerWeek = studyHoursPerWeek;
        this.currentCourse = currentCourse;
    }

    public int getStudyHoursPerWeek() {
        return studyHoursPerWeek;
    }

    public void setStudyHoursPerWeek(int studyHoursPerWeek) {
        this.studyHoursPerWeek = studyHoursPerWeek;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public void eat() {
        System.out.println("Student doctor is eating.");
    }

    @Override
    public void printDetails() {
        System.out.println("Class type: StudentDoctor");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("Work Hours Per Week: " + getWorkHoursPerWeek());
        System.out.println("Study Hours Per Week: " + getStudyHoursPerWeek());
        System.out.println("Current Course: " + getCurrentCourse());
    }
}
