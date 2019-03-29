package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.repository.EvaluationRepository;

@Service
public class EvaluationBusinessJPA  implements EvaluationBusiness{
	
	EvaluationRepository evaluationRepository;

	@Autowired
	public void EvaluationBusiness(EvaluationRepository evaluationRepository) {
		this.evaluationRepository = evaluationRepository;
	}
	
	// fonction de creation de l'objet evaluation
	@Override
	public Evaluation AddEvaluation(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}
	
	// fonction qui supprime un objet evaluation
	@Override
	public void DeleteEvaluation(Evaluation eva) {
		
			evaluationRepository.delete(eva);	
	}

	// fonction qui retourne la liste des evaluations
	@Override
	public List<Evaluation> GetAllEvaluation(int idenseignant) {
			
			return (List<Evaluation>) evaluationRepository.findAllEvaluationByEnseignant(idenseignant);
	}
	
	// fonction qui retourne la liste des evaluations
	@Override
	public Evaluation UpdateEvaluation(Evaluation evaluation) {
		return this.evaluationRepository.save(evaluation);
	}
	
}
