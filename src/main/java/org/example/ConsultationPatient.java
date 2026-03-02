package org.example;

public class ConsultationPatient extends Patient {

    public ConsultationPatient(String gender, String name, int age, String contactNumber, String patientCode) {
        super(gender, name, age, contactNumber, patientCode);
    }

    public void admission() {
        System.out.println("Consultation patient admission completed.");
    }

    public void nurseCheck() {
        System.out.println("Consultation patient nurse check completed.");
    }

    public void room() {
        System.out.println("Consultation patient room assignment completed.");
    }

    public void treatment() {
        System.out.println("Consultation patient treatment completed.");
    }

    public void nextAppointment() {
        System.out.println("Consultation patient next appointment scheduled.");
    }

    public void discharge() {
        System.out.println("Consultation patient discharge completed.");
    }

    @Override
    public void printDetails() {
        System.out.println("Class type: ConsultationPatient");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Patient Code: " + getPatientCode());
    }
}
