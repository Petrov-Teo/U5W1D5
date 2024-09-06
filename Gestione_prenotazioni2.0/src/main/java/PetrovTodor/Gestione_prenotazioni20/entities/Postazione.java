package PetrovTodor.Gestione_prenotazioni20.entities;


import PetrovTodor.Gestione_prenotazioni20.entities.enums.Prenotazioni;
import PetrovTodor.Gestione_prenotazioni20.entities.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Postazioni")
@Getter
@Setter
public class Postazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private int occupanti;

    @ManyToOne
    @JoinColumn(name = "Edifizio_id")
    private Edificio edificio;

    @ManyToMany(mappedBy = "postazioni")
    private List<Prenotazioni> prenotazioni;

    public Postazione() {
    }

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int occupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.occupanti = occupanti;
        this.edificio = edificio;
        this.prenotazioni = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", occupanti=" + occupanti +
                ", edificio=" + edificio +
                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
