/**
 * Appointment class, encapsulating patient appointment information
 */
public class Appointment {
    // Patient information
    private String patientName;    // Patient's name
    private String patientPhone;   // Patient's phone number
    // Appointment information
    private String timeSlot;       // Appointment time slot
    // Treating doctor (polymorphism: can accept GeneralPractitioner or Cardiologist objects)
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {}

    // Constructor to initialize all instance variables
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Print all appointment information
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Appointment Time Slot: " + timeSlot);
        System.out.println("Treating Doctor Information:");
        // Polymorphic call: execute the corresponding subclass's print method based on doctor type
        if (doctor instanceof GeneralPractitioner) {
            ((GeneralPractitioner) doctor).printDoctorDetails();
        } else if (doctor instanceof Cardiologist) {
            ((Cardiologist) doctor).printDoctorDetails();
        } else {
            doctor.printDetails();
        }
    }

    // Getter method (used to query phone number when canceling appointment)
    public String getPatientPhone() {
        return patientPhone;
    }
}
