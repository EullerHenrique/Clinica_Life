package spring.clinica_life.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.clinica_life.models.Patient;
import spring.clinica_life.services.patient.PatientService;

import javax.validation.Valid;

@Controller
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(value="/new_patient", method = RequestMethod.GET)
    public String getNewAdressAux(){
        return "new_patient";
    }


    @RequestMapping(value = "/new_patient", method = RequestMethod.POST)
    public String saveNewAdressAux(@Valid Patient patient, BindingResult result, RedirectAttributes attributes){

        patientService.save(patient);

        return "redirect:/new_patient";
    }


}
