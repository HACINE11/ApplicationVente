package tn.esprit.applicationvente.Service;

import tn.esprit.applicationvente.entite.Evenement;
import tn.esprit.applicationvente.entite.Internaute;

public interface IServices {

    Internaute ajouterInternaute(Internaute internaute) ;
    Evenement ajouterEvenement(Evenement evenement);
}
