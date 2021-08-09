package spring.clinica_life.services.doctor;

import spring.clinica_life.models.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    List<Doctor> findAll();
    List<String> findDistinctByEspecialidade();
    List<Doctor> findByEspecialidade(String esp);
    Optional<Doctor> findById(Long id_doctor);
    Doctor save(Doctor doctor);

}


