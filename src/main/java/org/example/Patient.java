package org.example;

public abstract class Patient extends Characters {
    private String patientCode;

    public Patient(String gender, String name, int age, String contactNumber, String patientCode) {
        super(gender, name, age, contactNumber);
        this.patientCode = patientCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }
}
