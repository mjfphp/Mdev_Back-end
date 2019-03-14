package fr.univbrest.dosi.business;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.FormationRepository;

@Service
public class FormationBusinessJPA implements FormationBusiness{
	/*
	@Autowired
	private EntityManager em;*/
	
	@Autowired
	private FormationRepository formationRepository;

	@Override
	public Formation AddFormation(Formation formation) {
		return formationRepository.save(formation);
	}

	@Override
	public List<Formation> GetAllFormations() {
		List<Formation> formations = (List<Formation>) formationRepository.findAll();
		return formations;
	}

	@Override
	public Formation SearchFormationById(String idFormation) {
		return this.formationRepository.findOne(idFormation);
	}

	@Override
	public List<Promotion> PromotionByFormation(String idFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public List<Promotion> PromotionByFormation(String idFormation) {
		//return this.formationRepository.PromotionByFormation(idFormation);
		Query q = em.createNativeQuery("select p.CODE_FORMATION, p.ANNEE_UNIVERSITAIRE, p.NO_ENSEIGNANT, p.SIGLE_PROMOTION, p.NB_MAX_ETUDIANT, p.DATE_REPONSE_LP, p.DATE_REPONSE_LALP, p.DATE_RENTREE, p.LIEU_RENTREE, p.PROCESSUS_STAGE, p.COMMENTAIRE from promotion as p, formation as f where p.CODE_FORMATION = f.CODE_FORMATION and f.CODE_FORMATION = :idFormation");
		q.setParameter("username", idFormation);

	}*/

	
}
