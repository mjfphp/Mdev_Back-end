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
        
        // fonction qui retourne tous les utilisateurs
        public List<Authentification> recupererTousLesusers() {
            return (List<Authentification>) authentificationRepository.findAll();
        }
        
        // fonction qui retourne l'utilisateur par email ou pseaudo
        public Authentification SearchByEmail(String email) throws Exception {
        	Authentification user = authentificationRepository.findByLoginConnection(email);
        	System.out.println(user);
        	if(user==null) {
        		 user = authentificationRepository.findByPseudoConnection(email);
        	System.out.println("1 : "+user);}
        	if(user!=null) {System.out.println("1 : "+user);return user;}
        	else
        		return new Authentification();
        }
        
}
