package tn.esprit.applicationvente.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCategorie;
    private String codeCategorie;
    private String nomCategorie;

    @ManyToMany(mappedBy = "categories")
    private List<Evenement> evenements;

}
