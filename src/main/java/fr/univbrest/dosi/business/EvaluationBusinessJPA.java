package fr.univbrest.dosi.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.repository.EnseignantRepository;
import fr.univbrest.dosi.repository.EvaluationRepository;

@Service
public class EvaluationBusinessJPA implements EvaluationBusiness {

	EvaluationRepository evaluationRepository;
	EnseignantRepository enseignantRepository;
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

//		Enseignant e = new Enseignant();
//		Enseignant e1 = new Enseignant();
//
//        e.setNoEnseignant(idenseignant) ;
//        e1=enseignantRepository.findOne(idenseignant);        
//		return evaluationRepository.findByEnseignant(e1);

		return evaluationRepository.findAllEvaluationByEnseignant(idenseignant);
		// return (List<Evaluation>) evaluationRepository.findAll();
		

	}

	// fonction qui retourne la liste des evaluations
	@Override
	public Evaluation UpdateEvaluation(Evaluation evaluation) {
		return this.evaluationRepository.save(evaluation);
	}

}
