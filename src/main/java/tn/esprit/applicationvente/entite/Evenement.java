package tn.esprit.applicationvente.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEvenement;
    private String nomEvenement;
    private Long nbPlacesRestants;

    private LocalDate dateEvenement;

    @OneToMany(mappedBy = "evenement")
    private List<Ticket> tickets;

    @ManyToMany
    private List<Categorie> categories;


}
