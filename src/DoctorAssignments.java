import java.util.*;
public class DoctorAssignments {
    // Create a table to store doctors
    private HashMap<Integer, Doctor> doctors;
    public DoctorAssignments() {
        doctors = new HashMap<>();
    }
    // Add a new doctor to the table
    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.id, doctor);
    }
    public Doctor getDoctor(int did) {
        return doctors.get(did);
    }
    // Print all assigned doctors
    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors in the HashMap.");
            return;
        }
        for (Doctor doctor : doctors.values()) {
            System.out.println(doctor.toString());
        }
    }
}
