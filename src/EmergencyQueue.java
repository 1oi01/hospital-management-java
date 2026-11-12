import java.util.*;
public class EmergencyQueue {
    private PriorityQueue<Patient> queue;
    public EmergencyQueue() {
        // Initialize the priority queue
        queue = new PriorityQueue<>();
    }
    public void addPatient(Patient patient, int severity) {
        // Set severity and add patient to the queue
        patient.severity = severity;
        queue.add(patient);
    }
    public Patient treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return null;
        }
        //Treat and remove the highest priority patient
        return queue.poll();
    }
    public void displayQueue() {
        for (Patient p : queue) {
            System.out.println("ID: " + p.id +", Name: " + p.name);
        }
    }
}
