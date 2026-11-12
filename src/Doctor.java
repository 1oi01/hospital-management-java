import java.util.*;
public class Doctor {
    //Variables to store doctor info
    int id;
    String name;
    String department;
    String schedule;
    // Constructor to set doctor details
    public Doctor(int did, String dname, String department, String schedule) {
        this.id = did;
        this.name = dname;
        this.department = department;
        this.schedule = schedule;
    }
    // Format doctor info as a string
    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name +
        ", Department: " + department + ", Schedule: " + schedule;
    }
}
