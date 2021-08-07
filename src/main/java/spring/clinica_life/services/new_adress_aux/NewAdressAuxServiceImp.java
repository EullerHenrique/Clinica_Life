package spring.clinica_life.services.new_adress_aux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.clinica_life.models.NewAdressAux;
import spring.clinica_life.repositories.NewAdressAuxRepository;

import java.util.List;
import java.util.Optional;


@Service
public class NewAdressAuxServiceImp implements NewAdressAuxService{

    @Autowired
    private NewAdressAuxRepository newAdressAuxRepository;

    @Override
    public Optional<NewAdressAux> findById(String id) {

        return newAdressAuxRepository.findById(id);

    }

    @Override
    public List<NewAdressAux> findAll() {
        return newAdressAuxRepository.findAll();
    }

    @Override
    public NewAdressAux save(NewAdressAux newAdressAux) {
        return newAdressAuxRepository.save(newAdressAux);
    }

}
