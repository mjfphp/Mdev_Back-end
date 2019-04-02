package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.repository.AuthentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthentificationBusinessJPA {
    	
        AuthentificationRepository authentificationRepository;
        
        @Autowired
        public AuthentificationBusinessJPA(AuthentificationRepository repos) {
            this.authentificationRepository = repos;
        }
        
        public List<Authentification> recupererTousLesusers() {
            return (List<Authentification>) authentificationRepository.findAll();
        }
        
        public Authentification SearchByEmail(String email) {
            List<Authentification> liste = authentificationRepository.findAll();
            return liste.stream().filter(t -> t.getLoginConnection().equals(email)).findFirst().get();
        }
        
}