package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusiness;


@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/etudiants")
public class EtudiantController {
	
	private EtudiantBusiness etudiantBusiness;

	
	@Autowired
	public EtudiantController(EtudiantBusiness business) {
		this.etudiantBusiness = business;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Etudiant> recupererTousLesEtudiants(){
		return etudiantBusiness.recupererTousLesEtudiants();
	}
}
