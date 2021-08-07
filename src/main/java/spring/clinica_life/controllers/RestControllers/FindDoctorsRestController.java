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

@RestController
public class FindDoctorsRestController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/find_doctors/{espMed}")
    //@ApiOperation(value = "Retorna um endereço")
    public ResponseEntity getNewAdresAuxById(@PathVariable(value = "espMed") String espMed) {

        List<Doctor> doctors = doctorService.findByEspecialidade(espMed);

        if(doctors != null){
            return new ResponseEntity<>(doctors, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(doctors, HttpStatus.BAD_REQUEST);
        }
    }

}

