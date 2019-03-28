package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.RubriqueEvaluation;

@Repository

public interface RubriqueEvaluationRepository extends CrudRepository<RubriqueEvaluation, String> {

}
