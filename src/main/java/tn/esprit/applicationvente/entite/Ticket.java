package tn.esprit.applicationvente.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idTicket;
    private String codeTicket;
    private Double prixTicket;
    @Enumerated
    private TypeTicket typeTicket;

    @ManyToOne
    private Internaute internaute;

    @ManyToOne
    private Evenement evenement;


}
