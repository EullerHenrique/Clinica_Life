package spring.clinica_life.controllers.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.clinica_life.models.Doctor;
import spring.clinica_life.services.doctor.DoctorService;
import java.util.List;
import java.util.Optional;

@RestController
public class FindSchedulesRestController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/find_schedules/{id_doctor}")
    //@ApiOperation(value = "Retorna um endereço")

    public ResponseEntity getSchedulesById_doctor(@PathVariable(value = "id_doctor")Long id_doctor) {

        Optional<Doctor> schedules = doctorService.findById(id_doctor);

        if(schedules.isPresent()){
            return new ResponseEntity<>(schedules, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(schedules, HttpStatus.BAD_REQUEST);
        }

    }

}
