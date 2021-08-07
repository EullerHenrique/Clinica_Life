package spring.clinica_life.services.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.clinica_life.models.Doctor;
import spring.clinica_life.repositories.DoctorRepository;
import java.util.List;

@Service
public class DoctorServiceImp implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {

        return doctorRepository.findAll();

    }

    @Override
    public List<String> findDistinctByEspecialidade() {
        return doctorRepository.findDistinctByEspecialidade();
    }

    @Override
    public List<Doctor> findByEspecialidade(String esp){
        return doctorRepository.findByEspecialidade(esp);
    }

    @Override
    public Doctor save(Doctor doctor) {

        return doctorRepository.save(doctor);

    }
}
