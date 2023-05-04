package ui;
import model.Doctor;
import model.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS =  {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    // doctor que esta logeado
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        //Simulacion de datos
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Ramona Lalola", "ramona@mail.com"));
        patients.add(new Patient("Ana Minana", "minana@mail.com"));
        patients.add(new Patient("Carlos Sanchez", "carlos@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Ingresa tu email: [mail@mail.co]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            } else if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);
    }
}
