package tn.esprit.applicationvente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.applicationvente.entite.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {
}
