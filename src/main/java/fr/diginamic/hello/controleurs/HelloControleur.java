package fr.diginamic.hello.controleurs;


import fr.diginamic.hello.entities.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // c'est un contrôleur
@RequestMapping("/hello")       // je mappe la classe sur l'URL /hello
public class HelloControleur {
    HelloService helloService;

    public HelloControleur(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping     // intercepte les requêtes de type GET sur ce mapping
    public String direHello(){
        return helloService.salutations();
    }
}
