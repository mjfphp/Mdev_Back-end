package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Question;;

public interface QuestionBusiness {
	
	
	public List<Question> GetAllQuestions();


	void deleteQuestion(Long idQuestion);


	public Question createQuestion(Question question);
	
	public Question findQuestionById(Long idQuestion );
	
	public List<Question> findQuestionByIntitule(String intitule);
	
	public List<Question> findQuestionByType(String type);
	
	public boolean findIfIdQuestionExistsInReponse(Long idQuestion);
	
	public Question updateQuestionById(Question question);
	

}
