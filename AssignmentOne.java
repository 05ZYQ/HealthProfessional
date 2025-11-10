import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the assignment, containing the program entry method and all business logic
 */
public class AssignmentOne {
    // Collection to store appointment information
    private static List<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("===== Part 3: Creation and Display of Health Professional Objects =====");
        // Create 3 General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1001, "Zhang San", "General Medicine", 20);
        GeneralPractitioner gp2 = new GeneralPractitioner(1002, "Li Si", "General Medicine", 18);
        GeneralPractitioner gp3 = new GeneralPractitioner(1003, "Wang Wu", "General Medicine", 25);

        // Create 2 Cardiologist objects
        Cardiologist cardio1 = new Cardiologist(2001, "Zhao Liu", "Cardiovascular Diseases", "Coronary Heart Disease Treatment");
        Cardiologist cardio2 = new Cardiologist(2002, "Sun Qi", "Cardiovascular Diseases", "Arrhythmia Treatment");

        // Print details of all health professionals
        gp1.printDoctorDetails();
        System.out.println();
        gp2.printDoctorDetails();
        System.out.println();
        gp3.printDoctorDetails();
        System.out.println();
        cardio1.printDoctorDetails();
        System.out.println();
        cardio2.printDoctorDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("===== Part 5: Appointment Management System =====");
        // Create 2 General Practitioner appointments
        createAppointment("Xiao Ming", "13800138001", "08:30", gp1);
        createAppointment("Xiao Hong", "13800138002", "10:00", gp2);

        // Create 2 Cardiologist appointments
        createAppointment("Xiao Gang", "13800138003", "14:30", cardio1);
        createAppointment("Xiao Li", "13800138004", "16:00", cardio2);

        // Print all appointments
        System.out.println("\n[All Appointment Information]");
        printExistingAppointments();

        // Cancel an appointment (by phone number)
        System.out.println("\n[Appointment Cancellation Operation]");
        cancelBooking("13800138002");

        // Print appointments again (to show updated data)
        System.out.println("\n[Appointment Information After Cancellation]");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    /**
     * Create an appointment and add it to the collection (polymorphism support: can handle any HealthProfessional subclass object)
     * @param patientName Patient's name
     * @param patientPhone Patient's phone number
     * @param timeSlot Appointment time slot
     * @param doctor Treating doctor (General Practitioner or Cardiologist)
     */
    public static void createAppointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        // Validate required information (cannot create appointment if empty)
        if (patientName == null || patientName.isEmpty() ||
                patientPhone == null || patientPhone.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Failed to create appointment: All information is required!");
            return;
        }

        // Create appointment object and add to collection
        Appointment appointment = new Appointment(patientName, patientPhone, timeSlot, doctor);
        appointmentList.add(appointment);
        System.out.println("Appointment created successfully! Patient: " + patientName + ", Time slot: " + timeSlot);
    }

    /**
     * Print all existing appointments
     */
    public static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointment records currently!");
            return;
        }

        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("\n[" + (i + 1) + "]");
            appointmentList.get(i).printAppointmentDetails();
        }
    }

    /**
     * Cancel an appointment by patient's phone number
     * @param patientPhone Patient's phone number
     */
    public static void cancelBooking(String patientPhone) {
        boolean removed = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            Appointment appointment = appointmentList.get(i);
            if (appointment.getPatientPhone().equals(patientPhone)) {
                appointmentList.remove(i);
                removed = true;
                System.out.println("Appointment cancelled successfully! Patient phone number: " + patientPhone);
                break;
            }
        }

        if (!removed) {
            System.out.println("Cancellation failed: No appointment record found with phone number " + patientPhone + "!");
        }
    }
}