package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu () {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Agregar citas disponibles");
            System.out.println("2. Mi agenda de citas");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    showDoctorMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu () {
          int response = 0;
          do {
              System.out.println(":: Agregar Citas Disponibles");
              System.out.println(":: Selecciona un mes");

              for (int i = 0; i < 3; i++) {
                  int j = i + 1;
                  System.out.println(j + ". " + UIMenu.MONTHS[i]);
              }
              System.out.println("0. Regresar");

              Scanner sc = new Scanner(System.in);
              response = Integer.valueOf(sc.nextLine());

              if (response > 0 && response < 4) {
                  // 1,2,3
                  int monthSelected = response;
                  System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);

                  System.out.println("Ingrese la fecha disponile: [dd/mm/yyyy]");
                  String date = sc.nextLine();

                  System.out.println("Tu fecha es: " + date + "\n1. Correcto \n2. Cambiar fecha");
                  int responseDate = Integer.valueOf(sc.nextLine());
                  // continue -> vuelve a iniciar
                  if (responseDate == 2) continue;

                  int responseTime = 0;
                  String time = "";
                  do {
                      System.out.println("Ingresa la hora disponible para esta fecha: " + date + "[16:00]");
                      time = sc.nextLine();
                      System.out.println("La hora es: " + time + "\n1. Correcto \n2. Cambiar Hora");
                      responseTime = Integer.valueOf(sc.nextLine());
                  } while (responseTime == 2);

                  UIMenu.doctorLogged.addAvailableAppointment(date, time);

                  checkDoctorAvailableAppointments(UIMenu.doctorLogged);

              } else if (response == 0) {
                  showDoctorMenu();
              }

          } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments (Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }

    private static void showDoctorMyAppointments () {
        int response = 0;
        do {
            System.out.println("::My available appointments");
            if (UIMenu.doctorLogged.getAvailableAppointments().size() == 0) {
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.doctorLogged.getAvailableAppointments().size(); i++) {
                int j = i+1;
                System.out.println(j + ". " + UIMenu.doctorLogged.getAvailableAppointments().get(i).getDate()
                        + " \nTime: " + UIMenu.doctorLogged.getAvailableAppointments().get(i).getTime());
            }
        } while (response != 0);
    }
}
