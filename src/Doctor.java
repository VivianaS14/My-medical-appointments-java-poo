public class Doctor {
    // Atributos de la clase Doctor
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    // Constructor
    Doctor(String name) {
        this.name = name;
        // id  es static por lo que su scope es global, valor del dato prevalece mas halla de la instansacion
        id++;
    }

    //Comportamientos
    public void showName() {
        System.out.println("Doctor: " + name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }
}
