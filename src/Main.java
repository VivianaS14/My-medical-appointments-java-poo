import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Alejandro Rodriguez");
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorMin = new Doctor("Minnie");
        myDoctorMin.showName();
        myDoctorMin.showId();
    }
}
