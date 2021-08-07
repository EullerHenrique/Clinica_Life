package spring.clinica_life.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.clinica_life.models.NewAdressAux;
import spring.clinica_life.services.new_adress_aux.NewAdressAuxService;

import javax.validation.Valid;

@Controller
public class NewAdressAuxController {

    @Autowired
    NewAdressAuxService newAdressAuxService;

    @RequestMapping(value="/new_adress_aux", method = RequestMethod.GET)
    public String getNewAdressAux(){
        return "new_adress_aux";
    }


    @RequestMapping(value = "/new_adress_aux", method = RequestMethod.POST)
    public String saveNewAdressAux(@Valid NewAdressAux newAdressAux, BindingResult result, RedirectAttributes attributes){

        newAdressAuxService.save(newAdressAux);

        return "redirect:/new_adress_aux";
    }


}