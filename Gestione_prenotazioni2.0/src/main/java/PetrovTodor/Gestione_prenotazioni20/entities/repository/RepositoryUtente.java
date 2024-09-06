package PetrovTodor.Gestione_prenotazioni20.entities.repository;

import PetrovTodor.Gestione_prenotazioni20.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryUtente extends JpaRepository<Utente, UUID> {
}
