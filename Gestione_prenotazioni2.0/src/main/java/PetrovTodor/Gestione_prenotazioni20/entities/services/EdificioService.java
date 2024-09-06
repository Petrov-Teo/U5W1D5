package PetrovTodor.Gestione_prenotazioni20.entities.services;

import PetrovTodor.Gestione_prenotazioni20.entities.Edificio;
import PetrovTodor.Gestione_prenotazioni20.entities.repository.RepositoryEdificio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EdificioService {
    private static final Logger log = LoggerFactory.getLogger(EdificioService.class);
    @Autowired
    private RepositoryEdificio repositoryEdificio;

    public void saveEdificio(Edificio edificio) {
        repositoryEdificio.save(edificio);
        log.info("Salvataggio effettuato correttamente!");
    }
}
