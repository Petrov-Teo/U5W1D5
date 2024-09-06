package PetrovTodor.Gestione_prenotazioni20.entities.repository;

import PetrovTodor.Gestione_prenotazioni20.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryEdificio extends JpaRepository<Edificio, UUID> {

}
