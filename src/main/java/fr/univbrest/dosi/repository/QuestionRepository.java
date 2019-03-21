package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.univbrest.dosi.bean.Question;;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

	@Query(value = "select question.* from question where intitule = ?1", nativeQuery = true)
	List<Question> findByIntitule(String intitule);

	@Query(value = "select question.* from question where type = ?1", nativeQuery = true)
	List<Question> findByType(String type);

	@Query(value = "SELECT question.* from question,reponse_question,question_evaluation WHERE question.ID_QUESTION = ?1 AND question.ID_QUESTION=question_evaluation.ID_QUESTION AND question_evaluation.ID_QUESTION=reponse_question.ID_QUESTION_EVALUATION", nativeQuery = true)
	List<Question> findIfIdQuestionExistsInReponse(Long idQuestion);

	
	// fonction qui créée une question 
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO question (TYPE, NO_ENSEIGNANT, ID_QUALIFICATIF, INTITULE) VALUES (:type,:idenseignant,:idqualif,:intitule)", nativeQuery = true)
	public void CreateQuestion(@Param("type") String type, @Param("idenseignant") int idenseignant,
			@Param("idqualif") Integer idqualif, @Param("intitule") String intitule);

	
	
	// fonction qui modifie une question 
	@Transactional
	@Modifying
	@Query(value = "UPDATE question q  SET q.TYPE=:type, q.NO_ENSEIGNANT=:idenseignant, q.ID_QUALIFICATIF=:idqualif, q.INTITULE= :intitule where q.ID_QUESTION=:idQuestion", nativeQuery = true)
	public 	void UpdateQuestionById(@Param("idQuestion") Long idQuestion, @Param("type") String type,
			@Param("idenseignant") int idenseignant, @Param("idqualif") Integer idqualif,
			@Param("intitule") String intitule);

}
