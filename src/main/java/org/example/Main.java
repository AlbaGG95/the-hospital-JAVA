package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConsultationPatient consultation1 = new ConsultationPatient("Female", "Alice Brown", 31, "555-1001", "CP-001");
        ConsultationPatient consultation2 = new ConsultationPatient("Male", "David Green", 27, "555-1002", "CP-002");

        AmbulancePatient ambulance1 = new AmbulancePatient("Male", "Robert White", 45, "555-2001", "AP-001");
        AmbulancePatient ambulance2 = new AmbulancePatient("Female", "Laura Black", 39, "555-2002", "AP-002");

        SpecialistDoctor specialist1 = new SpecialistDoctor("Female", "Dr. Emma Stone", 42, "555-3001", "LIC-SP-001", 40, "Cardiology");
        SpecialistDoctor specialist2 = new SpecialistDoctor("Male", "Dr. Michael Reed", 50, "555-3002", "LIC-SP-002", 38, "Neurology");

        StudentDoctor student1 = new StudentDoctor("Male", "John Carter", 29, "555-4001", "LIC-ST-001", 30, 20, "Internal Medicine");
        StudentDoctor student2 = new StudentDoctor("Female", "Sofia Turner", 26, "555-4002", "LIC-ST-002", 28, 24, "Pediatrics");

        ArrayList<Characters> characters = new ArrayList<>();
        characters.add(consultation1);
        characters.add(consultation2);
        characters.add(ambulance1);
        characters.add(ambulance2);
        characters.add(specialist1);
        characters.add(specialist2);
        characters.add(student1);
        characters.add(student2);

        System.out.println("=== HOSPITAL SYSTEM - PRINT DETAILS ===");
        for (Characters c : characters) {
            c.printDetails();
            System.out.println("------------------------------");
        }

        System.out.println("=== CONSULTATION PATIENT FLOW ===");
        consultation1.admission();
        consultation1.nurseCheck();
        consultation1.room();
        consultation1.treatment();
        consultation1.nextAppointment();
        consultation1.discharge();

        System.out.println("=== AMBULANCE PATIENT FLOW ===");
        ambulance1.admission();
        ambulance1.operation();
        ambulance1.room();
        ambulance1.treatment();
        ambulance1.rehabilitation();
        ambulance1.discharge();

        System.out.println("=== DOCTOR ACTIONS ===");
        specialist1.eat();
        specialist1.vacation();
        student1.eat();
    }
}
