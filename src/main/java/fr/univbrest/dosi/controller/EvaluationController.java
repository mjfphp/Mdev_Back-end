package fr.univbrest.dosi.controller;

import java.math.BigInteger;
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
	
	// fonction qui retourne la liste des évaluations
	@RequestMapping(method = RequestMethod.GET)
	public List<Evaluation> GetAllEvaluation(){
		return business.GetAllEvaluation();
	}
	
	// fonction qui ajoute une évaluation
	@RequestMapping(method = RequestMethod.POST)
	public Evaluation AddEvaluation(@RequestBody Evaluation v){
		return business.AddEvaluation(v);
	}
	
	// fonction qui supprime une évaluation
	@RequestMapping(value = "/delete/{IdEvaluation}", method = RequestMethod.DELETE)
	public void DeleteEvaluation(@PathVariable("IdEvaluation") BigInteger IdEvaluation){
		business.DeleteEvaluation(IdEvaluation);
	}
	
	// fonction qui modifie une évaluation 
	@RequestMapping(method = RequestMethod.PUT)
	public Evaluation UpdateEvaluation(@RequestBody Evaluation evaluation) {
		return business.UpdateEvaluation(evaluation);
	}
}
