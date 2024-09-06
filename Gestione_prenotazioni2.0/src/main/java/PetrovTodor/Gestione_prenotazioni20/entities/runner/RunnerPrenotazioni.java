package PetrovTodor.Gestione_prenotazioni20.entities.runner;

import PetrovTodor.Gestione_prenotazioni20.entities.Edificio;
import PetrovTodor.Gestione_prenotazioni20.entities.Utente;
import PetrovTodor.Gestione_prenotazioni20.entities.services.EdificioService;
import PetrovTodor.Gestione_prenotazioni20.entities.services.PostazioneService;
import PetrovTodor.Gestione_prenotazioni20.entities.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerPrenotazioni implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        //____________________________________\\ SALVA EDIFICI //______________________________________\\
        Edificio edificioMadama = new Edificio("Madama", "Via Roma 23", "Roma");
//        edificioService.saveEdificio(edificioMadama);

        //____________________________________\\ SALVA UTENTI //______________________________________\\
        Utente utente1 = new Utente("pino", "Pino", "pino@daniele.it");
        utenteService.saveUtente(utente1);
    }
}