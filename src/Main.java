import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Min Suga", "General");

        Patient patient = new Patient("Victor", "victor@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("3057461180");
        System.out.println(patient.getPhoneNumber());

    }


}
