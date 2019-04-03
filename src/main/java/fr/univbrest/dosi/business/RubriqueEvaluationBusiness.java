package fr.univbrest.dosi.business;

import java.util.List;
import fr.univbrest.dosi.bean.RubriqueEvaluation;

public interface RubriqueEvaluationBusiness {
	
	public List<RubriqueEvaluation> GetALlRubriques();
	public List<RubriqueEvaluation> GetRubriqueEvaluation(int evaluation);
	public void CreateRubriqueEvaluation(RubriqueEvaluation rubriqueevaluation);
	public void EditRubriqueEvaluation(RubriqueEvaluation rubriqueevaluation);
	public void DeleteRubriqueEvaluation(int idRubriqueevaluation);



}
