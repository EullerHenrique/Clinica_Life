package spring.clinica_life.services.patient;
import spring.clinica_life.models.Patient;
import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    Patient save(Patient patient);

}