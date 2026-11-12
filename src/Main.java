import java.util.*;
public class Main {
    public static void main(String[] gargs) {
        PatientRecords patientRecords = new PatientRecords();
        System.out.println("Testing Patient Records...");
        Patient p1 = new Patient(101, "Ghadi", 21, "00000000001");
        Patient p2 = new Patient(102, "Joud", 20, "00000000002");
        patientRecords.addPatient(p1);
        patientRecords.addPatient(p2);
        patientRecords.displayPatients();
        System.out.println("\nTesting Emergency Queue...");
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        emergencyQueue.addPatient(p1, 3);
        emergencyQueue.addPatient(p2, 1);
        System.out.println("Treating Patient: " + emergencyQueue.treatPatient().name);
        System.out.println("\nTesting Treatment History...");
        TreatmentHistory history = new TreatmentHistory();
        history.addTreatment("Amoxicillin 500mg");
        history.addTreatment("Panadol Extra");
        history.addTreatment("Vitamin D3");
        history.displayHistory();
        System.out.println("\nLast Treatment: " + history.getLastTreatment());
        System.out.println("\nTesting Doctor Assignments...");
        DoctorAssignments doctorAssignments = new DoctorAssignments();
        doctorAssignments.addDoctor(new Doctor(201, "Dr. Rana", "Psychiatry", "8AM-6PM"));
        doctorAssignments.addDoctor(new Doctor(202, "Dr. Sahar", "Neurology", "11AM-8PM"));
        doctorAssignments.displayDoctors();
    }
}
