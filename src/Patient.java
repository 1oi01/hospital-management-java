import java.util.*;
public class Patient implements Comparable<Patient> {
    int id;
    String name;
    int age;
    String contact;
    LinkedList<String> medicalHistory;
    int severity;
    Patient next;
    public Patient(int id, String name, int age, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        next = null;
        medicalHistory = new LinkedList<>();
    }
    public void addMedicalHistory(String str){
        medicalHistory.add(str); //We add the string to the linked list
    }
    @Override
    public int compareTo(Patient p) {
        return this.severity-p.severity;
    }
    @Override
    public String toString(){
        return "ID: " + id +", Name: " + name+", Age: " + age +", Contact: " +
        contact
        +"\nMedical History: "+medicalHistory;
    }
}
