package org.example;

public abstract class Doctor extends Characters {
    private String licenseNumber;
    private int workHoursPerWeek;

    public Doctor(String gender, String name, int age, String contactNumber, String licenseNumber, int workHoursPerWeek) {
        super(gender, name, age, contactNumber);
        this.licenseNumber = licenseNumber;
        this.workHoursPerWeek = workHoursPerWeek;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    public void setWorkHoursPerWeek(int workHoursPerWeek) {
        this.workHoursPerWeek = workHoursPerWeek;
    }
}
