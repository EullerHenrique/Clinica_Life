package spring.clinica_life.controllers.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.clinica_life.models.NewAdressAux;
import spring.clinica_life.services.new_adress_aux.NewAdressAuxService;

import java.util.Optional;

@RestController
public class NewAdressAuxRestController {

    @Autowired
    NewAdressAuxService newAdressAuxService;

    @GetMapping("/new_adress_aux/{cep}")
    //@ApiOperation(value = "Retorna um endereço")
    public ResponseEntity getNewAdresAuxById(@PathVariable(value = "cep") String id) {

        Optional<NewAdressAux> adress = newAdressAuxService.findById(id);
        if(adress.isPresent()){
            return new ResponseEntity<>(adress, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(adress, HttpStatus.BAD_REQUEST);
        }

    }
}
