package fr.univbrest.dosi.business;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
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

		 Enseignant e = new Enseignant();
			e = evaluation.getEnseignant();
			int NO_ENSEIGNANT = e.getNoEnseignant();
			int NO_EVALUATION = evaluation.getNoEvaluation();
			ElementConstitutif ec = new ElementConstitutif();
			ElementConstitutifPK ecpk = new ElementConstitutifPK();

			ec = evaluation.getElementConstitutif();
			ecpk = ec.getId();
			String CODE_UE = ecpk.getCodeUe();
			String CODE_EC = ecpk.getCodeEc();

			Promotion p = new Promotion();
			PromotionPK ppk = new PromotionPK();
			p = evaluation.getPromotion();
			ppk = p.getId();
			String CODE_FORMATION = ppk.getCodeFormation();
			String ANNEE_UNIVERSITAIRE = ppk.getAnneeUniversitaire();

			String DESIGNATION = evaluation.getDesignation();
			String ETAT = evaluation.getEtat();
			String PERIODE = evaluation.getPeriode();
			Date DEBUT_REPONSE = evaluation.getDebutReponse();
			Date FIN_REPONSE = evaluation.getFinReponse();

			evaluationRepository.CreateEvaluation(NO_ENSEIGNANT,NO_EVALUATION, CODE_FORMATION, ANNEE_UNIVERSITAIRE,
					CODE_UE, CODE_EC, DESIGNATION, ETAT, PERIODE, DEBUT_REPONSE, FIN_REPONSE);
		
		
			return evaluation;

		//return evaluationRepository.save(evaluation);

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
