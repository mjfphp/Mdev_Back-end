package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.RubriqueEvaluation;

@Repository

public interface RubriqueEvaluationRepository extends CrudRepository<RubriqueEvaluation, Integer> {

	// retourne la liste des rubriques selon id evaluation et trie par ORDRE
	@Query(value = "SELECT * FROM rubrique_evaluation WHERE ID_EVALUATION=?1 ORDER BY ORDRE", nativeQuery = true)
    List<RubriqueEvaluation> GetRubriqueEvaluationByIDEvaluation(int evaluation);

}
