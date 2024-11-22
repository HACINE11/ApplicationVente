package tn.esprit.applicationvente.entite;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString

public class Internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idInternaute;
    private Long identifiant;

    @Enumerated(EnumType.STRING)
    private TrancheAge trancheAge;

    @OneToMany(mappedBy = "internaute")
    private List<Ticket> tickets;




}
