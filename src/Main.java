import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Min Suga", "suga@mail.com");
        myDoctor.setSpeciality("General");
        myDoctor.setPhoneNumber("3014568952");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        System.out.println(myDoctor);
        /*
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        System.out.println();
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Victor", "victor@mail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("3057461180");

        System.out.println(patient);

        

    }


}
