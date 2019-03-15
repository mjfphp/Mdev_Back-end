package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.business.AuthentificationBuisnessJPA;

@RestController

@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/users")
public class AuthentificationController {
    private AuthentificationBuisnessJPA authentificationBuisness;
   @Autowired
   public AuthentificationController(AuthentificationBuisnessJPA business) {
       this.authentificationBuisness = business;
   }
   @GetMapping("/all")
   public List<Authentification> recupererTousLesusers(){
       return authentificationBuisness.recupererTousLesusers();
   }
   @GetMapping("/email/{em:.+}")
public Authentification SearchByEmail(@PathVariable("em") String em) {
       System.out.println(em);
       return authentificationBuisness.SearchByEmail(em);
   }

}
