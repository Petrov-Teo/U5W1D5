package PetrovTodor.Gestione_prenotazioni20.entities.repository;

import PetrovTodor.Gestione_prenotazioni20.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryPostazione extends JpaRepository<Postazione, UUID> {

}
