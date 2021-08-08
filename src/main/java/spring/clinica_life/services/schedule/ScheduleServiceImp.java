package spring.clinica_life.services.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.clinica_life.models.Schedule;
import spring.clinica_life.repositories.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleServiceImp implements ScheduleService{

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public List<Schedule> findById_doctor(Long id_doctor) {
        return scheduleRepository.findById_doctor(id_doctor);
    }

    @Override
    public Schedule save(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }
}
