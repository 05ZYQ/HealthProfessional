/**
 * General Practitioner subclass, inheriting from HealthProfessional
 * Added unique attribute: daily patient limit (general practitioners usually have a daily limit on the number of patients)
 */
public class GeneralPractitioner extends HealthProfessional {
    // Unique instance variable: daily patient limit
    private int dailyPatientLimit;

    // Default constructor
    public GeneralPractitioner() {}

    // Constructor to initialize all instance variables (including parent class attributes)
    public GeneralPractitioner(int id, String name, String specialty, int dailyPatientLimit) {
        super(id, name, specialty); // Call parent class constructor
        this.dailyPatientLimit = dailyPatientLimit;
    }

    // Print doctor details (including type and all attributes)
    public void printDoctorDetails() {
        System.out.println("=== General Practitioner Details ===");
        super.printDetails(); // Call parent class method to print common attributes
        System.out.println("Daily Patient Limit: " + dailyPatientLimit);
    }

    // Getter and Setter methods
    public int getDailyPatientLimit() {
        return dailyPatientLimit;
    }

    public void setDailyPatientLimit(int dailyPatientLimit) {
        this.dailyPatientLimit = dailyPatientLimit;
    }
}
