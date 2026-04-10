import java.util.Scanner;

public class ClinicSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Clinic Prescription Record System");

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Prescription: ");
        String prescription = sc.nextLine();

        System.out.println("\nPatient Record");
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Prescription: " + prescription);
    }
}