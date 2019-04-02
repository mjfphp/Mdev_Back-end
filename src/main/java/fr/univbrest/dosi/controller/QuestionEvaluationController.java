package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.business.QuestionEvaluationBusiness;

@CrossOrigin
@RestController
@RequestMapping("/QuestionEvaluation")
public class QuestionEvaluationController {

	QuestionEvaluationBusiness business;

	@Autowired
	public QuestionEvaluationController(QuestionEvaluationBusiness business) {
		this.business = business;
	}

	// Get All Questions Evaluation in Rubrique
	@RequestMapping(method = RequestMethod.GET, value = "/{idRubriqueEvaluation}")
	public List<QuestionEvaluation> GetAllQuestionsEvaluationOnRubrique(
			@PathVariable("idRubriqueEvaluation") Long idRubriqueEvaluation) {
		return business.GetAllQuestionsEvaluationOnRubrique(idRubriqueEvaluation);
	}

	// Create a new Question Evaluation in Rubrique
	@RequestMapping(method = RequestMethod.POST)
	public void createQuestionEvaluation(@RequestBody QuestionEvaluation questionEvaluation) {
		business.createQuestionEvaluationOnRubrique(questionEvaluation);
	}

	// update a Question order in Rubrique
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateQuestionOrderOnRubrique(@RequestBody QuestionEvaluation questionEvaluation) {
		business.updateOrderQuestionEvaluationOnRubrique(questionEvaluation);
		return ResponseEntity.ok().build();
	}
	
	// update all Question order in Rubrique
		@RequestMapping(method = RequestMethod.PUT, value="/AllQuestion")
		public ResponseEntity<?> updateAllQuestionOrderOnRubrique(@RequestBody List<QuestionEvaluation> questionEvaluations) {
		for(QuestionEvaluation res : questionEvaluations ) {

			business.updateOrderQuestionEvaluationOnRubrique(res);
		}
			return ResponseEntity.ok().build();
		}


	// Delete a Question in Rubrique
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteQuestionEvaluationOnRubrique(@RequestBody QuestionEvaluation questionEvaluation) {
		business.deleteQuestionEvaluationOnRubrique(questionEvaluation.getIdQuestionEvaluation());
		return ResponseEntity.ok().build();

	}

}
