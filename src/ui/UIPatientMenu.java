package ui;

import java.util.Scanner;

public class UIPatientMenu {

    public static void showPatientMenu () {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Welcome Patient " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void showBookAppointmentMenu () {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
        } while (response != 0);
    }
}
