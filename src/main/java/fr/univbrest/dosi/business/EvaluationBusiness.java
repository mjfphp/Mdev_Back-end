package fr.univbrest.dosi.business;

import java.math.BigInteger;
import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;

public interface EvaluationBusiness {

	// fonction qui ajoute une évaluation
	Evaluation AddEvaluation(Evaluation evaluation);
	
	// fonction qui retourne la liste des évaluations
	List<Evaluation> GetAllEvaluation();
	
	// fonction qui supprime toutes les évaluations
	void DeleteEvaluation(BigInteger idEvaluation);

	// fonction qui modifie une évaluation
	Evaluation UpdateEvaluation(Evaluation evaluation);
	
}