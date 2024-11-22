package fr.diginamic.hello.controleurs;

import fr.diginamic.hello.entities.Ville;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<String> ajouterVille(@RequestBody Ville nouvVille){
        for(Ville ville : this.villes){
            if(ville.getNom().equals(nouvVille.getNom())){
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .body("La ville existe déjà");
            }
        }
        this.villes.add(nouvVille);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Ville ajoutée avec succès");
    }
}
