package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.QuestionBusiness;

@RestController
@CrossOrigin
@RequestMapping("/Questions")
public class QuestionController {
	
	private QuestionBusiness business;

	@Autowired
	public QuestionController(QuestionBusiness business) {
		this.business = business;
	}

	
	 // Get All Questions
		@RequestMapping(method = RequestMethod.GET)
	    public List<Question> getAllQuestions() {
	        return business.GetAllQuestions();
	    }
		
		
		// Get Questions By Id
		@RequestMapping(method = RequestMethod.GET, value="/id/{id}")
	    public Question getQuestionById(@PathVariable("id") Long idQuestion) {
	        return business.findQuestionById(idQuestion);
	    }
		
		// Get Questions By Intitule
			@RequestMapping(method = RequestMethod.GET, value="/intitule/{intitule}")
		    public List<Question> getQuestionByIntitule(@PathVariable("intitule") String intitule) {
		        return business.findQuestionByIntitule(intitule);
		    }
			
		// Get Questions By Type
			@RequestMapping(method = RequestMethod.GET, value="/type/{type}")
			public List<Question> getQuestionByType(@PathVariable("type") String type) {
			    return business.findQuestionByType(type);
			}

	    // Create a new Question
	    @RequestMapping(method = RequestMethod.POST)
	    public void createQuestion(@RequestBody Question question) {
	        business.createQuestion(question);
	    }
	    
	    
	    // update a Question
	    @RequestMapping(method = RequestMethod.PUT)
	    public Question updateQuestion( @RequestBody Question question){
	    	return business.updateQuestionById(question);
	    }
	    
	 // Delete a Question By Id
	    @RequestMapping(method = RequestMethod.DELETE)
	    public String deleteQualificatifById(@RequestBody Question question) {
	    	
	    	if (business.findIfIdQuestionExistsInReponse(question.getIdQuestion())) {
	    		
	    	
	    		business.deleteQuestion(question.getIdQuestion());
	            return "La Question est supprimée";
	    	}
	    	else {
				return "La Question est utilisée dans une reponse ";
	  	
	    	}
	        
	    }

}
