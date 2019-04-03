package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;

public interface EvaluationBusiness {

	// fonction qui ajoute une evaluation
	Evaluation AddEvaluation(Evaluation evaluation);
	
	// fonction qui retourne la liste des evaluations
	List<Evaluation> GetAllEvaluation(int noenseignant);
	
	// fonction qui supprime toutes les evaluations
	void DeleteEvaluation(Evaluation Evaluation);

	// fonction qui modifie une evaluation
	Evaluation UpdateEvaluation(Evaluation evaluation);
	
}