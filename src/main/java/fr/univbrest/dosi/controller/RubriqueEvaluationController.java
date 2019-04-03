package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.RubriqueEvaluationBusiness;

@RestController
@RequestMapping("/RubriqueEvaluation")

public class RubriqueEvaluationController {
	
	 RubriqueEvaluationBusiness rubriqueEvaluationBusiness;
	
	@Autowired
	public RubriqueEvaluationController(RubriqueEvaluationBusiness business) {
		this.rubriqueEvaluationBusiness = business;
	}

	
	@RequestMapping(method=RequestMethod.GET)
	public List<RubriqueEvaluation> GetALlRubriques(){
		return rubriqueEvaluationBusiness.GetALlRubriques();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{idEvaluation}")
	public List<RubriqueEvaluation> GetRubriqueEvaluation(@PathVariable int idEvaluation) {
		return rubriqueEvaluationBusiness.GetRubriqueEvaluation(idEvaluation);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void CreateRubriqueEvaluation(@RequestBody RubriqueEvaluation rubEval) {
		rubriqueEvaluationBusiness.CreateRubriqueEvaluation(rubEval); 
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void EditRubriqueEvaluation(@RequestBody RubriqueEvaluation rubEvalAmodifier) {
		rubriqueEvaluationBusiness.EditRubriqueEvaluation(rubEvalAmodifier); 
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idRubEval}")
	public void DeleteRubriqueEvaluation(@PathVariable int idRubEval) {
	   rubriqueEvaluationBusiness.DeleteRubriqueEvaluation(idRubEval);
	}
	
	
}
