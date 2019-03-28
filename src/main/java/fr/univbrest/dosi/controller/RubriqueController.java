package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.business.RubriqueBusiness;

@RestController
@RequestMapping("/Rubriques")

public class RubriqueController {
	
	 RubriqueBusiness business;

	@Autowired
	public RubriqueController(RubriqueBusiness business) {
		this.business = business;
	}

	// fonction qui retourne la liste des rubriques
	@RequestMapping(method = RequestMethod.GET)
	public List<Rubrique> getAllQuestions() {
		return business.GetAllRubrique();
	}

}
