package spring.clinica_life.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.clinica_life.models.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
