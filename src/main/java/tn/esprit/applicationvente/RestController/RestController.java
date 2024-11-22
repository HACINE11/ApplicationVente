package tn.esprit.applicationvente.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.applicationvente.Service.IServices;
import tn.esprit.applicationvente.entite.Evenement;
import tn.esprit.applicationvente.entite.Internaute;

@Slf4j
@AllArgsConstructor
@org.springframework.web.bind.annotation.RestController

public class RestController {

    private IServices iServices;


    @PostMapping("/ajouterInternaute")
    public Internaute ajouterInternaute(@RequestBody Internaute i) {
        return iServices.ajouterInternaute(i);
    }

    @PostMapping("/ajouterEvenement")
    public Evenement ajouterEvenement(@RequestBody Evenement e) {
        return iServices.ajouterEvenement(e);
    }


}
