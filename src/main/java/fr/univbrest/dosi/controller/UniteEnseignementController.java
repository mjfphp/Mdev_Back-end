package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.UniteEnseignementBusiness;

@CrossOrigin
@RestController
@RequestMapping("/UniteEnseignement")
public class UniteEnseignementController {

	UniteEnseignementBusiness business;

	@Autowired
	public UniteEnseignementController(UniteEnseignementBusiness business) {
		this.business = business;
	}
	
	
	// Get All Unite Enseignement
		@RequestMapping(method = RequestMethod.GET, value = "/{noEnseignant}/{codeFormation}")
		public List<UniteEnseignement> GetAllUniteEnseignement(
				@PathVariable("noEnseignant") Integer noEnseignant, @PathVariable("codeFormation") String codeFormation) {
			return business.GetAllUniteEnseignementForEnseignantAndCodeFormation(noEnseignant, codeFormation);
		}
	
}
