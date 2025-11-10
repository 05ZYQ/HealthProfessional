/**
 * Base class for health professionals, encapsulating common attributes and behaviors of all health practitioners
 */
public class HealthProfessional {
    // Required instance variables
    private int id;          // ID (numbers only)
    private String name;     // Name
    // Additional related instance variable: specialty (common to all health practitioners)
    private String specialty;

    // Default constructor
    public HealthProfessional() {}

    // Constructor to initialize all instance variables
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    // Getter and Setter methods (for subclasses to access and modify parent class attributes)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}