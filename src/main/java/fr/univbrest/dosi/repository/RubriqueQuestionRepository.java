package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.bean.RubriqueQuestion;
import fr.univbrest.dosi.bean.RubriqueQuestionPK;

public interface RubriqueQuestionRepository extends CrudRepository<RubriqueQuestion, RubriqueQuestionPK> {
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO `rubrique_question`(`ID_RUBRIQUE`, `ID_QUESTION`, `ORDRE`) VALUES (:idRubrique,:idQuestion,:ordre)", nativeQuery = true)
	public void CreateRubriqueQuestion(@Param("idRubrique") long idRubrique, @Param("idQuestion") long idQuestion, @Param("ordre") int ordre);

	@Transactional
	@Modifying
	@Query(value = "UPDATE `rubrique_question` SET `ORDRE`=:ordre WHERE ID_RUBRIQUE=:idRubrique and ID_QUESTION=:idQuestion", nativeQuery = true)
	public 	void UpdateQuestionById(@Param("idRubrique") Long idRubrique, @Param("idQuestion") long idQuestion, @Param("ordre") int ordre);

	@Query(value = "SELECT qualificatif.* from qualificatif,reponse_question,question_evaluation WHERE qualificatif.ID_QUALIFICATIF= ?1 AND qualificatif.ID_QUALIFICATIF=question_evaluation.ID_QUALIFICATIF AND question_evaluation.ID_QUESTION=reponse_question.ID_QUESTION_EVALUATION", nativeQuery = true)
	List<RubriqueQuestion> GetAllRubriqueQuestion(long  idQualificatif);
}
