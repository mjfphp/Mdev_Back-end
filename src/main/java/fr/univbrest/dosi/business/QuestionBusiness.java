package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Question;;

public interface QuestionBusiness {
	
	//la recuperation de toutes les questions
	public List<Question> GetAllQuestions();

	//la suppression d'une question par l'Identifiant
	void deleteQuestion(Long idQuestion);

	//la création d'une question
	public Question createQuestion(Question question);
	
	//la recherche d'une question par l'identifiant 
	public Question findQuestionById(Long idQuestion );
	
	//la recherche des questions par l'intitulé
	public List<Question> findQuestionByIntitule(String intitule);
	
	//la recherche des questions par Type
	public List<Question> findQuestionByType(String type);
	
	//la recherche par l'identifiant si la question existe dans une reponse 
	public boolean findIfIdQuestionExistsInReponse(Long idQuestion);
	
	//la modification d'une question
	public Question updateQuestionById(Question question);
	

}
