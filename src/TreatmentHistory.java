import java.util.*;
public class TreatmentHistory {
    private Stack<String> treatments;
    public TreatmentHistory() {
        // Create the stack for treatments
        treatments = new Stack<>();
    }
    public void addTreatment(String treatment) {
        // Add a new treatment to the history
        treatments.push(treatment);
    }
    public String getLastTreatment() {
        if (treatments.isEmpty()) {
            return "No treatments recorded.";
        }
        return treatments.peek();
    }
    public void displayHistory() {
        // Show the treatment history
        System.out.print("Treatment History: "+treatments);
    }
}
