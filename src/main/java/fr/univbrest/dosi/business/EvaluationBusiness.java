package fr.univbrest.dosi.business;

import java.math.BigInteger;
import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;

public interface EvaluationBusiness {

	// fonction qui ajoute une �valuation
	Evaluation AddEvaluation(Evaluation evaluation);
	
	// fonction qui retourne la liste des �valuations
	List<Evaluation> GetAllEvaluation();
	
	// fonction qui supprime toutes les �valuations
	void DeleteEvaluation(BigInteger idEvaluation);

	// fonction qui modifie une �valuation
	Evaluation UpdateEvaluation(Evaluation evaluation);
	
}