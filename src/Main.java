import module.Doctor;
import module.Patient;
import module.Users;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       // Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
       // myDoctor.addAvailableAppointment(new Date(), "4pm");
        //myDoctor.addAvailableAppointment(new Date(), "10am");
        //myDoctor.addAvailableAppointment(new Date(), "1pm");

       // for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
          //  System.out.println(aA.getDate() + " " + aA.getTime());
       // }
        //System.out.print(myDoctor);


        //Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        //System.out.print(patient);
        Users nuevo = new Doctor("juan", "@giaml");
        nuevo.showDataUser();

    }
}