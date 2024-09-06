package PetrovTodor.Gestione_prenotazioni20.entities.enums;

import PetrovTodor.Gestione_prenotazioni20.entities.Postazione;
import PetrovTodor.Gestione_prenotazioni20.entities.Utente;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
public class Prenotazioni {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private LocalDate dataPrenotazione;
    private LocalDateTime dataFinePrenotazione;

    @ManyToMany
    @JoinTable(
            name = "prenotazione_postazione",
            joinColumns = @JoinColumn(name = "prenotazione_id"),
            inverseJoinColumns = @JoinColumn(name = "postazione_id")
    )
    private List<Postazione> postazioni = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "prenotazione_utente",
            joinColumns = @JoinColumn(name = "prenotazione_id"),
            inverseJoinColumns = @JoinColumn(name = "utente_id")
    )
    private List<Utente> utenti = new ArrayList<>();

    // Costruttore vuoto
    public Prenotazioni() {
    }

    // Costruttore con parametri
    public Prenotazioni(String dataPrenotazione, LocalDate dataFinePrenotazione, List<Postazione> postazioni, List<Utente> utenti) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataPrenotazione = LocalDate.parse(dataPrenotazione, formatter);
        this.dataFinePrenotazione = this.dataPrenotazione.plusDays(1).atStartOfDay();
        this.postazioni = postazioni;
        this.utenti = utenti;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                ", dataFinePrenotazione=" + dataFinePrenotazione +
                ", postazioni=" + postazioni +
                ", utenti=" + utenti +
                '}';
    }
}