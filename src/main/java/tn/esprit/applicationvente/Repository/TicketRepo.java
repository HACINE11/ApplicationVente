package tn.esprit.applicationvente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.applicationvente.entite.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Long> {
}
