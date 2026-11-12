import java.util.*;
public class PatientRecords {
    private Patient first;
    public PatientRecords() {
        first = null;
    }
    public void addPatient(Patient p) {
        Patient newPatient = p;
        if (first == null)
        {
            first = p;
        }
        else
        {
            Patient current = first;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = p;
        }
    }
    public void updatePatient(int id, String name, int age, String contact) {
        Patient current = first;
        while (current != null) {
            if (current.id == id) {
                current.name = name;
                current.age = age;
                current.contact = contact;
                System.out.println("Patient has been modified.");
                return;
            }
            current = current.next;
        }
        System.out.println("Patient with ID " + id + " is unavailable.");
    }
    public void removePatient(Patient p) {
        Patient current = first;
        Patient previous = null;
        if (current != null && current.id == p.id) {
            first = current.next; // Changed head
            System.out.println("Patient with ID " + p.id + " has been deleted.");
            return;
        }
        while (current != null && current.id != p.id) {
            previous = current;
            current = current.next;
        }
        if (current == null)
        {
            System.out.println("Patient with ID " + p.id + " is unavailable.");
            return;
        }
        previous.next = current.next;
        System.out.println("Patient with ID " + p.id + " has been deleted.");
    }
    public void displayPatients() {
        Patient current = first;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
}
