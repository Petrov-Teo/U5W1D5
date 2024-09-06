package PetrovTodor.Gestione_prenotazioni20.entities.services;

import PetrovTodor.Gestione_prenotazioni20.entities.Utente;
import PetrovTodor.Gestione_prenotazioni20.entities.repository.RepositoryUtente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    private static final Logger log = LoggerFactory.getLogger(UtenteService.class);

    @Autowired
    private RepositoryUtente repositoryUtente;

    public void saveUtente(Utente utente) {
        repositoryUtente.save(utente);
        log.info("Utente salvato correttamente: {}", utente);
    }
}