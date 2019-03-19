package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Qualificatif;
@Repository
public interface QualificatifRepository extends CrudRepository<Qualificatif, Integer> {

	@Query(value = "select qualificatif.* from qualificatif where Maximal = ?1", nativeQuery = true)
	List<Qualificatif> findByMaximal(String maximal);
	@Query(value = "select qualificatif.* from qualificatif where Minimal = ?1", nativeQuery = true)
	List<Qualificatif> findByMinimal(String minimal);
	@Query(value = "SELECT qualificatif.* from qualificatif,reponse_question,question_evaluation WHERE qualificatif.ID_QUALIFICATIF= ?1 AND qualificatif.ID_QUALIFICATIF=question_evaluation.ID_QUALIFICATIF AND question_evaluation.ID_QUESTION=reponse_question.ID_QUESTION_EVALUATION", nativeQuery = true)
	List<Qualificatif> findIfIdQualificatifExistsInReponse(int idQualificatif);
}
