package spring.clinica_life.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.clinica_life.models.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByEspecialidade(String esp);

    Optional<Doctor> findById(Long id_doctor);

    @Query(value = "SELECT DISTINCT d.especialidade FROM Doctor d", nativeQuery = true)
    List<String> findDistinctByEspecialidade();

}
