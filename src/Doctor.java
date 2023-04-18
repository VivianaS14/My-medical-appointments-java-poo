import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos de la clase Doctor
    static int id = 0; // Autoincrement
    private String name;
    private String speciality;

    // Constructor
    Doctor(String name, String speciality) {
        // id  es static por lo que su scope es global, valor del dato prevalece mas halla de la instanciacion
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println("Doctor: " + name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Clase anidada
    public static class AvailableAppointment {
        // Avaiable appointment
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
