package fr.univbrest.dosi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.business.EvaluationBusiness;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {
	
	// Declaration de notre EvaluationBusiness
	EvaluationBusiness business;
	
	// Faire la laison entre notre controller et l'Etudiantbusiness
	@Autowired
	public EvaluationController(EvaluationBusiness business) {
		this.business = business;
	}
	
	// fonction qui retourne la liste des �valuations
	@RequestMapping(method = RequestMethod.GET,value="{NoEnseignant}")
	
	public List<Evaluation> GetAllEvaluation(@PathVariable("NoEnseignant") int noenseignant ){

		return business.GetAllEvaluation(noenseignant);
	}
	
	// fonction qui ajoute une �valuation
	@RequestMapping(method = RequestMethod.POST)
	public Evaluation AddEvaluation(@RequestBody Evaluation v){
		return business.AddEvaluation(v);
	}
	
	// fonction qui supprime une �valuation
	@RequestMapping(value = "/delete/{IdEvaluation}", method = RequestMethod.DELETE)
	public void DeleteEvaluation(@RequestBody Evaluation Evaluation){
		business.DeleteEvaluation(Evaluation);
	}
	
	// fonction qui modifie une �valuation 
	@RequestMapping(method = RequestMethod.PUT)
	public Evaluation UpdateEvaluation(@RequestBody Evaluation evaluation) {
		return business.UpdateEvaluation(evaluation);
	}
}
