package fr.diginamic.hello.controleurs;

import fr.diginamic.hello.entities.Ville;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/villes")
public class VilleControleur {
    ArrayList<Ville> villes = new ArrayList<>();

    public VilleControleur() {
        this.villes.add(new Ville("Perpignan", 120000));
        this.villes.add(new Ville("Montpellier", 240000));
        this.villes.add(new Ville("Toulouse", 480000));
    }

    @GetMapping
    public List<Ville> getVilles(){
        return this.villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }
}
