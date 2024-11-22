package tn.esprit.applicationvente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.applicationvente.entite.Internaute;

public interface InternauteRepo extends JpaRepository<Internaute, Long> {
}
