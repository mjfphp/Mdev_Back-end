package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.QuestionBusiness;

@RestController
@RequestMapping("/Questions")
public class QuestionController {

	private QuestionBusiness business;

	@Autowired
	public QuestionController(QuestionBusiness business) {
		this.business = business;
	}

	// fonction qui retourne la liste des questions
	@RequestMapping(method = RequestMethod.GET)
	public List<Question> getAllQuestions() {
		return business.GetAllQuestions();
	}

	// fonction qui cherche une question par Id
	@RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	public Question getQuestionById(@PathVariable("id") Long idQuestion) {
		return business.findQuestionById(idQuestion);
	}

	// fonction qui cherche une question par intitulé
	@RequestMapping(method = RequestMethod.GET, value = "/intitule/{intitule}")
	public List<Question> getQuestionByIntitule(@PathVariable("intitule") String intitule) {
		return business.findQuestionByIntitule(intitule);
	}

	// fonction qui cherche une question par type
	@RequestMapping(method = RequestMethod.GET, value = "/type/{type}")
	public List<Question> getQuestionByType(@PathVariable("type") String type) {
		return business.findQuestionByType(type);
	}

	// fonction qui ajoute une question
	@RequestMapping(method = RequestMethod.POST)
	public void createQuestion(@RequestBody Question question) {
		business.createQuestion(question);
	}

	// fonction qui modifie une question
	@RequestMapping(method = RequestMethod.PUT)
	public Question updateQuestion(@RequestBody Question question) {
		return business.updateQuestionById(question);
	}

	// fonction qui supprime une question
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteQualificatifById(@RequestBody Question question) {

		if (!business.findIfIdQuestionExistsInReponse(question.getIdQuestion())) {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("Contenu", "La Question est utilisée dans une reponse ");

			business.deleteQuestion(question.getIdQuestion());
			return (ResponseEntity<?>) ResponseEntity.ok().headers(responseHeaders).build();
		} else {
			business.deleteQuestion(question.getIdQuestion());
			return ResponseEntity.ok().build();

		}

	}

}