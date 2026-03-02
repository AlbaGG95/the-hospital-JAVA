package org.example;

public class SpecialistDoctor extends Doctor {
    private String specialty;

    public SpecialistDoctor(String gender, String name, int age, String contactNumber, String licenseNumber, int workHoursPerWeek, String specialty) {
        super(gender, name, age, contactNumber, licenseNumber, workHoursPerWeek);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void vacation() {
        System.out.println("Specialist doctor vacation recorded.");
    }

    public void eat() {
        System.out.println("Specialist doctor is eating.");
    }

    @Override
    public void printDetails() {
        System.out.println("Class type: SpecialistDoctor");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("Work Hours Per Week: " + getWorkHoursPerWeek());
        System.out.println("Specialty: " + getSpecialty());
    }
}
