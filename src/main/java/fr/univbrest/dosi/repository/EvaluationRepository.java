package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Evaluation;

@Repository
public interface EvaluationRepository extends CrudRepository<Evaluation, Integer>{

	@Query(value = "SELECT * FROM evaluation WHERE NO_ENSEIGNANT=?1 ORDER BY NO_EVALUATION", nativeQuery = true)
	List <Evaluation> findAllEvaluationByEnseignant(int noenseignant);

	void deleteByidEvaluation(int idEvaluation);
	Evaluation findByidEvaluation(int idEvaluation);
	
	
}
