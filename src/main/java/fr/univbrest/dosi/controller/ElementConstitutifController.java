package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.ElementConstitutifBusiness;

@CrossOrigin
@RestController
@RequestMapping("/ElementConstitutif")
public class ElementConstitutifController {
	
	ElementConstitutifBusiness business;

	@Autowired
	public ElementConstitutifController(ElementConstitutifBusiness business) {
		
		this.business = business;
	}
	
	// Get All Unite Enseignement
			@RequestMapping(method = RequestMethod.GET, value = "/{noEnseignant}/{codeFormation}/{codeUE}")
			public List<ElementConstitutif> GetAllElementConstitutif(
					@PathVariable("noEnseignant") Integer noEnseignant, @PathVariable("codeFormation") String codeFormation, @PathVariable("codeUE") String codeUE) {
				return business.GetAllElementConstitutifForEnseignantCodeUEAndCodeFormation(noEnseignant, codeFormation, codeUE);
			}
		

}
