package spring.clinica_life.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.clinica_life.models.Schedule;
import spring.clinica_life.services.doctor.DoctorService;
import spring.clinica_life.services.schedule.ScheduleService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @Autowired
    DoctorService doctorService;

    @RequestMapping(value="/schedule", method = RequestMethod.GET)
    public ModelAndView getScheduling(){

        ModelAndView mv = new ModelAndView("schedule");
        List<String> esps = doctorService.findDistinctByEspecialidade();
        mv.addObject("esps", esps);

        return mv;

    }


    @RequestMapping(value = "/schedule", method = RequestMethod.POST)
    public String saveSchedule(@Valid Schedule schedule, BindingResult result, RedirectAttributes attributes){

        System.out.println(schedule.toString());

        scheduleService.save(schedule);

        return "redirect:/schedule";
    }


}