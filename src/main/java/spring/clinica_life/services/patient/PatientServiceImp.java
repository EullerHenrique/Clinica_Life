package spring.clinica_life.services.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.clinica_life.models.Patient;
import spring.clinica_life.repositories.PatientRepository;

import java.util.List;

@Service
public class PatientServiceImp implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);

    }

}
