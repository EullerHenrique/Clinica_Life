package spring.clinica_life.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.clinica_life.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
