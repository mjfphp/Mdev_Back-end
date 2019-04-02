package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repository.RubriqueEvaluationRepository;

@Service

public class RubriqueEvaluationBusinessJPA  implements RubriqueEvaluationBusiness {
	
 RubriqueEvaluationRepository repos ;
	
	@Autowired
	public RubriqueEvaluationBusinessJPA(RubriqueEvaluationRepository repos) {
		this.repos = repos;
	}

	@Override
	public List<RubriqueEvaluation> GetALlRubriques() {
		// TODO Auto-generated method stub
		return (List<RubriqueEvaluation>) repos.findAll();
	}

	@Override
	public List<RubriqueEvaluation> GetRubriqueEvaluation(int evaluation) {
		// TODO Auto-generated method stub
		return repos.GetRubriqueEvaluationByIDEvaluation(evaluation);
	}

	@Override
	public void CreateRubriqueEvaluation(RubriqueEvaluation rubriqueevaluation) {
		// TODO Auto-generated method stub
		
		repos.save(rubriqueevaluation);

		
	}

	@Override
	public void EditRubriqueEvaluation(RubriqueEvaluation rubriqueevaluation) {
		// TODO Auto-generated method stub
		repos.save(rubriqueevaluation);

	}

	@Override
	public void DeleteRubriqueEvaluation(int idRubriqueevaluation) {
		// TODO Auto-generated method stub
		repos.delete(idRubriqueevaluation);

	}
	
	

}
