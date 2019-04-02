package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repository.QualificatifRepository;
import fr.univbrest.dosi.repository.QuestionRepository;

@Service
public class QuestionBusinessJPA implements QuestionBusiness {

	QuestionRepository questionRepository;

	QualificatifRepository qualificatifRepository;

	@Autowired
	public QuestionBusinessJPA(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	//la recuperation de toutes les questions
	@Override
	public List<Question> GetAllQuestions() {
		// TODO Auto-generated method stub
		return (List<Question>) questionRepository.findAll();
	}

	//la suppression d'une question par l'Identifiant
	@Override
	public void deleteQuestion(Long idQuestion) {
		questionRepository.delete(idQuestion);

	}
	
	//la création d'une question
	@Override
	public void createQuestion(Question question) {
		 questionRepository.save(question);
	}

	//la recherche d'une question par l'identifiant 
	@Override
	public Question findQuestionById(Long idQuestion) {
		// TODO Auto-generated method stub
		return questionRepository.findOne(idQuestion);
	}

	//la recherche des questions par l'intitulé
	@Override
	public List<Question> findQuestionByIntitule(String intitule) {
		// TODO Auto-generated method stub
		return questionRepository.findByIntitule(intitule);
	}

	//la recherche des questions par Type
	@Override
	public List<Question> findQuestionByType(String type) {
		// TODO Auto-generated method stub
		return questionRepository.findByType(type);
	}

	//la recherche par l'identifiant si la question existe dans une reponse 
	@Override
	public boolean findIfIdQuestionExistsInReponse(Long idQuestion) {
		// TODO Auto-generated method stub
		return questionRepository.findIfIdQuestionExistsInReponse(idQuestion).isEmpty();
	}

	//la modification d'une question
	@Override
	public Question updateQuestionById(Question question) {
		// TODO Auto-generated method stub
		questionRepository.UpdateQuestionById(question.getIdQuestion(), question.getQualificatif().getIdQualificatif(), question.getIntitule());

		return question;
	}

}
