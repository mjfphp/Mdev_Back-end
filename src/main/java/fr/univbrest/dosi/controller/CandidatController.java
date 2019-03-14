package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.business.CandidatBusiness;

@RestController
@CrossOrigin
@RequestMapping("/candidats")
public class CandidatController {
	private CandidatBusiness candidatBusiness;
	
	@Autowired
	public CandidatController(CandidatBusiness business) {
		this.candidatBusiness = business;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Candidat> recupererTousLesCandidat(){
		return candidatBusiness.recupererTousLesCandidats();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Candidat recupererCandidatParID(@PathVariable String id) {
		return candidatBusiness.rechercheCandidatParID(id);
	}
	

}
