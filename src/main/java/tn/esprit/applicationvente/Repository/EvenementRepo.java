package tn.esprit.applicationvente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.applicationvente.entite.Evenement;

public interface EvenementRepo extends JpaRepository<Evenement, Long> {
}
