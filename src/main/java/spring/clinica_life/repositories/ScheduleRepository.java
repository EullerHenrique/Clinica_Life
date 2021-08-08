package spring.clinica_life.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.clinica_life.models.Schedule;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findById_doctor(Long id_doctor);

}
