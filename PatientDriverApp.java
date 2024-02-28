/*
 * Class: CMSC203 32038
 * Instructor: Prof. Tanveer
 * Description: This project is like a computer system for 
                keeping track of information about patients 
                and medical procedures. The patient part has details 
                like names and addresses, and the procedure part stores 
                information about the medical tests or treatments a 
                patient gets. The main program, called PatientDriverApp, 
                puts everything together, creating records for patients 
                and procedures, showing their details, and calculating 
                the total cost of all the medical procedures. The goal 
                is to make it easy to organize and manage medical 
                information using a computer.
 * Due: 02/27/2024
 * Platform/compiler: VS Code
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _____Yesho Vir____
*/

public class PatientDriverApp {
    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
    public static void main(String[] args) {

        Patient patient = new Patient("Jason", "Rottenborn", "Smith",
                "5501 Lake-Shore Dr", "Chicago", "IL", "12345",
                "240-123-4567", "Max Frosty", "202-987-6543");

        Procedure procedure1 = new Procedure("Physical Exam", "02/27/2024", "Dr. Irvine", 3250.0);
        Procedure procedure2 = new Procedure("X-Ray", "02/27/2024", "Dr. Jamison", 5500.43);
        Procedure procedure3 = new Procedure("Blood Test", "02/27/2024", "Dr. Smith", 1400.75);

        displayPatient(patient);

        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges for all procedures: $%.2f%n", totalCharges);

        System.out.print("\nStudent Name: Yesho Vir \n");
        System.out.print("MC#: M21181026\n");
        System.out.print("Due Date: 02/27/2024\n");

    }

}

