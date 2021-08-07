package spring.clinica_life.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.clinica_life.models.Employee;
import spring.clinica_life.services.employee.EmployeeService;

import javax.validation.Valid;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/new_employee", method = RequestMethod.GET)
    public String getScheduling(){

        return "new_employee";

    }

    @RequestMapping(value = "/new_employee", method = RequestMethod.POST)
    public String saveNewAdressAux(@Valid Employee employee, BindingResult result, RedirectAttributes attributes){

        employeeService.save(employee);

        return "redirect:/new_employee";
    }
}
