package fr.univbrest.dosi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Evaluation;

@Repository
public interface EvaluationRepository extends CrudRepository<Evaluation, Integer>{

	@Query(value = "SELECT evaluation.* FROM `evaluation` WHERE NO_ENSEIGNANT=?1 ", nativeQuery = true)
	List <Evaluation> findAllEvaluationByEnseignant(Integer noenseignant);

//	// fonction qui creer une evaluation 
//		@Transactional
//		@Modifying
//		@Query(value = "INSERT INTO `evaluation`(`NO_ENSEIGNANT`, `CODE_FORMATION`, `ANNEE_UNIVERSITAIRE`, `CODE_UE`, `CODE_EC`, `NO_EVALUATION`, `DESIGNATION`, `ETAT`, `PERIODE`, `DEBUT_REPONSE`, `FIN_REPONSE`) VALUES (:NO_ENSEIGNANT, :CODE_FORMATION, :ANNEE_UNIVERSITAIRE, :CODE_UE, :CODE_EC, :NO_EVALUATION, :DESIGNATION, :ETAT, :PERIODE, :DEBUT_REPONSE, :FIN_REPONSE) ", nativeQuery = true)
//		public void CreateEvaluation(
//				@Param("NO_ENSEIGNANT") int NO_ENSEIGNANT, 
//				@Param("NO_EVALUATION") int NO_EVALUATION,
//				@Param("CODE_FORMATION") String CODE_FORMATION,
//				@Param("ANNEE_UNIVERSITAIRE") String ANNEE_UNIVERSITAIRE,
//				@Param("CODE_UE") String CODE_UE,
//				@Param("CODE_EC") String CODE_EC,
//				@Param("DESIGNATION") String DESIGNATION,
//				@Param("ETAT") String ETAT,
//				@Param("PERIODE") String PERIODE,
//				@Param("DEBUT_REPONSE") Date DEBUT_REPONSE,
//				@Param("FIN_REPONSE") Date FIN_REPONSE);
	
	void deleteByidEvaluation(int idEvaluation);
	Evaluation findByidEvaluation(Integer idEvaluation);
	
	
}
