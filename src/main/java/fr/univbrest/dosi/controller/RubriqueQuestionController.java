package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.RubriqueQuestion;
import fr.univbrest.dosi.business.RubriqueQuestionBusiness;

@CrossOrigin
@RestController
@RequestMapping("/RubriqueQuestions")
public class RubriqueQuestionController {
	
	private RubriqueQuestionBusiness business;

	@Autowired
	public RubriqueQuestionController(RubriqueQuestionBusiness business) {
		this.business = business;
	}
	
	// Get All Questions in Rubrique
	@RequestMapping(method = RequestMethod.GET)
	public List<RubriqueQuestion> GetAllRubriqueQuestion(){
		return business.GetAllRubriqueQuestions();
	}

	
	// Create a new Question in Rubrique
		@RequestMapping(method = RequestMethod.POST)
		public void createQuestion(@RequestBody RubriqueQuestion rubriqueQuestion) {
			business.createRubriqueQuestion(rubriqueQuestion);
		}

		// update a Question order
		@RequestMapping(method = RequestMethod.PUT)
		public ResponseEntity<?> updateRubriqueQuestion(@RequestBody RubriqueQuestion rubriqueQuestion) {
			 business.updateRubriqueQuestion(rubriqueQuestion);
			 return ResponseEntity.ok().build();
		}

		// Delete a Question in Rubrique 
		@RequestMapping(method = RequestMethod.DELETE)
		public ResponseEntity<?> deleteRubriqueQuestion(@RequestBody RubriqueQuestion rubriqueQuestion) {
			business.deleteRubriqueQuestion(rubriqueQuestion.getId());
			return ResponseEntity.ok().build();


		}
}
