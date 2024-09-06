package PetrovTodor.Gestione_prenotazioni20.entities.services;

import PetrovTodor.Gestione_prenotazioni20.entities.repository.RepositoryPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    private RepositoryPostazione repositoryPostazione;

}
