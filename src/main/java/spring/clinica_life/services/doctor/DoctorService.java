package spring.clinica_life.services.doctor;

import spring.clinica_life.models.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> findAll();
    List<String> findDistinctByEspecialidade();
    List<Doctor> findByEspecialidade(String esp);
    Doctor save(Doctor doctor);
}


