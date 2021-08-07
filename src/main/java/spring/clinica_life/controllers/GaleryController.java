package spring.clinica_life.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GaleryController {

    @RequestMapping("/galery")
    public String getGalery(){

        return "galery";

    }
}
