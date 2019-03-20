package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Question;;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	
	@Query(value = "select question.* from question where intitule = ?1", nativeQuery = true)
	List<Question> findByIntitule(String intitule);
	@Query(value = "select question.* from question where type = ?1", nativeQuery = true)
	List<Question> findByType(String type);
	@Query(value = "SELECT question.* from question,reponse_question,question_evaluation WHERE question.ID_QUESTION = ?1 AND question.ID_QUESTION=question_evaluation.ID_QUESTION AND question_evaluation.ID_QUESTION=reponse_question.ID_QUESTION_EVALUATION", nativeQuery = true)
	List<Question> findIfIdQuestionExistsInReponse(Long idQuestion);


}
