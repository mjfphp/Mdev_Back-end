package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import fr.univbrest.dosi.bean.QuestionEvaluation;

public interface QuestionEvaluationRepository extends CrudRepository<QuestionEvaluation, Long> {
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO `question_evaluation`(`ID_RUBRIQUE_EVALUATION`, `ID_QUESTION`, `ID_QUALIFICATIF`, `ORDRE`, `INTITULE`) VALUES (:idRubriqueEvaluation,:idQuestion,:idQualificatif,:ordre,:intitule)", nativeQuery = true)
	public void createQuestionEvaluationOnRubrique( @Param("idQuestion") long idQuestion, @Param("ordre") int ordre, @Param("intitule") String intitule,@Param("idQualificatif") long idQualificatif,@Param("idRubriqueEvaluation") long idRubriqueEvaluation);

	@Transactional
	@Modifying
	@Query(value = "UPDATE `question_evaluation` SET `ORDRE`=:ordre WHERE ID_QUESTION_EVALUATION=:idQuestionEvaluation ", nativeQuery = true)
	public 	void updateOrderQuestionEvaluationOnRubrique(@Param("idQuestionEvaluation") long idQuestionEvaluation,  @Param("ordre") int ordre);

	@Query(value = "SELECT question_evaluation.* from question_evaluation WHERE question_evaluation.ID_RUBRIQUE_EVALUATION= ?1 ORDER By question_evaluation.ORDRE", nativeQuery = true)
	List<QuestionEvaluation> GetAllQuestionsEvaluationOnRubrique(long  idRubriqueEvaluation);

	
}
