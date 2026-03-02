package org.example;

public class AmbulancePatient extends Patient {

    public AmbulancePatient(String gender, String name, int age, String contactNumber, String patientCode) {
        super(gender, name, age, contactNumber, patientCode);
    }

    public void admission() {
        System.out.println("Ambulance patient admission completed.");
    }

    public void operation() {
        System.out.println("Ambulance patient operation completed.");
    }

    public void room() {
        System.out.println("Ambulance patient room assignment completed.");
    }

    public void treatment() {
        System.out.println("Ambulance patient treatment completed.");
    }

    public void rehabilitation() {
        System.out.println("Ambulance patient rehabilitation completed.");
    }

    public void discharge() {
        System.out.println("Ambulance patient discharge completed.");
    }

    @Override
    public void printDetails() {
        System.out.println("Class type: AmbulancePatient");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Patient Code: " + getPatientCode());
    }
}
