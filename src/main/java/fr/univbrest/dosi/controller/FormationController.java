package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.business.FormationBusiness;

@RestController
@RequestMapping("/formations")
public class FormationController {

	@Autowired
	private FormationBusiness formationBusiness;

	// method to get All Formations
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> GetAllFormations() {
		return formationBusiness.GetAllFormations();
	}

	// method to get Formation By id
	@RequestMapping(value = "/{idFormation}", method = RequestMethod.GET)
	public Formation SearchFormationById(@PathVariable String idFormation) {
		return formationBusiness.SearchFormationById(idFormation);
	}
	
	// method to add Formation
		@RequestMapping(method = RequestMethod.POST)
		public Formation AddFormation(@RequestBody Formation formation) {
			return formationBusiness.AddFormation(formation);
		}
	// method to get All Promotions of Formation By idFormation
	@RequestMapping(value = "{idFormation}/promotions", method = RequestMethod.GET)
	public List<Promotion> PromotionByFormation(@PathVariable String idFormation) {
		return formationBusiness.PromotionByFormation(idFormation);
	}
	
}
