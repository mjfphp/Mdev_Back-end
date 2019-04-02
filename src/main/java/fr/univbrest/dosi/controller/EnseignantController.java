package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.business.EnseignantBusiness;

@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

	
	private EnseignantBusiness business;

	@Autowired
	public EnseignantController(EnseignantBusiness business) {
		this.business = business;
	}
	
	// fonction qui retourne tous les enseignants
	@RequestMapping(method = RequestMethod.GET , value="/getAllEnseignant" )
	public List<Enseignant> getAllEnseignant() {
		return business.getAllEnseignant();
	}

}