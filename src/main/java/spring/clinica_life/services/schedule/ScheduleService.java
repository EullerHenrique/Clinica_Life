package spring.clinica_life.services.schedule;
import spring.clinica_life.models.Schedule;
import java.util.List;

public interface ScheduleService {

    List<Schedule> findAll();
    List<Schedule> findByDoctor(Long id_doctor);
    Schedule save(Schedule schedule);

}
