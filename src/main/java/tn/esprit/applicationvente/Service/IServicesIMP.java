package tn.esprit.applicationvente.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.applicationvente.Repository.EvenementRepo;
import tn.esprit.applicationvente.Repository.InternauteRepo;
import tn.esprit.applicationvente.entite.Evenement;
import tn.esprit.applicationvente.entite.Internaute;

@Slf4j
@Service
@AllArgsConstructor
public class IServicesIMP implements IServices{

    private InternauteRepo internauteRepo;
    private EvenementRepo evenementRepo;

    @Override
    public Internaute ajouterInternaute(Internaute internaute) {
        return internauteRepo.save(internaute);
    }

    @Override
    public Evenement ajouterEvenement(Evenement evenement) {
        return evenementRepo.save(evenement);
    }
}
