/**
 * Cardiologist subclass, inheriting from HealthProfessional
 * Added unique attribute: area of expertise (e.g., coronary heart disease, arrhythmia, etc.)
 */
public class Cardiologist extends HealthProfessional {
    // Unique instance variable: area of expertise
    private String expertiseArea;

    // Default constructor
    public Cardiologist() {}

    // Constructor to initialize all instance variables (including parent class attributes)
    public Cardiologist(int id, String name, String specialty, String expertiseArea) {
        super(id, name, specialty); // Call parent class constructor
        this.expertiseArea = expertiseArea;
    }

    // Print doctor details (including type and all attributes)
    public void printDoctorDetails() {
        System.out.println("=== Cardiologist Details ===");
        super.printDetails(); // Call parent class method to print common attributes
        System.out.println("Area of Expertise: " + expertiseArea);
    }

    // Getter and Setter methods
    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }
}
