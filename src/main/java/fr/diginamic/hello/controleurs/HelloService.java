package fr.diginamic.hello.controleurs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service // Spécialisation de @Component
public class HelloService {
    public String salutations(){
        return "Je suis la classe de service et je vous dis Bonjour";
    }
}
