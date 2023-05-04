import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;
import ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        UIMenu.showMenu();

        //Doctor myDoctor = new Doctor("Min Suga", "suga@mail.com");
        //myDoctor.setSpeciality("General");
        //myDoctor.setPhoneNumber("3014568952");
        //myDoctor.addAvailableAppointment(new Date(), "4pm");
        //myDoctor.addAvailableAppointment(new Date(), "10pm");
        //myDoctor.addAvailableAppointment(new Date(), "8pm");

        //System.out.println(myDoctor);
        //myDoctor.showDataUser();

        /*
        //Clase anonima
        User user1 = new User("Ana", "ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Azul");
                System.out.println("Departamento: Oncologia");
            }
        };

        user1.showDataUser();
        */
        


        /*
        for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        /*
        System.out.println();
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Victor", "victor@mail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("3057461180");

        System.out.println(patient);
        patient.showDataUser();
        */

        

    }


}
