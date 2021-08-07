package spring.clinica_life.services.new_adress_aux;
import spring.clinica_life.models.NewAdressAux;
import java.util.List;
import java.util.Optional;

public interface NewAdressAuxService {

    Optional<NewAdressAux> findById(String id);
    List<NewAdressAux> findAll();
    NewAdressAux save(NewAdressAux newAdressAux);

}
