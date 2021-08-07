package spring.clinica_life.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.clinica_life.models.Doctor;
import spring.clinica_life.services.doctor.DoctorService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping(value="/new_doctor", method = RequestMethod.GET)
    public String getDoctors(){

        return "new_doctor";

    }

    @RequestMapping(value = "/new_doctor", method = RequestMethod.POST)
    public String saveDoctors(@Valid Doctor doctor, BindingResult result, RedirectAttributes attributes){

        doctorService.save(doctor);

        return "redirect:/new_doctor";
    }

}
